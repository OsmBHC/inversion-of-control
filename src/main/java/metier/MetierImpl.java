package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")

public class MetierImpl implements IMetier {
    // Couplage faible
    private IDao dao;

    // Constructeur par défaut nécessaire pour l'instanciation dynamique
    public MetierImpl() {
    }

    @Autowired
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
