package com.livrariashazam.dao;

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
public class EbooksDAO {
    
    Connection conexao;

    public EbooksDAO() {
        conexao = Conexao.getConnection();
    }
    
    public List<Ebooks> getLista(){
         List<Ebooks> lista = new ArrayList<Ebooks>();
        String sql = "SELECT * FROM tab_ebooks";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String autor = rs.getString("autor");
                String genero = rs.getString("genero");
                double preco = Double.parseDouble(rs.getString("preco"));
                boolean preview= rs.getBoolean("preview");
                String responsividade= rs.getString("reponsividade");
                
            }
        } catch (Exception e) {
            System.out.println("Query não efetuada");
        }
        return lista;
    }
    
        public void gravar(Ebooks ebooks){
        String sql = "ISERT INTO tab_ebooks (nome,preco,autor,genero,responsividade,preview)VALUES(?,?,?,?,?,?)";
        try{
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, ebooks.getNome());
            pstm.setString(1, ebooks.getAutor());
            pstm.setString(1, ebooks.getGenero());
            pstm.setDouble(1, ebooks.getPreco());
            pstm.setString(1, ebooks.getResponsividade());
            pstm.setString(1, ebooks.getPreview());
            
            pstm.execute();
            
        }catch(Exception e){
            System.out.println("Erro na query");
        }
    }
        
         public void editar (int id, Ebooks ebooks) throws SQLException{
    
        String sql ="UPDATE tab_ebooks SET";
        sql += "nome=?, autor=?, genero=?, preco=?, reponsividade=?, preview=?";
        sql += "WHERE id=?";
        try{
             PreparedStatement pstm =  conexao.prepareStatement(sql);
             pstm.setString(1, ebooks.getNome());
             pstm.setString(2, ebooks.getAutor());
             pstm.setString(3, ebooks.getGenero());
             pstm.setDouble(4, ebooks.getPreco());
             pstm.setString(5, ebooks.getResponsividade());
             pstm.setString(6, ebooks.getPreview());
             pstm.setInt(7, id);
             pstm.execute();
        
        }catch(Exception e){
        }
    }
        
}
