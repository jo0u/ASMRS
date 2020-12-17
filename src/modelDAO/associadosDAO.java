package modelDAO;

import connection.ConnectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelBens.associados;

/**
 *
 * @author jou
 */
public class associadosDAO {

    private String dataMysql;
     
    
     public void creat(associados as){//dentro dos ()tem que colocar (associado us)
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            stmt = con.prepareStatement("INSERT INTO associados (nome,data_nascimento,rg,cpf,email,qto_filhos,nome_pai,nome_mae,empregado,telefone)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)");
                    stmt.setString(1, as.getNome());
                    stmt.setString(2, as.getDataNasc());
                    stmt.setString(3, as.getRg());
                    stmt.setString(4, as.getCpf());
                    stmt.setString(5, as.getEmail());
                    stmt.setInt(6, as.getQtdFIlhos());
                    stmt.setString(7, as.getNomeDoPai());
                    stmt.setString(8, as.getNomeDaMae());
                    stmt.setString(9, as.getEmpregado());
                    stmt.setString(10, as.getTelefone());
                    
                    stmt.executeUpdate();
                    
                    JOptionPane.showConfirmDialog(null,"Salvo com Sucesso");
            
        } catch (SQLException ex) {
             JOptionPane.showConfirmDialog(null,"Erro ao Salvar "+ ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
    
    
    }
    
    
     public void update(associados as){
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
         
         try {
             
                    stmt = con.prepareStatement("UPDATE associados SET nome = ? , data_nascimento = ? , rg = ? , cpf = ? , email = ? , qto_filhos = ? , nome_pai = ? , nome_mae = ? , empregado = ? , telefone = ? WHERE id = ?;");
                    stmt.setString(1, as.getNome());
                    stmt.setString(2, as.getDataNasc());
                    stmt.setString(3, as.getRg());
                    stmt.setString(4, as.getCpf());
                    stmt.setString(5, as.getEmail());
                    stmt.setInt(6, as.getQtdFIlhos());
                    stmt.setString(7, as.getNomeDoPai());
                    stmt.setString(8, as.getNomeDaMae());
                    stmt.setString(9, as.getEmpregado());
                    stmt.setString(10, as.getTelefone());
                    stmt.setInt(11, as.getId());
                   
                    
                    stmt.executeUpdate();
                    
                    JOptionPane.showConfirmDialog(null,"Dados Alterados com Sucesso!");
             
             
             
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Erro ao excutar"+ex);
         }finally{
             ConnectionFactory.closeConnection(con,stmt);
             
         }
         
     }
     
     
     
     public void delete (associados as){
         
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
         try {
                stmt = con.prepareStatement("DELETE FROM associados WHERE id = ?");
                stmt.setInt(1, as.getId());
                
                stmt.executeUpdate();
                
                JOptionPane.showConfirmDialog(null, "Dados Deletados Com Sucesso!");
                
         } catch (SQLException ex) {
             JOptionPane.showConfirmDialog(null,"Erro ao Deletar"+ ex);
             
         }finally{
             
             ConnectionFactory.closeConnection(con,stmt);
             
         }
         
         
     }
     
    
     public java.util.List<associados> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        java.util.List<associados> asList = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM associados");
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                associados as1 = new associados();
                    
                    
                    as1.setId(rs.getInt("id"));
                    as1.setNome(rs.getNString("nome"));
                    as1.setDataNasc(rs.getString("data_nascimento"));
                    as1.setRg(rs.getString("rg"));
                    as1.setCpf(rs.getString("cpf"));
                    as1.setEmail(rs.getString("email"));
                    as1.setQtdFIlhos(rs.getInt("qto_filhos"));
                    as1.setNomeDoPai(rs.getString("nome_pai"));
                    as1.setNomeDaMae(rs.getString("nome_mae"));
                    as1.setEmpregado(rs.getString("empregado"));
                    as1.setTelefone(rs.getString("telefone"));
                    
                    asList.add(as1);
               
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro binga" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return asList;
    }
     
     
     public java.util.List <associados>  readForDesc(String nome){
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
         ResultSet rs = null;
         
            java.util.List<associados> aslist = new ArrayList<associados>();
         
            try {
             stmt = con.prepareStatement("SELECT * FROM associados WHERE nome LIKE ?");
                     stmt.setString(1, "%"+nome+"%");
                    
                     rs = stmt.executeQuery();
                     
                     while(rs.next()){
                         associados as1 = new associados();
                         
                          as1.setId(rs.getInt("id"));
                    as1.setNome(rs.getNString("nome"));
                    as1.setDataNasc(rs.getString("data_nascimento"));
                    as1.setRg(rs.getString("rg"));
                    as1.setCpf(rs.getString("cpf"));
                    as1.setEmail(rs.getString("email"));
                    as1.setQtdFIlhos(rs.getInt("qto_filhos"));
                    as1.setNomeDoPai(rs.getString("nome_pai"));
                    as1.setNomeDaMae(rs.getString("nome_mae"));
                    as1.setEmpregado(rs.getString("empregado"));
                    as1.setTelefone(rs.getString("telefone"));
                    
                    aslist.add(as1);
                         
                         
                         
                         
                     }
                     
                     
                     
         } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, " a lista" + ex);
         
         
         
         }finally{
                ConnectionFactory.closeConnection(con,stmt,rs);
            }
                 
                 
                 return aslist;
     }
     
    
     
     
     
     
    
     
}
