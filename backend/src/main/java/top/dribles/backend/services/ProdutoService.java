package top.dribles.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dribles.backend.domain.Produto;
import top.dribles.backend.repositories.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    public Produto getById(Long id) {
        return produtoRepository.findProdutoById(id);
    }

    public Produto insert(Produto produto) {
        return produtoRepository.save(produto);
    }
}
