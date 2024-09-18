package mattiasusin.rifacimento.services;

import mattiasusin.rifacimento.entities.Dipendente;
import mattiasusin.rifacimento.repositories.DipendnentiRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DipendentiService {

    // IMPORTO DELLE CLASSI

    @Autowired
    private DipendnentiRepository dipendnentiRepository;

    // METODI

    // 1 --> GET TUTTI

    public List<Dipendente> findAllDipendenti(){
        return this.dipendnentiRepository.findAll();
    }

    // 2 --> POST

    // 3 --> GET ID

    // 4 --> PUT

    // 5 --> DELETE
}
