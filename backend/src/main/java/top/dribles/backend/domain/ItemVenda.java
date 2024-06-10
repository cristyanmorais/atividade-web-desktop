package top.dribles.backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "ITEM_VENDA")
public class ItemVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Positive(message = "Quantidade inválida.")
    private int quantidade;

    @Positive(message = "Valor Unitário inválido.")
    private float valor_unitario;

    @Positive(message = "Valor Total inválido.")
    private float valor_total;

    @ManyToOne
    @JoinColumn(name = "fk_Venda_id", nullable = false)
    @NotNull
    private Venda venda;

    @ManyToOne
    @JoinColumn(name = "fk_Produto_id", nullable = false)
    @NotNull
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(Long id, int quantidade, float valor_unitario, float valor_total, Venda venda, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.valor_unitario = valor_unitario;
        this.valor_total = valor_total;
        this.venda = venda;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Positive
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(@Positive int quantidade) {
        this.quantidade = quantidade;
    }

    @Positive
    public float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(@Positive float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    @Positive
    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(@Positive float valor_total) {
        this.valor_total = valor_total;
    }

    public @NotNull Venda getVenda() {
        return venda;
    }

    public void setVenda(@NotNull Venda venda) {
        this.venda = venda;
    }

    public @NotNull Produto getProduto() {
        return produto;
    }

    public void setProduto(@NotNull Produto produto) {
        this.produto = produto;
    }
}
