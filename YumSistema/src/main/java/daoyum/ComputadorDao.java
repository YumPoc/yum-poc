package daoyum;

import sistemayum.*;
import connectionyum.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComputadorDao {
  private Connection conexao ;
  
  public ComputadorDao() throws ClassNotFoundException{
      this.conexao = new ConnectionFactory().getConnection();
  }
  
  public void adiciona(InfoGerais gerais){
      String insertComputadores = "INSERT INTO computadores_gerais (id_computador, numero_ip, nome_computador, "
              + "endereco_mac, setor_hospital, tipo_processador, tipo_sistema_operacional, tamanho_hd, "
              + "tamanho_ram, cod_cliente)"
              + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, 6)";//Ta dando problema em inserir o CodClient   
      try{
          PreparedStatement insertComputador = conexao.prepareStatement(insertComputadores);
          //seta ps valores
          insertComputador.setInt(1, gerais.getIdComputador());
          insertComputador.setString(2, gerais.getNumeroIp());
          insertComputador.setString(3, gerais.getNomeComputador());
          insertComputador.setString(4, gerais.getEnderecoMac());
          insertComputador.setString(5, gerais.getSetorHospital());
          insertComputador.setString(6, gerais.getTipoProcessador());
          insertComputador.setString(7, gerais.getSistemaOperacional());
          insertComputador.setString(8, gerais.getTamanhoHd());
          insertComputador.setString(9, gerais.getTamanhoRam());
          //insertComputador.setInt(10, gerais.getCodCliente());//Ta dando problema em inserir o CodClient   
        
          System.out.println(insertComputador.toString());
          insertComputador.execute();          
          insertComputador.close();
      }  catch (SQLException e) {
	throw new RuntimeException(e);}
  }
}
