package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario p=new Usuario();

    @Override
    public List listar() {
        ArrayList<Usuario>list=new ArrayList<>();
        String sql="select * from persona";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario per=new Usuario();
                per.setId(rs.getInt("Id"));
                per.setNom(rs.getString("Nombre"));
                per.setAp(rs.getString("ApellidoP"));
                per.setAm(rs.getString("ApellidoM"));
                per.setMail(rs.getString("Correo"));
                per.setPass(rs.getString("Contraseña"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Usuario list(int id) {
        String sql="select * from usuario where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setId(rs.getInt("Id"));
                p.setNom(rs.getString("Nombre"));
                p.setAp(rs.getString("ApellidoP"));
                p.setAm(rs.getString("ApellidoM"));
                p.setMail(rs.getString("Correo"));
                p.setPass(rs.getString("Contraseña"));
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Usuario per) {
        String sql="insert into usuario values (null, Nombre = '"+per.getNom()+"',ApellidoP = '"+per.getAp()+"',ApellidoM = '"+per.getAm()+"',Correo = '"+per.getMail()+"',Contraseña = '"+per.getPass()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Usuario per) {
        String sql="update usuario set Nombre = '"+per.getNom()+"',ApellidoP = '"+per.getAp()+"',ApellidoM = '"+per.getAm()+"',Correo = '"+per.getMail()+"',Contraseña = '"+per.getPass()+"'where Id="+per.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from usuario where Id_Usuario = "+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
