<%-- 
    Document   : home
    Created on : 6 jun 2024, 7:18:49
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="shortcut icon" href="assets/images/pagina.png" type="image/x-icon">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="assets/css/style.css"/>
    </head>
    <body class="d-flex justify-content-center align-items-center vh-100" style="background: url('assets/images/background.jpg') no-repeat center center fixed; background-size: cover;">
    <div class="bg-light p-5 rounded-5 text-secondary shadow-lg" style="width: 25rem; background-color: rgba(255, 255, 255, 0.8);">
        <div class="d-flex justify-content-center mb-4">
            <img src="assets/images/login-icon.svg" alt="login-icon" style="height: 7rem"/>
        </div>
        <div class="text-center fs-1 fw-bold text-primary mb-4">INICIO DE SESIÓN</div>
        <form action="lc" method="post">
            <div class="input-group mb-3">
                <div class="input-group-text bg-light border-0">
                    <img src="assets/images/username-icon.svg" alt="username-icon" style="height: 1rem"/>
                </div>
                <input class="form-control bg-light border-0" type="text" name="username" placeholder="nombre de usuario"/>
            </div>
            <div class="input-group mb-3">
                <div class="input-group-text bg-light border-0">
                    <img src="assets/images/password-icon.svg" alt="password-icon" style="height: 1rem"/>
                </div>
                <input class="form-control bg-light border-0" type="password" name="clave" placeholder="contraseña"/>
            </div>
            <div class="d-flex justify-content-between mb-3">
                <div class="d-flex align-items-center gap-1">
                </div>
                
            </div>
            <div class="d-grid gap-2 mb-4">
                <button type="submit" class="btn btn-primary">Ingresar</button>
            </div>
        </form>
        
        <div class="d-flex justify-content-center">
            <div class="border-bottom text-center" style="width: 50%; position: relative;">
            </div>
        </div>      
    </div>
</body>

</html>
