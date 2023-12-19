package br.senac.rn.agenda.service;

import br.senac.rn.agenda.model.Endereco;
import br.senac.rn.agenda.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    private final EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }

    public void salvar(Endereco endereco) {
        repository.save(endereco);
    }

}
