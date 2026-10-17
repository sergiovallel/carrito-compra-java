Carrito de Compra 
Aplicación utilizando Java y Springboot para hacer una API que funcione como carrito de compras con conexión a SQL. 
Tecnologías utilizadas: Java 17 / Spring Boot 3.2.4 / Xampp / HTML. 
Requisitos:
  - Tener todos los archivos base.
  - Acceso a base de datos.
Instalación y configuración:
- No se requiere instalación de la aplicación en si, mas que de los programas para correrla, INTELLIJ u otro IDE que
  permita leer y compilar el código, XAMPP, y MYSQL.
- Se debe configurar y confirmar que las credenciales apra la DB son correctas.
*inicio**
para iniciar la applicación se necesita compilar el programa, abrir navegador
y configurar el local host en el puerto correcto para la aplicación.

Variables o archivos que debne modificarse: 
 Archivo: application.properties.
 Las variables son:
 - spring.datasource.url = asegurarse que el local host y el nombre de la db es correcta.
 - spring.datasouce.username = cambiar el username para usar en XAMPP.
 - spring.datasource.password = colocar la pw para usar en XAMPP.
Endpoints:
GET /
GET /carrito
POST /carrito/agregar
GET /carrito/eliminar/{id}
GET /carrito/vaciar

Problemas conocidos o limitaciones:
- Las imágenes en la pantalla principal no cargan.
- Además, las imágenes y el aspecto gráfico están mal colocadas. error en CSS.
- No existe un botón para "agregar" unidades en la tienda, sino que se le da click más de 1 vez al "agregar al carrito" para
  agregar más de 1 unidad en el carrito del mismo producto.
- El botón de "vaciar Carrito" está mal diseñado. 
