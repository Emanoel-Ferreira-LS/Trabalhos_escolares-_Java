/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appnicefoodsprojetocrud.model;

/**
 *
 * @author audi
 */

/*A classe de modelo em uma aplicação Java é uma classe que representa o modelo de dados da 
aplicação, geralmente usado para armazenar e manipular informações relacionadas aos dados da 
aplicação. Esta classe representa uma abstração do objeto de negócio e suas propriedades, além 
de fornecer métodos para manipular e validar essas propriedades. A classe de modelo é geralmente
usada para fornecer uma camada de abstração entre a camada de persistência de dados (como o 
banco de dados) e a camada de apresentação da aplicação.*/


public class Cliente {
    String telefonePesquisar;
    String nome;
    String telefone;
    String rua;
    String bairro;
    String numeroDaCasa;
    String pedido;
    String descricao;
    String quantidade;
    String preco;

    public String getTelefonePesquisar() {
        return telefonePesquisar;
    }

    public void setTelefonePesquisar(String telefonePesquisar) {
        this.telefonePesquisar = telefonePesquisar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(String numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    
    
}
