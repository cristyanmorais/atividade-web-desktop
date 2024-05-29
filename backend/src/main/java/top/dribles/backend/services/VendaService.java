package top.dribles.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dribles.backend.domain.Venda;
import top.dribles.backend.repositories.VendaRepository;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public List<Venda> getAll() {
        return vendaRepository.findAll();
    }

    public Venda getById(long id) {
        return vendaRepository.findVendaById(id);
    }

    public Venda insert(Venda venda) {
        return vendaRepository.save(venda);
    }
}
