<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="pt-br">
  <head>
    <title>Abandono de emprego</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="index.jsp">Abandono de Emprego</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Página Inicial <span class="sr-only">(current)</span></a>
      </li>
    </ul>
  </div>
</nav>
<br>
   <div class="container">
  <div class="row justify-content-center">
    <div class="col-12">
      
	<div class="card border-primary mb-3" >
  <div class="card-header">Preencha o formulário</div>
  <div class="card-body">
  <form method="POST" action="GeraPDF">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Nome da empresa</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="nomeEmpresa" required>
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">CNPJ da empresa</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="cnpjEmpresa" required>
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Endereço da empresa</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="enderecoEmpresa" required>
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Nome do funcionário</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="nomeFuncionario" required >
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">CTPS do funcionário</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="ctpsFuncionario" required>
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Série do CTPS do funcionário</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="serieCtpsFuncionario" required>
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Data de abandono</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="dataAbandono" required>
    </div>
  </div>
  
 
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Enviar</button>
    </div>
  </div>
</form>
  
  </div>
</div>
<br>


 
<br>
    </div>

  </div>
</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
  </body>
</html>