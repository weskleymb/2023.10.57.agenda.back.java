package br.senac.rn.agenda.service;

import br.senac.rn.agenda.model.Fone;
import br.senac.rn.agenda.repository.FoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoneService {

    private final FoneRepository repository;

    public FoneService(FoneRepository repository) {
        this.repository = repository;
    }

    public void salvar(Fone fone) {
        repository.save(fone);
    }

    public List<Fone> listarTodos() {
        return repository.findAll();
    }

    public List<Fone> listarPorNumero(String numero) {
        return repository.findByNumeroLike(numero);
    }

}
