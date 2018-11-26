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

    private static List<Attachment> listAttachs = new ArrayList<>();
    public YumSlack() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
        try {
            Attachment attachment, attachment2, attachment3;
            attachment = Attachment.builder()
                    .msgUnfurl(true)
                    .fallback("Notificação AVISO").title("ALERTA").text("CPU COM PROBLEMAS </br>")
                    .imageUrl("https://www.informationq.com/wp-content/uploads/2016/06/CPU.jpg")
                    .footer("Data do alerta:" + dateFormat.format(date) + " | Urgencia:" + "Alta" + " | Impacto:" + "Baixo")
                    .color("danger")
                    .build();
            attachment2 = Attachment.builder()
                    .msgUnfurl(true)
                    .fallback("Notificação AVISO").title("ALERTA").text("RAM COM PROBLEMAS")
                    .imageUrl("https://linustechtips.com/main/uploads/monthly_2017_08/large.s-l1000.jpg.73ad2806e37e829650a6fdf4fdd6257d.jpg")
                    .footer("Data do alerta:" + dateFormat.format(date) + " | Urgencia:" + "Alta" + " | Impacto:" + "Baixo")
                    .color("danger")
                    .build();
            attachment3 = Attachment.builder()
                    .msgUnfurl(true)
                    .fallback("Notificação AVISO").title("ALERTA").text("HDD(SDD) COM PROBLEMAS")
                    .imageUrl("http://images10.newegg.com/ProductImage/22-826-022-02.jpg")
                    .footer("Data do alerta:" + dateFormat.format(date) + " | Urgencia:" + "Alta" + " | Impacto:" + "Baixo")
                    .color("danger")
                    .build();
        listAttachs.add(attachment);
        listAttachs.add(attachment2);
        listAttachs.add(attachment3);
        }catch(Exception ex) {
            System.out.println("DEU RUIM!");
            ex.printStackTrace();
        }
    }

    private static final String WebHookUrl = "https://hooks.slack.com/services/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";
    private static final int CPU_OPTION=0;
    private static final int RAM_OPTION=1;
    private static final int HD_OPTION=2;
    public void Mensagem(String text) {
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
    
    private static List<Attachment> anexarImagemDoComponente(String mensagem,int opcao_componente,boolean isAlarmante){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String[] imagensUrl=new String[]{
        "https://www.informationq.com/wp-content/uploads/2016/06/CPU.jpg"
        ,"https://linustechtips.com/main/uploads/monthly_2017_08/large.s-l1000.jpg.73ad2806e37e829650a6fdf4fdd6257d.jpg"
        ,"http://images10.newegg.com/ProductImage/22-826-022-02.jpg"
        };
        String corDoNivelDoAlerta=(isAlarmante)?"danger":"warning";
        List<Attachment> anexo=new ArrayList<>();
            anexo.add(Attachment.builder()
                    .msgUnfurl(true)
                    .fallback("Notificação AVISO").title("ALERTA").text(mensagem)//CPU->RAM->HDD(SDD)
                    .imageUrl(imagensUrl[opcao_componente])
                    .footer("Data do alerta:" + dateFormat.format(date) + " | Urgencia:" + "Alta" + " | Impacto:" + "Baixo")
                    .color(corDoNivelDoAlerta)
                    .build());
          return anexo;
    }
    public static void Alerta(String mensagem,int opcao_componente,boolean isAlarmante) {
        
        Payload payload = Payload.builder()
                .channel("#random")
                .attachments(anexarImagemDoComponente(mensagem,opcao_componente,isAlarmante))
                .build();
        Slack slack = Slack.getInstance();  
        try {
            WebhookResponse response = slack.send(WebHookUrl, payload);
        } catch (IOException ex) {
            Logger.getLogger(YumSlack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void AlertaHD(String mensagem) {
        Payload payload = Payload.builder()
                .channel("#random")
                .attachments(listAttachs.subList(2, 3))
                .build();
        Slack slack = Slack.getInstance();  
        try {
            WebhookResponse response = slack.send(WebHookUrl, payload);
        } catch (IOException ex) {
            Logger.getLogger(YumSlack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void AlertaRAM(String mensagem) {
        Payload payload = Payload.builder()
                .channel("#random")
                .attachments(listAttachs.subList(1, 2))
                .build();
        Slack slack = Slack.getInstance();  
        try {
            WebhookResponse response = slack.send(WebHookUrl, payload);
// response.code, response.message, response.body^
        } catch (IOException ex) {
            Logger.getLogger(YumSlack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void AlertaCPU(String mensagem) {
        Payload payload = Payload.builder()
                .channel("#random")
                .text(mensagem)
                .attachments(listAttachs.subList(0, 1))
                .build();
        System.out.println(listAttachs.subList(0, 1));
        System.out.println(listAttachs.subList(1, 2));
        System.out.println(listAttachs.subList(2, 3));
        Slack slack = Slack.getInstance();  
        try {
            WebhookResponse response = slack.send(WebHookUrl, payload);
// response.code, response.message, response.body^
        } catch (IOException ex) {
            Logger.getLogger(YumSlack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
