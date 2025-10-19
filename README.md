# javaSprint1_7 - Resumen del Proyecto
## 📄 Descripción

Este proyecto contiene los ejercicios de Java correspondientes a Nivel 1 dentro del módulo JavaSprint1_7.
El objetivo es practicar herencia, polimorfismo, uso de la anotación @Override, así como el manejo de métodos obsoletos (@Deprecated) y la supresión de advertencias (@SuppressWarnings).

## 📋 Organización de los ejercicios (Nivel 1)

Los ejercicios de Nivel 1 están organizados en carpetas separadas dentro de src/:

sprint1Tasca_S107Nivell1_1 → Ejercicio 1:
Jerarquía de clases formada por Treballador, TreballadorOnline y TreballadorPresencial.
Cada clase redefine el método calcularSou() utilizando @Override para demostrar el polimorfismo.

TreballadorPresencial añade un atributo static llamado benzina al cálculo del sueldo.

TreballadorOnline utiliza una constante TARIFA_INTERNET para sumar la tarifa plana al sueldo.
El main() de la clase Principal muestra el funcionamiento de la anotación @Override.

sprint1Tasca_S107Nivell1_2 → Ejercicio 2:
Se añaden métodos obsoletos (@Deprecated) en las clases hijas y se invocan desde una clase externa.
Se emplea la anotación @SuppressWarnings("deprecation") para eliminar las advertencias al usarlos.

Cada carpeta contiene el código fuente y un README específico con instrucciones y detalles del ejercicio.