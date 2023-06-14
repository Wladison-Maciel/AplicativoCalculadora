package br.edu.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import javax.mail.*;
//import javax.mail.internet.*;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SimpleSend {
    public void envioSimples(String nomeRemetente, String assunto, String mensagem, String destinatario) {
        try {
            //ModeloEmail me = new ModeloEmail();
            String host = "smtp.gmail.com";
            String usuario = "rmscavalcante@gmail.com";
            String senha = "Project2501&Re-L&B166er*";
            String remetente = "rmscavalcante@gmail.com";
            //me.setAssunto(assunto);
            //me.setMensagem(mensagem);
            boolean sessionDebug = true;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(remetente, nomeRemetente));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            msg.setSubject(assunto);
            msg.setSentDate(new Date());
            msg.setContent(mensagem, "text/html;charset=UTF-8");

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, usuario, senha);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();

            System.out.println("Enviado com Sucesso");
        } catch (MessagingException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao enviar email. \nVerifique a sua conexão..." + ex);
        } catch (UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null, "Destinatários Inválidos" + ex);
        }
    }
}
