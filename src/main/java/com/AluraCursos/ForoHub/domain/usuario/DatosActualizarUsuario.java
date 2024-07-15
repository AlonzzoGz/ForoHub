package com.AluraCursos.ForoHub.domain.usuario;


public record DatosActualizarUsuario(
        String nombre,
        String email,
        String clave,
        String perfil
) {
}
