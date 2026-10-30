//lalo_07
import java.sql.*;
public class Usuarios {
 
    String idUser, nombre, nomUser, nip, rol, estado; 
    
    static String todos = "SELECT * FROM usuarios ORDER BY nombre DESC";
    
    static String ids = "SELECT idusuarios From usuarios ORDER BY idusuarios";
    
    Usuarios() {
        
    }

    public Usuarios(String idUser, String nombre, String nomUser, String nip, String rol, String estado) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.nomUser = nomUser;
        this.nip = nip;
        this.rol = rol;
        this.estado = estado;
    }
    
    //INSERT
    public int insertar(Connection con){
        int resulato = 0;
        try {
            String sql = "INSERT INTO usuarios VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idUser);
            ps.setString(2, nombre);
            ps.setString(3, nomUser);
            ps.setString(4, nip);
            ps.setString(5, rol);
            ps.setString(6, estado);
            
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return resulato;
        }
        
    }
    
    //DELATE
    public int borrar(Connection con){
        int resultado = 0;
        try {
            String sql = "DELETE FROM usuarios WHERE idusuarios = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idUser);
            
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return resultado;
        }
    }
    
    //UPDATE
    public int actualizar(Connection con){
        int resultado = 0;
        try { 
            String sql = "UPDATE usuarios SET nombre = ?, nombre_usr = ?, nip = ?, rol = ?, estado = ? WHERE idusuarios = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, nomUser);
            ps.setString(3, nip);
            ps.setString(4, rol);
            ps.setString(5, estado);
            ps.setString(6, idUser); 
            
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return resultado;
        }
    }
    
}
