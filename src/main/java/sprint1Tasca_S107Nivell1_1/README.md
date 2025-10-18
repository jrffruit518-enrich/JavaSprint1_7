# Sprint1Tasca_S107Nivell1_1 - Herencia y Polimorfismo - Nivel 1

## 📄 Descripción - Enunciado del ejercicio

Este proyecto implementa una jerarquía de clases que demuestra el uso de herencia y polimorfismo en Java, con la utilización de la anotación @Override. El sistema incluye tres clases: Worker, OnlineWorker y OnsiteWorker.

El sistema permite:





Definir una clase abstracta Worker con los atributos name, surname y hourlyRate, y un método abstracto calculateSalary() que calcula el salario basado en las horas trabajadas.



Crear una clase OnlineWorker que hereda de Worker y sobrescribe calculateSalary() para incluir una tarifa fija de internet (INTERNETFLATRATE).



Crear una clase OnsiteWorker que hereda de Worker y sobrescribe calculateSalary() para incluir un costo fijo de gasolina (GASOLINECOST).



Demostrar el funcionamiento de la anotación @Override desde el método main() de la clase WorkerMain, invocando el método calculateSalary() con diferentes instancias y mostrando los resultados.

Este ejercicio demuestra el uso de herencia, polimorfismo y la anotación @Override para garantizar que los métodos sobrescritos en las clases hijas se implementen correctamente.

## 💻 Tecnologías Utilizadas





Java 23



IntelliJ IDEA (opcional)



JDK estándar (no requiere bibliotecas externas)

## 📋 Requisitos





Tener instalado Java JDK 23 o superior.



Un IDE o editor compatible con Java (IntelliJ, Eclipse, VS Code, etc.).

## 🛠️ Instalación





Clona este repositorio (reemplaza con la URL real):

git clone https://github.com/jrffruit518-enrich/JavaSprint1_7.git



Accede al directorio del proyecto:
```
cd JavaSprint1_7
```


Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## ▶️ Ejecución





Compila los archivos Java desde la terminal (ajusta el path según la estructura):
```
javac sprint1Tasca_S107Nivell1_1/*.java
```


Ejecuta la clase principal:
```
java sprint1Tasca_S107Nivell1_1.WorkerMain
```
Verás la salida en consola con los detalles de los trabajadores y sus salarios calculados, por ejemplo:

OnlineWorker name: Rong surname: Jiang hourlyRate: 40.0 salary: 6900.0
OnlineWorker name: Lina surname: Zhou hourlyRate: 35.0 salary: 6100.0
OnsiteWorker name: Zhicheng surname: Jiang hourlyRate: 42.0 salary: 7720.0
OnsiteWorker name: Zhixin surname: Zhou hourlyRate: 40.0 salary: 7400.0
Error: The number of hours worked cannot be negative or zero.

Esto demuestra el cálculo del salario con diferentes implementaciones en las clases hijas y la gestión de excepciones.

## 🌐 Despliegue

Este proyecto es un ejercicio educativo y no requiere despliegue en producción.

Opcionalmente, puedes empaquetarlo como un .jar ejecutable:

jar cfe WorkerMain.jar sprint1Tasca_S107Nivell1_1.WorkerMain -C out .

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Sigue estos pasos:





Haz un fork del repositorio.



Crea una nueva rama:
```
git checkout -b feature/NuevaFuncion
```


Realiza tus cambios y haz commit:
```
git commit -m "Agrega nueva funcionalidad al proyecto Worker"
```


Sube los cambios:
```
git push origin feature/NuevaFuncion
```


Abre un Pull Request para revisión.