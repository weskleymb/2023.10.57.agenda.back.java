package br.senac.rn.agenda.restcontroller;

import br.senac.rn.agenda.model.Endereco;
import br.senac.rn.agenda.service.EnderecoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enderecos")
public class EnderecoController {

    private final EnderecoService service;

    public EnderecoController(EnderecoService service) {
        this.service = service;
    }

    @PostMapping
    public void salvar(@RequestBody Endereco endereco) {
        service.salvar(endereco);
    }

}
