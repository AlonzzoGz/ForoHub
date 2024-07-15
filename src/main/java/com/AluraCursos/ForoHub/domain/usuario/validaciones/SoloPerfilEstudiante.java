package com.AluraCursos.ForoHub.domain.usuario.validaciones;

import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;
import com.AluraCursos.ForoHub.domain.usuario.DatosRegistroUsuario;
import com.AluraCursos.ForoHub.domain.usuario.Perfil;

@Component
public class SoloPerfilEstudiante implements ValidadorDeUsuarios {

    @Override
    public void validar(DatosRegistroUsuario datosRegistroUsuario) {

        if (!datosRegistroUsuario.perfil().equalsIgnoreCase(String.valueOf(Perfil.ESTUDIANTE))){
            throw new ValidationException("Sólo se puede registrar como Estudiante");
        }
    }
}
