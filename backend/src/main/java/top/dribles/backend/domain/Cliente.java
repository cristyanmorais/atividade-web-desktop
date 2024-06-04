package top.dribles.backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Length(min = 3, max = 100, message = "Tamanho do nome inválido.")
    private String nome;

    @NotBlank
    @Pattern(regexp = "\\d{10,11}", message = "Telefone inválido.")
    private String telefone;

    @NotBlank
    @Email(message = "Email inválido")
    private String email;

    public Cliente() {
    }

    public Cliente(String email, String telefone, String nome, Integer id) {
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
