import java.util.List;
@Component
public class NotificadorService {
    // NOTIFICAR DE FORMA SIMPLES
    // private Notificador notificador;

    // public NotificadorService(Notificador notificador){
    //     this.notificador = notificador;
    // }

    // public void notificar(String mensagem){
    //     notificador.notificarCliente(mensagem);
    // }

    // NOTIFICAR UMA LISTA DE COISAS:

    private List<Notificador> notificadores;
    private CalendarioService calendiarioService;


    public NotificadorService(List<Notificador> notificadores, CalendarioService CalendarioService){
        this.notificadores = notificadores;
        this.calendiarioService = calendiarioService;
    }

    public void notificar(String mensagem){
        if(calendiarioService.vericarDiaUtil(){
            
        })
        for (Notificador notificador : notificadores) {
            notificador.notificarCliente(mensagem);
        }
    }

}// CONTAINER DE INJECAO DE SPRING 
// @Component -> isso vai ser um componente gerenciavel pelo Spring
// @Autowired -> vai injetar um novo contrutor de alguma forma pelo Spring