import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        // 1. Créer un objet de type BanqueService (proxy) middleWare
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversion(100));
        Compte c = stub.getCompte(1);
        System.out.println(c.getCode() + " " + c.getSolde());
    }
}
