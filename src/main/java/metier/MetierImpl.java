package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    // Couplage faible
    private IDao dao;

    // Constructeur par défaut nécessaire pour l'instanciation dynamique
    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return res;
    }

    // Pour injecter dans la variable dao un objet d'une classe qui implémente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
