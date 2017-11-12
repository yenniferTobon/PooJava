<%@ include file="header.jsp" %>

  <form method="POST" action="./Login">
  <div class="form-group">
    <label for="exampleInputEmail1">Correo</label>
    <input type="email" class="form-control" id="correo" aria-describedby="emailHelp" placeholder="Correo">
    <small id="emailHelp" class="form-text text-muted">.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Contraseña</label>
    <input type="password" class="form-control" id="contrasena" placeholder="Contraseña">
  </div>
  <div class="form-check">
    <label class="form-check-label">
      <input type="checkbox" class="form-check-input">
      Recordar
    </label>
  </div>
  <button type="submit" class="btn btn-primary">Entrar</button>
</form>
<%@ include file="footer.jsp" %> 