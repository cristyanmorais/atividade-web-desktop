package top.dribles.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import top.dribles.backend.domain.Venda;
import top.dribles.backend.services.VendaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping("/all")
    public ResponseEntity<List<Venda>> getAll() {
        return ResponseEntity.ok(vendaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venda> getById(@PathVariable long id) {
        return ResponseEntity.ok(vendaService.getById(id));
    }

    @PostMapping("/insert")
    public ResponseEntity<Venda> insert(@RequestBody Venda venda, UriComponentsBuilder builder) {

        vendaService.insert(venda);

        URI uri = builder.path("/venda/{id}").buildAndExpand(venda.getId()).toUri();

        return ResponseEntity.created(uri).body(venda);
    }
}
