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

    /*@NotBlank(message = "Informe o nome.")*/
    @Length(min = 3, max = 100, message = "Tamanho do nome inválido.")
    private String nome;

    /*@NotBlank(message = "Informe o telefone.")*/
    @Pattern(regexp = "\\d{10,11}", message = "Telefone inválido.")
    private String telefone;

    @NotBlank(message = "Informe o email.")
    @Email(message = "Email inválido")
    private String email;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank @Length(min = 3, max = 100, message = "Tamanho do nome inválido.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank @Length(min = 3, max = 100, message = "Tamanho do nome inválido.") String nome) {
        this.nome = nome;
    }

    public @NotBlank @Pattern(regexp = "\\d{10,11}", message = "Telefone inválido.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank @Pattern(regexp = "\\d{10,11}", message = "Telefone inválido.") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank @Email(message = "Email inválido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank @Email(message = "Email inválido") String email) {
        this.email = email;
    }
}
