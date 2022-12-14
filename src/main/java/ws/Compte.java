package ws;


import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Compte {
    private int code ;
    private double solde ;

    public Compte() {
    }

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + getCode()+
                ", solde=" + getSolde() +
                '}';
    }
}
