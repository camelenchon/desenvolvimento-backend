import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       NotificadorService notificadorService = new NotificadorService(List.of(new NotificadorEmail(), new NotificadorSMS()));
    
       notificadorService.notificar("seu pedido ja esta sendo processado");
    }
}
