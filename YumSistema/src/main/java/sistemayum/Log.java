package sistemayum;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author YumPoc
 */
public class Log {

    public static JTextArea areaDeTexto;

    public static void setAreaDeTexto(JTextArea areaDeTexto) {
        Log.areaDeTexto = areaDeTexto;
    }

    public static void escreveLogNoPainel(String texto) {
        areaDeTexto.setText(areaDeTexto.getText() + "\n" + texto);
    }

    public static void gerarLog(String texto) {

        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
        String dataFormatada = formatar.format(new Date());
        File arquivo = new File("Log\\" + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) + ".txt");
        File diretorio = new File("Log");
        try {
            if (!diretorio.exists()) {
                diretorio.mkdir();
                diretorio.setReadable(true, true);
            }
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                arquivo.setReadable(true, true);
            }
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<String> lista = new ArrayList<>();
        lista.add(dataFormatada + " -> " + texto);
        //Para Escrever no Painel
        escreveLogNoPainel(texto);
        try {

            Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
