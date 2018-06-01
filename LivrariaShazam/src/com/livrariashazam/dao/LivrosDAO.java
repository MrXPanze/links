package com.livrariashazam.dao;
import com.livrariashazam.utils.Conexao;
import com.livrariashzam.models.Livros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 * @author mvdo
 */
public class LivrosDAO {

    Connection conexao;

    public LivrosDAO() {
        conexao = Conexao.getConnection();
    }
    
    public List<Livros> getLista() {
        List<Livros> lista = new ArrayList<Livros>();
        String sql = "SELECT * FROM tab_livros";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String autor = rs.getString("autor");
                String genero = rs.getString("genero");
                double preco = Double.parseDouble(rs.getString("preco"));

            }
        } catch (Exception e) {
            System.out.println("Query não efetuada");
        }
        return lista;
    }

    public void gravar(Livros livros){
        String sql = "ISERT INTO tab_livros (nome,preco,autor,genero)VALUES(?,?,?,?)";
        try{
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, livros.getNome());
            pstm.setString(1, livros.getAutor());
            pstm.setString(1, livros.getGenero());
            pstm.setDouble(1, livros.getPreco());
            pstm.execute();
            
        }catch(Exception e){
            System.out.println("Erro na query");
        }
    }
    
    public void editar (int id, Livros livros) throws SQLException{
    
        String sql ="UPDATE tab_livros SET";
        sql += "nome=?, autor=?, genero=?, preco=?";
        sql += "WHERE id=?";
        try{
             PreparedStatement pstm =  conexao.prepareStatement(sql);
             pstm.setString(1, livros.getNome());
             pstm.setString(2, livros.getAutor());
             pstm.setString(3, livros.getGenero());
             pstm.setDouble(4, livros.getPreco());
             pstm.setInt(5, id);
             pstm.execute();
        
        }catch(Exception e){
        }
    }
    
}
