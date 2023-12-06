package br.senac.rn.agenda.restcontroller;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.service.ContatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contatos")
public class ContatoController {

    private final ContatoService service;

    public ContatoController(ContatoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contato> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public void salvar(@RequestBody Contato contato) {
        service.salvar(contato);
    }

    @GetMapping("{fone}")
    public List<Contato> listarPorFone(@PathVariable String fone) {
        return service.listarPorFone(fone);
    }

    @PutMapping("{id}")
    public void editar(@PathVariable Integer id, @RequestBody Contato contatoEditado) {
        Contato contato = service.listarPorId(id);
        contato.setNome(contatoEditado.getNome());
        contato.setFone(contatoEditado.getFone());
        contato.setEmail(contatoEditado.getEmail());
        service.salvar(contato);
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable Integer id) {
        service.excluir(id);
    }

}
