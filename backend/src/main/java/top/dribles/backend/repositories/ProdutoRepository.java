package top.dribles.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import top.dribles.backend.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
