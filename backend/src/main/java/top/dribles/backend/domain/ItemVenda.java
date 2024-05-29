package top.dribles.backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "ITEM_VENDA")
public class ItemVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @NotNull
    @NotBlank
    private int quantidade;

    @NotEmpty
    @NotNull
    @NotBlank
    private float valor_unitario;

    @NotEmpty
    @NotNull
    @NotBlank
    private float valor_total;

    @ManyToOne
    @JoinColumn(name="fk_venda_id")
    private Venda venda;

    @ManyToOne
    @JoinColumn(name="fk_produto_id")
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(Long id, int quantidade, float valor_unitario, float valor_total, Venda venda, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.valor_unitario = valor_unitario;
        this.valor_total = valor_total;
        this.venda = venda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotEmpty
    @NotNull
    @NotBlank
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(@NotEmpty @NotNull @NotBlank int quantidade) {
        this.quantidade = quantidade;
    }

    @NotEmpty
    @NotNull
    @NotBlank
    public float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(@NotEmpty @NotNull @NotBlank float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    @NotEmpty
    @NotNull
    @NotBlank
    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(@NotEmpty @NotNull @NotBlank float valor_total) {
        this.valor_total = valor_total;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
