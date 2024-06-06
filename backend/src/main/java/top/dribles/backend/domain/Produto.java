package top.dribles.backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;

import java.util.Set;

@Entity
@Table(name = "PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Length(min = 3, max = 256, message = "Tamanho inválido de descrição.")
    private String descricao;

    @Positive(message = "Valor não positivo inválido.")
    private float valor;

    @NotBlank
    @Length(min = 5, max = 100, message = "Tamanho inválido de categoria.")
    private String categoria;

    /*@OneToMany(mappedBy = "produto")
    private Set<ItemVenda> itensvendas;*/

    public Produto() {
    }

    public Produto(Long id, String descricao, float valor, String categoria) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank @Length(min = 3, max = 256, message = "Tamanho inválido de descrição") String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotBlank @Length(min = 3, max = 256, message = "Tamanho inválido de descrição") String descricao) {
        this.descricao = descricao;
    }

    @Positive
    public float getValor() {
        return valor;
    }

    public void setValor(@Positive float valor) {
        this.valor = valor;
    }

    public @NotBlank @Length(min = 5, max = 100) String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotBlank @Length(min = 5, max = 100) String categoria) {
        this.categoria = categoria;
    }

    /*public Set<ItemVenda> getItensvendas() {
        return itensvendas;
    }

    public void setItensvendas(Set<ItemVenda> itensvendas) {
        this.itensvendas = itensvendas;
    }*/
}
