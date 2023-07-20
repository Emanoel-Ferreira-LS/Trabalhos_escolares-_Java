/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appnicefoodsprojetocrud.dao;
import com.mycompany.appnicefoodsprojetocrud.factory.ConnectionFactory;
import com.mycompany.appnicefoodsprojetocrud.model.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author audi
 */

/*A classe DAO (Data Access Object) é uma classe responsável por acessar o banco de dados e 
realizar as operações básicas como inserir, atualizar, remover e buscar informações. 
Ela é utilizada como uma camada de abstração entre a camada de apresentação (interface gráfica) 
e a camada de acesso aos dados (banco de dados). A classe DAO permite que a lógica de acesso 
aos dados seja separada da lógica da aplicação, tornando o código mais organizado e facilmente 
manutenível.*/



public class ClienteDAO {
      Connection connection;
        PreparedStatement stmt;
        ResultSet rs;
        Connection conn;

    
    public ClienteDAO() {
        connection = new ConnectionFactory().getConnection();
    }
    
    
    public void desconectar(){
        try {
            connection.close();
        } catch (SQLException ex) {
            
        }    }

    public void finalizarPedido(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO delivery (nome,telefone,rua,bairro,numeroDaCasa,pedido,descricao,quantidade,preco) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getRua());
            stmt.setString(4, cliente.getBairro());
            stmt.setString(5, cliente.getNumeroDaCasa());
            stmt.setString(6, cliente.getPedido());
            stmt.setString(7, cliente.getDescricao());
            stmt.setString(8, cliente.getQuantidade());
            stmt.setString(9, cliente.getPreco());
            stmt.execute();stmt.close();
            }
             catch (SQLException u) {
                 
            }
    }
    
    
    
    
    
    
   public void atualizar(Cliente cliente) throws SQLException {
    try {
        stmt = connection.prepareStatement("UPDATE delivery SET nome = ?, telefone=?, rua = ?, bairro=?, numeroDaCasa=?, pedido = ?, descricao = ?, quantidade = ?, preco = ? WHERE telefone= ?");
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getTelefone());
        stmt.setString(3, cliente.getRua());
        stmt.setString(4, cliente.getBairro());
        stmt.setString(5, cliente.getNumeroDaCasa());
        stmt.setString(6, cliente.getPedido());
        stmt.setString(7, cliente.getDescricao());
        stmt.setString(8, cliente.getQuantidade());
        stmt.setString(9, cliente.getPreco());
        stmt.setString(10, cliente.getTelefonePesquisar());
        stmt.executeUpdate();
        stmt.close();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

    
    
    public void deletar(Cliente cliente) throws SQLException {
        String sql = "DELETE FROM delivery WHERE telefone = ?";      
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getTelefonePesquisar());
            stmt.executeUpdate();
        } catch (SQLException u) {
             throw new RuntimeException(u);
            }
        
        }
    
    
    
        public Cliente pesquisar(String telefone) throws SQLException {
        try{
         Cliente cli = new Cliente();//instanceia um objeto da classe funcionario
         stmt = connection.prepareStatement("SELECT * FROM delivery WHERE telefone = ?");
         stmt.setString(1, telefone);

         rs = stmt.executeQuery();//variaver de uma classe que recebe dados de um select do BD
        if(rs.next()){ //verifica se encontrou os dados do email informado
            //começa a inserir os dados obtidos do rs no objeto da classe funcionário 
           cli.setNome(rs.getString("nome"));
           cli.setTelefone(rs.getString("telefone"));
           cli.setRua(rs.getString("rua"));
           cli.setBairro(rs.getString("bairro"));
           cli.setNumeroDaCasa(rs.getString("numeroDaCasa"));
           cli.setPedido(rs.getString("pedido"));
           cli.setDescricao(rs.getString("descricao"));
           cli.setQuantidade(rs.getString("quantidade"));
           cli.setPreco(rs.getString("preco"));
           return cli;
        }else{
            return null;
        }
        }catch(SQLException ex){
            return null;
        }         
    }
 
                    
}
