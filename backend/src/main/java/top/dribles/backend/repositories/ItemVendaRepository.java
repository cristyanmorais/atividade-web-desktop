package top.dribles.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.dribles.backend.domain.ItemVenda;

import java.util.List;

@Repository
public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {

    public List<ItemVenda> findAll();

    public ItemVenda findItemVendaById(long id);
}
