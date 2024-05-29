package top.dribles.backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.Set;

@Entity
@Table(name = "PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @NotEmpty
    @Length(min = 3, max = 256)
    private String descricao;

    @NotNull
    @NotBlank
    @NotEmpty
    private float valor;

    @NotNull
    @NotBlank
    @NotEmpty
    @Length(min = 5, max = 100)
    private String categoria;

    @OneToMany(mappedBy = "produto")
    private Set<ItemVenda> itenvendas;

    public Produto() {
    }

    public Produto(String categoria, float valor, String descricao, Long id) {
        this.categoria = categoria;
        this.valor = valor;
        this.descricao = descricao;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull @NotBlank @NotEmpty @Length(min = 10, max = 256) String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotNull @NotBlank @NotEmpty @Length(min = 10, max = 256) String descricao) {
        this.descricao = descricao;
    }

    public @NotNull @NotBlank @NotEmpty float getValor() {
        return valor;
    }

    public void setValor(@NotNull @NotBlank @NotEmpty float valor) {
        this.valor = valor;
    }

    public @NotNull @NotBlank @NotEmpty @Length(min = 10, max = 100) String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotNull @NotBlank @NotEmpty @Length(min = 10, max = 100) String categoria) {
        this.categoria = categoria;
    }
}
