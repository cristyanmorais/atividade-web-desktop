package top.dribles.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.dribles.backend.domain.Venda;

import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

    public List<Venda> findAll();

    public Venda findVendaById(long id);
}
