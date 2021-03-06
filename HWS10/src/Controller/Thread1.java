package Controller;

import Model.Entity.Enti;
import Model.Service.Serv;

import java.util.List;

public class Thread1 extends Thread {
    private List<Enti> entis;

    public Thread1(List<Enti> entis) {
        this.entis = entis;
    }

    @Override
    public void run() {
        for (Enti entity : entis) {
            try {
                Serv.getInstance().save(entity);
            } catch (Exception e) {
                System.out.println("failed to save " + e.getMessage());
            }
        }

    }
}
