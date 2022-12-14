import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.ArrayList;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueServiceService().getBanqueServicePort();
        System.out.println(stub.convertEuroDH(1100));
        Compte cp = stub.getCompte(15);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        List<Compte> comptes = stub.getComptes();
        for (Compte compte: comptes )
        {
            System.out.println("Numero de compte : "+compte.getCode()+" , solde :  "+compte.getSolde());
        }


    }
}
