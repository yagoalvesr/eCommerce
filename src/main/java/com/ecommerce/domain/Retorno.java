package com.ecommerce.domain;

public class Retorno {
    private String mensagem;
    private Boolean sucesso;
    private String descricao;

    public Retorno() {
    }

    public Retorno(String mensagem, Boolean sucesso, String descricao) {
        this.mensagem = mensagem;
        this.sucesso = sucesso;
        this.descricao = descricao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getSucesso() {
        return sucesso;
    }

    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
