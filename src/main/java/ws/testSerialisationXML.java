package ws;

import jakarta.xml.bind.JAXB;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.jar.JarException;

public class testSerialisationXML {
    public static void main(String[] args) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(BanqueService.class);
        BanqueService banque = new BanqueService();
        banque.comptes.add(new Compte(10,5900));
        banque.comptes.add(new Compte(20,11090));
        banque.comptes.add(new Compte(15,598));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(banque,new File("comptes.xml"));
    }
}
