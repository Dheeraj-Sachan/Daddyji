package mummy.dayy.dadi.dao;

import mummy.dayy.dadi.model.Gardner;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class GardenerDao {
    static Map<Integer, Gardner> map;

    static {
        map = new HashMap() {
            {
                put(1, new Gardner(1, "Dheeraj", "Army School"));
                put(2, new Gardner(2, "Vivek Manager", "Army School"));
                put(3, new Gardner(3, "Anjana", "Proud School"));

            }
        };
    }

    public Collection<Gardner> getAllEmployee() {
        return this.map.values();
    }

    public Gardner getOneGardener(int gId) {
        return map.get(gId);
    }

    public String putGardener(Gardner gardner) {
        map.put(gardner.getGID(), gardner);
        return "It has been inserted";
    }

    public String postGardener(Gardner gardner) {
        map.put(gardner.getGID(), gardner);
        return "It has been inserted";
    }

    public String deleteGardener(int gId) {
        map.remove(gId);
        return "It has been deleted";
    }
}
