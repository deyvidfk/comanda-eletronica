package com.senac.poo.comandaeletronica;

public class Produto {

    private float precoUnitario;
    private String descricao;
    private int codigo = 0;

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto(float precoUnitario, String descricao) {
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
        this.codigo = 0;
    }

    @Override
    public String toString() {
        return "Produto{" + "precoUnitario=" + precoUnitario + ", codigo=" + codigo + ", descricao=" + descricao + '}';
    }

}
