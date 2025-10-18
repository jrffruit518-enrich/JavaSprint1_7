# Sprint1Tasca_S107Nivell1_2 - Métodos Obsoletos y Anotaciones - Nivel 1
## 📄 Descripción - Enunciado del ejercicio
Este proyecto extiende la jerarquía de clases del ejercicio anterior (Sprint1Tasca_S107Nivell1_1) para demostrar el uso de métodos obsoletos en Java con la anotación @Deprecated y la supresión de advertencias con @SuppressWarnings("deprecation"). El sistema incluye tres clases: Worker1, OnlineWorker1 y OnsiteWorker1.
El sistema permite:

Añadir métodos obsoletos (calculateSalaryOld) en las clases hijas OnlineWorker1 y OnsiteWorker1, marcados con la anotación @Deprecated.
Invocar estos métodos obsoletos desde una clase externa (WorkerMain1) y suprimir las advertencias de compilación utilizando la anotación @SuppressWarnings("deprecation").
Mantener la funcionalidad de la jerarquía de clases original, donde:

Worker1 es una clase abstracta con los atributos name, surname y hourlyRate, y un método abstracto calculateSalary().
OnlineWorker1 calcula el salario incluyendo una tarifa fija de internet (INTERNETFLATRATE).
OnsiteWorker1 calcula el salario incluyendo un costo fijo de gasolina (GASOLINECOST).



Este ejercicio demuestra el uso de la anotación @Deprecated para marcar métodos obsoletos y @SuppressWarnings("deprecation") para gestionar las advertencias al invocar dichos métodos desde una clase externa.
## 💻 Tecnologías Utilizadas

Java 23
IntelliJ IDEA (opcional)
JDK estándar (no requiere bibliotecas externas)

## 📋 Requisitos

Tener instalado Java JDK 23 o superior.
Un IDE o editor compatible con Java (IntelliJ, Eclipse, VS Code, etc.).

## 🛠️ Instalación

Clona este repositorio (reemplaza con la URL real si está alojado):
```
git clone https://github.com/jrffruit518-enrich/JavaSprint1_7.git
```
Accede al directorio del proyecto:
```
cd JavaSprint1_7_2
```
Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## ▶️ Ejecución

Compila los archivos Java desde la terminal (ajusta el path según la estructura):
```
javac sprint1Tasca_S107Nivell1_2/*.java
```
Ejecuta la clase principal:
```
java sprint1Tasca_S107Nivell1_2.WorkerMain1
```

Verás la salida en consola con los salarios calculados usando los métodos obsoletos, por ejemplo:
```
salary : 6400.0
salary : 6720.0
```
Esto demuestra la invocación de los métodos obsoletos calculateSalaryOld de OnlineWorker1 y OnsiteWorker1, con las advertencias de compilación suprimidas mediante @SuppressWarnings("deprecation").
## 🌐 Despliegue
Este proyecto es un ejercicio educativo y no requiere despliegue en producción.
Opcionalmente, puedes empaquetarlo como un .jar ejecutable:
```
jar cfe WorkerMain1.jar sprint1Tasca_S107Nivell1_2.WorkerMain1 -C out .
```
## 🤝 Contribuciones
¡Las contribuciones son bienvenidas! Sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama:
```
git checkout -b feature/NuevaFuncion
```
Realiza tus cambios y haz commit:
```
git commit -m "Agrega mejoras al proyecto WorkerMain1"
```
Sube los cambios:
```
git push origin feature/NuevaFuncion
```
Abre un Pull Request para revisión.

## 📝 Notas Adicionales

Los métodos obsoletos (calculateSalaryOld) en OnlineWorker1 y OnsiteWorker1 calculan el salario sin incluir los costos adicionales (INTERNETFLATRATE o GASOLINECOST), representando una versión antigua del cálculo.
La anotación @SuppressWarnings("deprecation") se aplica a nivel de clase en WorkerMain1 para suprimir las advertencias de todos los usos de métodos obsoletos en el método main.
El proyecto asume que las horas trabajadas son un valor numérico (en este caso, double), aunque en contextos laborales las horas suelen ser enteros. Esto podría ajustarse según los requisitos específicos del curso.