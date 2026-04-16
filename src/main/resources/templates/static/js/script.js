function mostrarFormularioCrear() {
  document.getElementById("crear-formulario").style.display = "block";
  document.getElementById("editar-formulario").style.display = "none"
}

function mostrarFormularioEditar() {
  document.getElementById("editar-formulario").style.display = "block";
    document.getElementById("crear-formulario").style.display = "none"
}

function ocultarFormularioCrear() {
  document.getElementById("crear-formulario").style.display = "none";
}

function ocultarFormularioEditar() {
  document.getElementById("editar-formulario").style.display = "none";
}
