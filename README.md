# cashChallenge

# PASO 1

Tener instalado Xampp , inicial Apache y Mysql.

# PASO 2

Crear una base de datos llamada cash en mysql.

# PASO 3

Importar el archivo usuarios.sql a la base de datos cash.

# PASO 4

Correr el proyecto un la terminal con el siguiente script .\mvnw.cmd spring-boot:run.

# PASO 5

Para ver el funcionamiento de la api descargarse postman y hacer las pruebas.

--Los Endpont
USUARIOS

- Peticion Get
- Para ver todos los usuarios - http://localhost:8080/users

- Peticion Post
  -Agregar un usuario - http://localhost:8080/users , en el body escribimos en formato json el email,firstName,lastName.Y nos Agrega un usuario nuevo.

-Peticion Delete
-Elimina un usuario - http://localhost:8080/users/{idUser} , por params le pasamos el id a eliminar.

PRESTAMOS

- Peticion Get
- Para ver todos los prestamos - http://localhost:8080/loans

- Peticion Post
  -Agregar un prestamo - http://localhost:8080/loans , en el body escribimos en formato json el total , idUsuario .Y nos Agrega un prestamo nuevo.
