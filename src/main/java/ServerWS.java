import jakarta.xml.ws.Endpoint;
import ws.BanqueService;
import ws.Compte;

public class ServerWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web service déployé ");

    }
}
