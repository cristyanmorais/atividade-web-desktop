package top.dribles.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dribles.backend.domain.Venda;
import top.dribles.backend.exceptions.ApiException;
import top.dribles.backend.repositories.VendaRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;

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
        if (venda.getCliente() == null || venda.getCliente().getId() == 0) {
            throw new ApiException("Cliente não selecionado.");
        }

        if (venda.getData() == null) {
            throw new ApiException("Informe a Data.");
        }

        if (venda.getObservacoes() == null || venda.getObservacoes().isEmpty()) {
            throw new ApiException("Informe a Observação.");
        }

        return vendaRepository.save(venda);
    }
}
