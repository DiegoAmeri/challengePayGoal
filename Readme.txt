Challenge PayGoal

La aplicación de ChallengePayGoal permite administrar productos a través de una API RESTful utilizando Java y una base de datos en memoria. La aplicación ha sido desarrollada utilizando el framework Spring y una base de datos H2 para almacenar los datos de los productos.

Características
La aplicación ofrece las siguientes funcionalidades:

Creación de productos: Permite crear nuevos productos especificando su nombre, descripción, precio y cantidad.
Actualización de productos: Permite actualizar la información de un producto existente.
Consulta de productos: Permite buscar productos por su ID o nombre.
Eliminación de productos: Permite eliminar un producto existente.
Consulta de productos ordenados por precio: Permite obtener una lista de todos los productos ordenados por su precio.


Requisitos de Ejecución

Antes de ejecutar la aplicación, asegúrate de tener instalado lo siguiente:

Java 8 o una versión superior.
Maven para la gestión de dependencias.
Instrucciones de Ejecución
Sigue los pasos a continuación para ejecutar la aplicación:

Clona el repositorio en tu máquina local:
git clone https://github.com/tu-usuario/nombre-del-repositorio.git

Navega hasta el directorio del proyecto:
cd nombre-del-repositorio

Compila el proyecto utilizando Maven:
mvn compile

Ejecuta la aplicación:
mvn spring-boot:run

La aplicación estará disponible en http://localhost:8080. Puedes utilizar herramientas como Postman para interactuar con la API y realizar operaciones en los productos.



Autor
Diego Ameri, Linkedin: https://www.linkedin.com/in/diego-ameri-00a05920a/