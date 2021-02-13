package br.com.usuario.model;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Usuario {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @NonNull
    private String nome;

    @Size(max = 50)
    @NonNull
    private String sobrenome;

    @NonNull
    private int idade;

    // Métodos Get e Set

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getNome() {
        return nome;
    }

    public void setNome(@NonNull String nome) {
        this.nome = nome;
    }

    @NonNull
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(@NonNull String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
