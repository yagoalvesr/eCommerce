package com.ecommerce.domain;

import com.ecommerce.domain.pk.PedidoItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "pedido_item")
public class PedidoItem {

    @EmbeddedId
    private PedidoItemPK id = new PedidoItemPK();

    private Integer quantidade;
    private Double preco;

    @JsonIgnore
    public Pedido getPedido() {
        return id.getPedido();
    }

    public void setPedido(Pedido pedido) {
        this.id.setPedido(pedido);
    }

    public Produto getProduto() {
        return id.getProduto();
    }

    public void setProduto(Produto produto) {
        this.id.setProduto(produto);
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
