package Interfaces;

import Modelo.Usuario;
import java.util.List;

public interface CRUD {
    public List listar();
    public Usuario list(int id);
    public boolean add(Usuario per);
    public boolean edit(Usuario per);
    public boolean eliminar(int id);
}
