package com.AluraCursos.ForoHub.domain.respuesta;

import com.AluraCursos.ForoHub.domain.topico.DatosListadoTopico;

import java.time.LocalDateTime;

public record DatosRetornoRespuesta(
        Long id,
        String mensaje,
        LocalDateTime fecha_creacion,
        DatosListadoTopico topico,
        String autor,
        Boolean solucion
) {
}
