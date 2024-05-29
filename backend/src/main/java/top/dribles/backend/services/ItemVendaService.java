package top.dribles.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dribles.backend.domain.ItemVenda;
import top.dribles.backend.repositories.ItemVendaRepository;

import java.util.List;

@Service
public class ItemVendaService {

    @Autowired
    private ItemVendaRepository itemVendaRepository;

    public List<ItemVenda> getAll() {
        return itemVendaRepository.findAll();
    }

    public ItemVenda getById(long id) {
        return itemVendaRepository.findItemVendaById(id);
    }

    public ItemVenda insert(ItemVenda itemVenda) {
        return itemVendaRepository.save(itemVenda);
    }
}
