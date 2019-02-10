# app-spring

Esta segunda parte del proyecto web contiene la parte del backend, la conforma un servicio RESTful encargado de 
consultar nuestros datos desde una base de datos almacenada en el gestor pgAdminIII, la cual la podremos conseguir en 
un tercer repositorio de esta cuenta.

Este proyecto fue generado con:
- [SpringToolsSuite](https://spring.io/tools) 3.9.6. RELEASE.

##Indicaciones
Una vez descargado el proyecto y nuestro STS listo para funcionar, importamos nuestro proyecto
con File> Open Projects from File System> Directory y elegimos la carpeta del proyecto.

Dentro de la carpeta src/main/resources se encuentra el archivo application.properties en donde 
se encuentran las configuraciones de nuestra conexión a la base de datos, ahi cambiaremos los datos 
como usuario, puerto o contraseña si es que difieren del usuario, puerto o contraseña que tenemos configurado en 
el gestor de base de datos.

Una vez el proyecto corriendo correctamente se pueden probar las funcionalidades entrando desde un navegador
web como google chrome:
ingresamos a la URL `http://localhost:8080/project/getAllPibs` para consultar todos los registros
ingresamos a la URL `http://localhost:8080/project/insertar/numero de id/ año/ porcentaje` para 
insertar un registro por ejemplo `http://localhost:8080/project/insertar/30/2019/5.1234`

Dentro de la carpeta src/test/java se encuentra un paquete con una clase en la cual se pueden realizar 
dos pruebas unitarias usando [JUnit](https://junit.org/junit5/). Las pruebas consisten en probar los metodos de consultar 
todos los datos y el de insertar un registro en la base de datos.
Las pruebas se pueden realizar dando clic derecho en la clase> Run As> JUnit Test. 


