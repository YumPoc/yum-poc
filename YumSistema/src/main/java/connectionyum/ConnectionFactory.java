package connectionyum;

import interfaceyum.YumAPP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sistemayum.Log;

public class ConnectionFactory {

    private String connectionUrl;
    YumAPP yumApp = new YumAPP();

    public Connection getConexao() throws ClassNotFoundException {

        connectionUrl
                = "jdbc:sqlserver://guilherme-faria.database.windows.net:1433;"
                + "database=yum_poc;"
                + "user=guigafaria@guilherme-faria;password=Abcd@123;"
                + "encrypt=true;trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            
            Log.gerarLog("Falha ao se conectar");
            throw new RuntimeException(e);
        }

    }

}
