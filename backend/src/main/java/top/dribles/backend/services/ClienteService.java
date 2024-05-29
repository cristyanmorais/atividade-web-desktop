package top.dribles.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dribles.backend.domain.Cliente;
import top.dribles.backend.repositories.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    public Cliente getById(long id) {
        return clienteRepository.findClienteById(id);
    }

    public Cliente insert(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    /*public void delete(Cliente cliente) {
        clienteRepository.delete(cliente);
    }*/
}
