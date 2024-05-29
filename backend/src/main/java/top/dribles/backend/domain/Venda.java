package top.dribles.backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.Set;

@Entity
@Table(name = "VENDA")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @NotEmpty
    @Length(min = 3, max = 256)
    private String observacoes;

    @NotNull
    @NotBlank
    @NotEmpty
    private String data;

    private float total;

    @ManyToOne
    @JoinColumn(name = "fk_Cliente_id")
    private Cliente cliente;

    public Venda() {
    }

    public Venda(float total, String data, String observacoes, Long id) {
        this.total = total;
        this.data = data;
        this.observacoes = observacoes;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull @NotBlank @NotEmpty @Length(min = 10, max = 256) String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(@NotNull @NotBlank @NotEmpty @Length(min = 10, max = 256) String observacoes) {
        this.observacoes = observacoes;
    }

    public @NotNull @NotBlank @NotEmpty String getData() {
        return data;
    }

    public void setData(@NotNull @NotBlank @NotEmpty String data) {
        this.data = data;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
