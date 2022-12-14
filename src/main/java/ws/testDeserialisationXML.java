package ws;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class testDeserialisationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(BanqueService.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        BanqueService banque =(BanqueService) unmarshaller.unmarshal(new File("comptes.xml"));
        for(Compte c : banque.comptes){
            System.out.println(c.toString());
        }
    }
}
