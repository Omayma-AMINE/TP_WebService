package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@WebService @XmlRootElement
public class BanqueService {
    public List<Compte> comptes = new ArrayList<>();
    @WebMethod (operationName = "convertEuroDH")
    public double conversion(@WebParam(name = "montant") double mt ){

        return mt*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code")int code){

        return new Compte(code,Math.random()*1500);
    }
    @WebMethod
    public List<Compte> getComptes(){

        comptes.add(new Compte(1,15000));
        comptes.add(new Compte(2,98000));
        comptes.add(new Compte(3,500));
        comptes.add(new Compte(4,7400));
        comptes.add(new Compte(5,4390));

        return comptes ;
    }


}
