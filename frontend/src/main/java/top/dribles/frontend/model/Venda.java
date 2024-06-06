/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package top.dribles.frontend.model;

/**
 *
 * @author crist
 */
public class Venda {
    private long id;
    private String observacoes;
    private String data;
    private float total;
    private Cliente cliente;

    public Venda() {
    }

    public Venda(String observacoes, String data, float total, Cliente cliente) {
        this.observacoes = observacoes;
        this.data = data;
        this.total = total;
        this.cliente = cliente;
    }

    public Venda(long id, String observacoes, String data, float total, Cliente cliente) {
        this.id = id;
        this.observacoes = observacoes;
        this.data = data;
        this.total = total;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
