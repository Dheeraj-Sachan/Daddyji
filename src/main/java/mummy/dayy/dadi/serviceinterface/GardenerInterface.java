package mummy.dayy.dadi.serviceinterface;

import mummy.dayy.dadi.model.Gardner;

import java.util.Collection;

public interface GardenerInterface {
    Collection<Gardner> getAllGardener();
    Gardner getOneGardener(int gId);
    String putGardner(Gardner gardner);
    String postGardner(Gardner gardner);
    String deleteGardner(int gId);
}
