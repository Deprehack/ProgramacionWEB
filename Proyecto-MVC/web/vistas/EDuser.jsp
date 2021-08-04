<%@page import="Modelo.Usuario"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <%
                    UsuarioDAO dao=new UsuarioDAO();
                    int id=Integer.parseInt((String)request.getAttribute("iduser"));
                    Usuario p=(Usuario)dao.list(id);
                %>
                <h1>Editar Usuario</h1>
                <form action="Controlador">
                    Nombre:<br>
                    <input class="form-control" type="text" name="txtDni" value="<%= p.getNom()%>"><br>
                    Apellido Paterno: <br>
                    <input class="form-control" type="text" name="txtNom" value="<%= p.getAp()%>"><br>
                    Apellido Materno: <br>
                    <input class="form-control" type="text" name="txtNom" value="<%= p.getAm()%>"><br>
                    Correo: <br>
                    <input class="form-control" type="text" name="txtNom" value="<%= p.getMail()%>"><br>
                    Contraseña: <br>
                    <input class="form-control" type="text" name="txtNom" value="<%= p.getPass()%>"><br>
                    Rol de Usuario: <br>
                    <input class="form-control" type="text" name="txtNom" value="<%= p.getRol()%>"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=usuario">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
