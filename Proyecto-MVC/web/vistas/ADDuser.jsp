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
                <h1>Agregar Usuario</h1>
                <form action="Controlador">
                    Nombre:<br>
                    <input class="form-control" type="text" name="txtNom"><br>
                    Apellido Paterno: <br>
                    <input class="form-control" type="text" name="txtAp"><br>
                    Apellido Materno: <br>
                    <input class="form-control" type="text" name="txtAm"><br>
                    Correo: <br>
                    <input class="form-control" type="text" name="txtMail"><br>
                    Contraseña: <br>
                    <input class="form-control" type="text" name="txtPass"><br>
                    Rol de Usuario: <br>
                    <input class="form-control" type="text" name="txtRol"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=usuario">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
