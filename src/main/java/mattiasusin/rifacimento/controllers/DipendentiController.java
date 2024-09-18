package mattiasusin.rifacimento.controllers;



import mattiasusin.rifacimento.entities.Dipendente;
import mattiasusin.rifacimento.services.DipendentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dipendenti1")
public class DipendentiController {

    // IMPORTO DELLE CLASSI
    @Autowired
    private DipendentiService dipendentiService;

    // QUERY

    // 1 --> GET ALL

    @GetMapping
   public List<Dipendente> findAllDipendenti(){
        return dipendentiService.findAllDipendenti();
    }

    // 2 --> POST

    // 3 --> GET ID

    // 4 --> DELETE
}
