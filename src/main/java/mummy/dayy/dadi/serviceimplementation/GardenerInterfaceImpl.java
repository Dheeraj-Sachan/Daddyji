package mummy.dayy.dadi.serviceimplementation;

import mummy.dayy.dadi.dao.GardenerDao;
import mummy.dayy.dadi.model.Gardner;
import mummy.dayy.dadi.serviceinterface.GardenerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GardenerInterfaceImpl implements GardenerInterface {
    @Autowired
    GardenerDao gardenerDao;
    @Override
    public Collection<Gardner> getAllGardener() {
        return gardenerDao.getAllEmployee();
    }

    @Override
    public Gardner getOneGardener(int gId) {
        return gardenerDao.getOneGardener(gId);
    }

    @Override
    public String putGardner(Gardner gardner) {
        return gardenerDao.putGardener(gardner);
    }

    @Override
    public String postGardner(Gardner gardner) {
        return gardenerDao.postGardener(gardner);
    }

    @Override
    public String deleteGardner(int gId) {
        return gardenerDao.deleteGardener(gId);
    }
}
