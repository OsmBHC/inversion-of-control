package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {
    public double getData() {
        System.out.println("Version web service");
        double t = 11;
        return t;
    }
}
