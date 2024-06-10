package top.dribles.backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import java.util.Set;

@Entity
@Table(name = "VENDA")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Length(max = 256, message = "Tamanho de Observação Inválido")
    private String observacoes;

    @NotNull(message = "Informe a Data.")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data deve estar no formato yyyy-MM-dd.")
    private String data;

    @Positive(message = "Informe pelo menos um Item na Venda.")
    private float total;

    @ManyToOne
    @JoinColumn(name = "fk_Cliente_id")
    private Cliente cliente;

    public Venda() {
    }

    public Venda(float total, String data, String observacoes, long id) {
        this.total = total;
        this.data = data;
        this.observacoes = observacoes;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull @NotEmpty @Length(max = 256) String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(@NotNull @NotEmpty @Length(max = 256) String observacoes) {
        this.observacoes = observacoes;
    }

    public @NotNull(message = "Informe a Data.") @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data deve estar no formato yyyy-MM-dd.") String getData() {
        return data;
    }

    public void setData(@NotNull(message = "Informe a Data.") @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data deve estar no formato yyyy-MM-dd.") String data) {
        this.data = data;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public @NotNull(message = "not null venda") Cliente getCliente() {
        return cliente;
    }

    public void setCliente(@NotNull(message = "not null venda") Cliente cliente) {
        this.cliente = cliente;
    }
}
