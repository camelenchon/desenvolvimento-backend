@Component
public class NotificadorWhatsapp implements Notificador {

       
    @Override
     public void notificarCliente (String mensagem) {
        System.out.println("Cliente notificado via Whatsapp: " + mensagem);
     }
     
}
