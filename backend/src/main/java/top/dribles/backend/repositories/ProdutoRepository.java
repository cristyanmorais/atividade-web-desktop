package top.dribles.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import top.dribles.backend.domain.Produto;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findAll();

    public Produto findProdutoById(Long id);
}
