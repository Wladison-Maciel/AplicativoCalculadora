package br.edu.util;

//import java.net.PasswordAuthentication;

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

public class EnviaEmail {
    public static void enviarEmail(String destinatario, String assunto, String corpo) {
        // Configurações do servidor de e-mail
        String host = "smtp.gmail.com"; // substitua pelo host do seu servidor de e-mail
        String port = "465"; // substitua pela porta do seu servidor de e-mail
        String usuario = "[Substitua aqui]"; // substitua pelo seu endereço de e-mail
        String senha = "[Substitua aqui]"; // substitua pela sua senha de e-mail
        
        
        // Configurações do cliente de e-mail
        Properties props = new Properties();
        
        props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        // Autenticação do cliente de e-mail
        Authenticator autenticador;
        autenticador = new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(usuario, senha);
            }
        };

        // Criação da sessão de e-mail
        Session session = Session.getInstance(props, autenticador);
        
        // Usado para depurar problemas de SMTP
        session.setDebug (true);

        try {
            // Criação da mensagem de e-mail
            Message mensagem = new MimeMessage(session);
            mensagem.setFrom(new InternetAddress(usuario));
            mensagem.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            mensagem.setSubject(assunto);
            mensagem.setText(corpo);

            // Envio do e-mail
            Transport.send(mensagem);

            System.out.println("E-mail enviado com sucesso!");
        } 
        
        catch (MessagingException e) {
            System.out.println("ERRO ao enviar o e-mail: " + e.getMessage());
        }
    }
}
