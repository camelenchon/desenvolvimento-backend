@Component
public class NotificadorSMS implements Notificador{

    @Override
    public void notificarCliente(String mensagem){
        System.out.printf("Cliente foi notificado via SMS com a mensagem: %s\n", mensagem);
    }
    
}
