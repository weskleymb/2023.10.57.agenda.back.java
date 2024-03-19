package br.senac.rn.agenda.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "TB_CONTATO")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CON_ID")
    private Integer id;

    @Column(name = "CON_NOME", length = 100)
    private String nome;

    @JoinColumn(name = "CON_FON_ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private Fone fone;

    @Column(name = "CON_EMAIL", length = 200)
    private String email;

    @JoinColumn(name = "CON_END_ID")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Endereco endereco;

    @JoinColumn(name = "USU_CON_ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

}
