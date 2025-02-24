package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        // Injection des dépendances par instanciation statique
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d); // Injection par le constructeur
        // metier.setDao(d); // Injection par le setter
        System.out.println("RES = "+metier.calcul());
    }
}
