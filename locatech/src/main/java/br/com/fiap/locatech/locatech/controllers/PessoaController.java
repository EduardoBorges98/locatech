package br.com.fiap.locatech.locatech.controllers;

import br.com.fiap.locatech.locatech.entities.Pessoa;
import br.com.fiap.locatech.locatech.services.PessoaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/pessoas")
@RestController
public class PessoaController {

    private static final Logger logger = LoggerFactory.getLogger(PessoaController.class);

    private final PessoaService pessoaService;

    public PessoaController(PessoaService PessoaService) {
        this.pessoaService = PessoaService;
    }

    // https://localhost:8080/Pessoas/1
    // https://localhost:8080/Pessoas?page=1&size=10

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAllPessoas(
            @RequestParam("page") int page,
            @RequestParam("size") int size
    ) {
        logger.info("Iniciando listagem de Pessoas");
        var Pessoas = this.pessoaService.findAll(page, size);
        return ResponseEntity.ok(Pessoas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pessoa>> findPessoa(
            @PathVariable("id") long id
    ) {
        logger.info("/Pessoas/" + id);
        var Pessoa = this.pessoaService.findPessoaById(id);
        return ResponseEntity.ok(Pessoa);
    }

    @PostMapping
    public ResponseEntity<Void> savePessoa(
            @RequestBody Pessoa Pessoa
    ) {
        logger.info("POST => /Pessoas/");
        this.pessoaService.savePessoa(Pessoa);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePessoa(
            @PathVariable("id") Long id,
            @RequestBody Pessoa Pessoa
    ) {
        logger.info("PUT => /Pessoas/" + id);
        this.pessoaService.updatePessoa(Pessoa, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePessoa(
            @PathVariable("id") Long id
    ) {
        this.pessoaService.deletePessoa(id);
        logger.info("DELETE => /Pessoas/" + id);
        return ResponseEntity.ok().build();
    }
}
    

