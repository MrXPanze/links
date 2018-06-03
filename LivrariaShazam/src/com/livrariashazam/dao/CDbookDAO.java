package com.livrariashazam.dao;

import com.livrariashazam.models.Cdbook;
import com.livrariashazam.models.Ebooks;
import com.livrariashazam.utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mathe
 */
public class CDbookDAO {

        Connection conexao;

    public CDbookDAO() {
        conexao = Conexao.getConnection();
    }
    
    public List<Cdbook> getLista(){
         List<Cdbook> lista = new ArrayList<Cdbook>();
        String sql = "SELECT * FROM tab_cdbook";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String autor = rs.getString("autor");
                String genero = rs.getString("genero");
                double preco = Double.parseDouble(rs.getString("preco"));
                String preview= rs.getString("preview");
                double duracao= Double.parseDouble(rs.getString("duracao"));
            }
        } catch (Exception e) {
            System.out.println("Query não efetuada");
        }
        return lista;
    }
    
            public void gravar(Cdbook cdbook){
        String sql = "ISERT INTO tab_cdbook (nome,preco,autor,genero,responsividade,preview)VALUES(?,?,?,?,?,?)";
        try{
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, cdbook.getNome());
            pstm.setString(2, cdbook.getAutor());
            pstm.setString(3, cdbook.getGenero());
            pstm.setDouble(4, cdbook.getPreco());
            pstm.setString(5, cdbook.getPreview());
            pstm.setDouble(6, cdbook.getDuracao());
            
            pstm.execute();
            
        }catch(Exception e){
            System.out.println("Erro na query");
        }
    }
    
            public void editar (int id, Cdbook cdbook) throws SQLException{
    
        String sql ="UPDATE tab_cdbook SET";
        sql += "nome=?, autor=?, genero=?, preco=?, preview=?, duracao=?";
        sql += "WHERE id=?";
        try{
             PreparedStatement pstm =  conexao.prepareStatement(sql);
             pstm.setString(1, cdbook.getNome());
             pstm.setString(2, cdbook.getAutor());
             pstm.setString(3, cdbook.getGenero());
             pstm.setDouble(4, cdbook.getPreco());
             pstm.setString(5, cdbook.getPreview());
             pstm.setDouble(6, cdbook.getDuracao());
             pstm.setInt(7, id);
             pstm.execute();
        
        }catch(Exception e){
        }
    }
            
}
