/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mural.escolar.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import mural.escolar.controller.SQLiteConnectionFactory;
import mural.escolar.negocio.Mural;
import mural.escolar.negocio.Professor;

/**
 *
 * @author gustavo
 */
public class MuralDAOImp implements MuralDAO{

    @Override
    public String inserir(Professor professor, String texto) {
        String sql = "insert into mural (texto, id_prof) values (?,?)";
        Connection conn = SQLiteConnectionFactory.getConnection();
        
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,texto);
            pst.setInt(2,professor.getId());
            
            int res = pst.executeUpdate();
            if(res > 0){
                return "Conteudo salvo com sucesso!";
            }else{
                return "Erro ao inserir conteudo";
            }
        }catch(SQLException e){
            return e.getMessage();
        }finally{
            SQLiteConnectionFactory.close(conn);
        }
        
    }

    @Override
    public List<Mural> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
