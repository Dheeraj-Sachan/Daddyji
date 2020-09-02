package mummy.dayy.dadi.controller;

import mummy.dayy.dadi.model.Gardner;
import mummy.dayy.dadi.serviceimplementation.GardenerInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping
@RestController
public class GardenerController {
    @Autowired
    GardenerInterfaceImpl gardenerInterface;


    @GetMapping("/getAllGardener")
    public Collection<Gardner> getAllGardener() {
        return gardenerInterface.getAllGardener();
    }

    @GetMapping("/getAllGardener/{gId}")
    public Gardner getOneGardener(@PathVariable("gId") int gId) {
        return gardenerInterface.getOneGardener(gId);
    }

    @PutMapping("/putGardener")
    public String putGardener(@RequestBody Gardner gardner) {
        return gardenerInterface.putGardner(gardner);
    }

    @PostMapping
    public String postGardener(@RequestBody Gardner gardner) {
        return gardenerInterface.postGardner(gardner);
    }

    @DeleteMapping("/deleteTheGardener/{gId}")
    public String deleteGardener(@PathVariable("gId") int gId) {
        return gardenerInterface.deleteGardner(gId);
    }

}
