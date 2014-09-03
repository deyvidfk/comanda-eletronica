package com.senac.poo.comandaeletronica;

import java.util.ArrayList;
import java.util.List;

public class CategoriaProdutos {

    private static List<Produto> _produtos;

    public CategoriaProdutos() {
        _produtos = new ArrayList<>();
    }

    public void cadastrarProduto() {
        _produtos.add(new Produto(10, "zxczx"));
        _produtos.add(new Produto(12, "zxczxc"));
        _produtos.add(new Produto(10, "teszxczxczxte"));
    }

    public Produto buscarProduto() {
        return null;
    }

    public void imprimirProduto() {
        for (Produto produto : _produtos) {
            System.out.println(produto.toString());
        }
    }

}
