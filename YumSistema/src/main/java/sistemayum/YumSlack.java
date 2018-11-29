/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemayum;

import com.github.seratch.jslack.*;
import com.github.seratch.jslack.api.model.Attachment;
import com.github.seratch.jslack.api.webhook.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YumSlack {

    //lista estática, qualquer obj=new YumSlack(); vai acessar compartilhadamente os mesmos anexos.
    private static List<Attachment> listAttachs = new ArrayList<>();

    private static final String WebHookUrl = "https://hooks.slack.com/services/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";

    public static void Mensagem(String text) {
        Payload payload = Payload.builder()
                .channel("#random")
                .text(text)
                .build();
        Slack slack = Slack.getInstance();
        try {
            WebhookResponse response = slack.send(WebHookUrl, payload);
            // response.code, response.message, response.body
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    private static List<Attachment> anexarImagemDoComponente(String mensagem, OpcaoDeComponente opcao, boolean isAlarmante){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String corDoNivelDoAlerta=(isAlarmante)?"danger":"warning";
        List<Attachment> anexo=new ArrayList<>();
            anexo.add(Attachment.builder()
                    .msgUnfurl(true)
                    .fallback("Notificação AVISO").title("ALERTA "+opcao.getDescr()).text(mensagem)//CPU->RAM->HDD(SDD)
                    .imageUrl(opcao.getUrlImage())
                    .footer("Data do alerta: " + dateFormat.format(date))
                    .color(corDoNivelDoAlerta)
                    .build());
          return anexo;
    }
    
    public static void Alerta(String mensagem, OpcaoDeComponente opcao, boolean isAlarmante) {
        
        Payload payload = Payload.builder()
                .channel("#random")
                .attachments(anexarImagemDoComponente(mensagem,opcao,isAlarmante))
                .build();
        Slack slack = Slack.getInstance();  
        try {
            WebhookResponse response = slack.send(WebHookUrl, payload);
        } catch (IOException ex) {
            Logger.getLogger(YumSlack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
