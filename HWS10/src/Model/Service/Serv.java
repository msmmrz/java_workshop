package Model.Service;

import Model.Entity.Enti;
import Model.Repository.Repo;

public class Serv {

    private Serv(){};
    private static Serv serv = new Serv();
    public static Serv getInstance(){
        return serv;
    }
    public void save(Enti enti) throws Exception {
        try (Repo repo = new Repo()) {
            repo.insert(enti);
            repo.commit();
        }
    }
}
