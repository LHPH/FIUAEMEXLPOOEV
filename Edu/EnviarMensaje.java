package Edu;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarMensaje {
    
    static String usuarioEmisorMensaje = "sasukepainlh@hotmail.com";
    //password real de la cuenta usuarioEmisorMensaje
    static String passwordEmisorMensaje = "crepusculo";
    //Dirección del servidor para este protocolo (SMTP)
    static String smtpHost = "smtp.live.com";
   // static String smtpHost = "65.55.172.214";
    //Puerto que se usará en el servidor.
    static String smtpPuerto = "587";
    //Indicamos que vamos a auntenticarnos en el servidor
    static String smtpAuth = "true";
    static Properties props = new Properties();
    
    public static void enviarMensaje(){
        //Asiganamos algunas propiedades
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPuerto);
        props.put("mail.smtp.auth", smtpAuth);
        props.put("mail.smtp.user",usuarioEmisorMensaje);
        /* El puerto 587 normalmente indica que se va a usar TLS o SSL. En las propiedades del mail debes poner 
         * mail.smtp.ssl.enable como true. Aqui hay una lista de las propiedades para javamail.*/
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.starttls.required","true");
        props.setProperty("mail.smtps.starttls.enable","true");
        
        //Se obtiene una sesión con las propiedades anteriormente que hemos
        //guardado en -props-
        Session sesion = Session.getDefaultInstance(props, null);
       // sesion.setDebug(true);
       
        try {
            //Empezamos a crear el e-mail
            MimeMessage mensaje = new MimeMessage(sesion);
            // Emisor del mensaje
            mensaje.setFrom(new InternetAddress(usuarioEmisorMensaje));
           
            //En este caso tenemos uno o varios receptores
           /* Address [] receptores = new Address []{
                new InternetAddress ("sasukepainlh@hotmail.com")
                //vemos que nuestros contactos pueden ser de distintos servicios
                //Hotmail, Gmail, etc
            };*/
            //Agregamos la lista de los receptores.
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress("sasukepainlh@hotmail.com")); //receptores
            //Rellenamos los campos necesarios de un e-mail
            //El asunto
            mensaje.setSubject("Mensajes desde Java con una cuenta de Hotmail");
            //Aquí va el contenido del mensaje
            mensaje.setText("Hola Mundo");
            //Ahora vamos a enviar el mensaje
            Transport t = sesion.getTransport("smtp");
            //Pero antes tenemos que auntenticarnos con una cuenta real de
            //Hotmail
            t.connect(usuarioEmisorMensaje, passwordEmisorMensaje);
            t.sendMessage(mensaje,mensaje.getAllRecipients()); //mensaje.getRecipients(Message.RecipientType.TO)
            t.close();
        }catch(MessagingException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        EnviarMensaje.enviarMensaje();
        System.out.println("Hecho");
    }
}

