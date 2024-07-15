   <h2>Introducción 📖</h2>

  <p>
        ForoHub es un proyecto desarrollado en Java utilizando el poderoso Spring Framework. La finalidad de esta aplicación es ofrecer una API RESTful que permita a los usuarios gestionar temas en un foro. Este proyecto es parte de un desafío de programación que busca mejorar habilidades en la implementación de APIs, manejo de bases de datos, y configuración de servicios de autenticación y autorización.
    </p>

  <h2>Características Principales 🌟</h2>

   <ul>
        <li>Creación de nuevos temas</li>
        <li>Obtención de todos los temas disponibles</li>
        <li>Consulta de detalles de un tema específico</li>
        <li>Actualización de información de un tema existente</li>
        <li>Eliminación de temas</li>
        <li>Rutas adicionales opcionales como <code>/usuario</code> y <code>/respuestas</code> para funcionalidades ampliadas</li>
    </ul>

   <h2>Objetivos del Proyecto 🎯</h2>

   <p>
        Los principales objetivos de ForoHub son:
    </p>

   <ul>
        <li>Implementar una API REST siguiendo las mejores prácticas y principios del modelo REST.</li>
        <li>Aplicar validaciones de negocio para asegurar la integridad y seguridad de los datos.</li>
        <li>Utilizar una base de datos relacional para almacenamiento persistente y eficiente.</li>
        <li>Configurar servicios robustos de autenticación y autorización para proteger la información.</li>
        <li>Documentar la API de manera opcional utilizando Swagger para facilitar su uso y comprensión.</li>
    </ul>

   <h2>Requisitos Previos 📋</h2>

   <p>
        Antes de empezar, asegúrate de tener instaladas las siguientes herramientas y dependencias:
    </p>

   <ul>
        <li>Maven 4+</li>
        <li>Spring Boot 3.2.3+</li>
        <li>MySQL 8+ o PostgreSQL 16+</li>
        <li>Lombok</li>
        <li>Spring Web</li>
        <li>Spring Boot DevTools</li>
        <li>Spring Data JPA</li>
        <li>Flyway Migration</li>
        <li>MySQL Driver o PostgreSQL Driver</li>
        <li>Validation</li>
        <li>Spring Security</li>
    </ul>

   <h2>Configuración e Instalación 🛠️</h2>

   <ol>
        <li>Clona este repositorio en tu máquina local utilizando <code>git clone [URL del repositorio]</code>.</li>
        <li>Abre el proyecto en tu IDE preferido (recomendado: IntelliJ IDEA).</li>
        <li>Configura la conexión a la base de datos en el archivo <code>application.properties</code>.</li>
        <li>Realiza las migraciones de la base de datos utilizando Flyway.</li>
        <li>Ejecuta la aplicación para iniciar el servidor Spring Boot.</li>
    </ol>

   <h2>Interacción con la API 🔍</h2>

   <p>
        Puedes interactuar con la API de ForoHub utilizando herramientas como Postman, cURL, o cualquier cliente HTTP de tu elección. Asegúrate de seguir las rutas y métodos HTTP adecuados para cada operación.
    </p>

   <h3>Ejemplo de Petición POST para Crear un Tema</h3>

   <pre>
<code>
POST /temas
Content-Type: application/json
{
    "titulo": "Nuevo Tema",
    "contenido": "Contenido del tema",
    "autor": "Nombre del autor"
}
</code>
    </pre>

   <h2>Desarrollado por 👨‍💻</h2>

   <p>Rodrigo Alonso Guzmán Lovo</p>

   <p>¡Disfruta construyendo y mejorando ForoHub! Tu contribución y feedback son bienvenidos.</p>
</body>
</html>
