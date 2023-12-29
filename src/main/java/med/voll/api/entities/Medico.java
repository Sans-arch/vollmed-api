package med.voll.api.entities;

import jakarta.persistence.*;
import med.voll.api.endereco.Endereco;
import med.voll.api.medico.Especialidade;

@Table(name="medicos")
@Entity(name="Medico")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

}
