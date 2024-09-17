@Component
public class NotificadorEmail implements Notificador {
   
    @Override
    public void notificarCliente(String mensagem){
        System.out.printf("Cliente foi notificado via EMAIL com a mensagem: %s \n", mensagem);
    }
}
