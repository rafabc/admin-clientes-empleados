# Admin-clientes-empleados

## Documentación general:

### Descripción: 

Esta aplicación fue creada para solucionar una problemática de una empresa, mediante la creación de un programa utilizando el lenguaje de java.

### Problema identificado: 

La empresa no cuenta con un Sistema para poder organizar a sus usuarios o empleados, todo se maneja mediante Word y Excel,  esta causa que en muchas ocasiones falte importación o se pierda información.

### Solución: 

Crear un programa que administre a los empleados y clientes, este programa fue creado en java, el cual se conecta a una base de datos interna.

### Arquitectura: 

https://prnt.sc/mp7won

### Tabla de contenidos:

- [Login](https://github.com/adrianhdz14/Admin-clientes-empleados/wiki/Wiki#login).
- [Clientes](https://github.com/adrianhdz14/Admin-clientes-empleados/wiki/Wiki#clientes).
- [Empleados](https://github.com/adrianhdz14/Admin-clientes-empleados/wiki/Wiki#empleados).
- [Reportes](https://github.com/adrianhdz14/Admin-clientes-empleados/wiki/Wiki#reportes).
- [Ayuda](https://github.com/adrianhdz14/Admin-clientes-empleados/wiki/Wiki#ayuda).
- [Opciones](https://github.com/adrianhdz14/Admin-clientes-empleados/wiki/Wiki#opciones).

## Requerimientos:

- [Tener acceso y conexión a una base de datos.].
- [Tener la versión de Java 8.].
- [Tener el IDE de netbeans.].
- [Tener descargado los archivos del repositorio incluyendo librerías y plugins.].

## Instalación:

### Instalar el ambiente de desarrollo
- [Descarga la versión de java 8 e instalar.]().
- [Descarga la versión de netbeans e instalar.]().

### Como ejecutar pruebas:

Se tienen una carpeta que se llama test, en esta parte podrás llamar a las otras funciones que se encuentran en los demás archivos y realizar pruebas, como se revisión de datos, comparación de datos, etc.

### Cómo implementar la solución en producción en un ambiente local o en la nube como Heroku:
- [En local solo se necesita un servidor local que cuente con una base de datos.]().
- [En Heroku solo sería descargar JawsDB MySQL dentro de Heroku, el cual te dará el acceso a  una base de datos.]().

Solo se ocuparía el una base de datos y el archivo JAR del programa.

## Configuración:
- [Descargar archivos  de repositorio]().<pre>$ git clone https://github.com/adrianhdz14/Admin-clientes-empleados.git</pre>
- [Abrir proyecto en Netbeans.]().
- [Importar plugins que se encuentran en la carpeta de “plugins”, en netbeans: Tools/Plugins/Downloaded/Add Plugins.]().
- [Importar librerías que se encuentran dentro de la carpeta “librerías, en netbeans:Tools/Libraries/New Library.]().
- [Importas las librerías que creaste a tu proyecto y también agregas la librería de JasperReportViewer.]().
- [Conectar tu base de datos en el archivo de conectar.java ]().

## Uso:

### Usuario del sistema:

- [Abrir el archivo (JAR) del sistema, el cual abrirá el Login.]().
- [Ingresar correctamente el Usuario y Contraseña del sistema, que será dada por el administrador del código, cuando se ingrese correctamente el usuario se abrirá una pantalla con varias pestañas.]().
- [En el menú podrás ver las opciones de Clientes, Empleados, Reportes, Ayuda y Opciones. Revise el resumen de estas pestañas en la wiki del proyecto.]().
- [Seleccione una de las pestañas a utilizar.]().

    a.	Clientes/Acciones: Este te permite agregar, actualizar y eliminar clientes. Si quieres agregar un cliente llene los campos mostrados en la pantalla y seleccione agregar, si quiere actualizar un cliente tendrá que buscar el cliente en la tabla y dar clic derecho encima del cliente a modificar, después se mostraran 2 opciones, en este caso elegirás modificar y los datos de este cliente se auto llenaran en los campos mostrados, solo sería cuestión de modificar lo que se necesite y dar clic en el botón de actualizar. Para eliminar un cliente tendrás que dar clic derecho encima del cliente a eliminar y dar clic en eliminar.
    b.	Clientes/Mostrar: Es esta parte se mostrara un tabla de todos los clientes agregados en la base de datos, el cual cuenta con 3 opciones de búsqueda, que son la búsqueda por id, por nombre y por email.

    c.	Empleados/Acciones: Este te permite agregar, actualizar y eliminar clientes. Si quieres agregar un empleado llene los campos mostrados en la pantalla y seleccione agregar, si quiere actualizar un empleado tendrá que buscar el empleado en la tabla y dar clic derecho encima del empleado a modificar, después se mostraran 2 opciones, en este caso elegirás modificar y los datos de este empleado se auto llenaran en los campos mostrados, solo sería cuestión de modificar lo que se necesite y dar clic en el botón de actualizar. Para eliminar un cliente tendrás que dar clic derecho encima del cliente a eliminar y dar clic en eliminar.
    d.	Empleados/Mostrar: Es esta parte se mostrara un tabla de todos los empleados agregados en la base de datos, el cual cuenta con 3 opciones de búsqueda, que son la búsqueda por id, por nombre y por email.

    e.	Reportes/Empleados - Reportes/Clientes: Cuando des clic en uno de estas 2 opciones e mostrara otra pantalla con un botón de crear reporte, solo es cuestión de dar clic en él y se crear un reporte.

    f.	Ayuda/Acerca de…: este fue creado para dar información corta del producto.

    g.	Opciones/Login: Te direccionara al Login.

    h.	Opciones/Salir: Cerrara el programa por completo.

- [5.	Cuando selecciones una de estas opciones te abrirá otra pantalla, para regresar a la pantalla principal solo tendrás que dar clic en el menú en “Archivos o en opciones” después dar clic en “Regresar”..]().


### Usuario administrador:
- [El uso del sistema es igual que el del Usuario del sistema]().
- [Este tendrá acceso al código fuente del programa donde podrá agregar nuevas funciones al sistema, como más campos, nuevas pantallas, acomodación de componentes, etc.]().
- [La forma de agregar nuevos componentes sería crear una nueva clase y ligarla al menú.]().
- [Agregar nuevos campos, entrar al archivo java a modificar, y agregar campos nuevos con ayuda de la paleta de componentes de netbeans y agregar funcionalidades medicínate “acción event”.]().
- [Cambios usuario y contraseña, seria entrar al archivo “Acceso” cambiar la variable  usuario y contraseña.]().


## Contribución:

## Guía de contribución para usuarios.
- [Tener cuenta en github]().
- [Instalar algún cliente git (como git scm) ]().
- [Hacemos un fork a este repositorio. (clic en botón de fork y damos en fork to “nombre de mi cuneta”)]().
- [Clonamos el repositorio creado en nuestro ordenador]().<pre>$ git clone https://github.com/tu_cuenta/Admin-clientes-empleados.git</pre>
- [Creamos un Nuevo branch donde agregaremos nuevo feature]().<pre>$ git checkout -b “feature-…“</pre>
- [Agregamos y editamos lo necesario para nuestro nuevo feature.]().<pre>$ git add .</pre>
- [Hacemos commit en los cambios realizado, con algún comentario descriptivo corto. (Puedes hacer varios commtis)]().<pre>$ git clone https://github.com/tu_cuenta/Admin-clientes-empleados.git</pre>
- [Ya terminado nuestros cambios realizamos un push al repositorio.]().<pre>$ git push  <REMOTENAME> <BRANCHNAME>

$ git push  “feature-…“:“feature-…“
</pre>
Con este en nuestro repositorio se le agrega los cambios que realizaste en la nueva brach creada.

- [Después hacemos un pull request dentro de la nueva brach creada, seleccionamos donde queremos que merga el cambio y escribimos que feature(s) se agregaron y porque se debería de aceptar. Después damos en send pull request.]().
- [Este será enviado a revisión.]().
