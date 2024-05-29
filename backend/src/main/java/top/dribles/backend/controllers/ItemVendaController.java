package top.dribles.backend.controllers;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import top.dribles.backend.domain.ItemVenda;
import top.dribles.backend.services.ItemVendaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/item-venda")
public class ItemVendaController {

    @Autowired
    private ItemVendaService itemVendaService;

    @GetMapping("/all")
    public ResponseEntity<List<ItemVenda>> getAll() {
        return ResponseEntity.ok(itemVendaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemVenda> getById(@PathVariable long id) {
        return ResponseEntity.ok(itemVendaService.getById(id));
    }

    @PostMapping("/insert")
    public ResponseEntity<ItemVenda> insert(@RequestBody ItemVenda itemVenda, UriComponentsBuilder builder) {

        itemVendaService.insert(itemVenda);

        URI uri = builder.path("/item-venda/{id}").buildAndExpand(itemVenda.getId()).toUri();

        return ResponseEntity.created(uri).body(itemVenda);
    }
}
