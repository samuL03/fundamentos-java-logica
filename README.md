# Fundamentos de Lógica de Programación en Java

##  Descripción del Proyecto

Este proyecto académico tiene como finalidad consolidar los conocimientos fundamentales de lógica de programación en Java, aplicando buenas prácticas de organización de código y utilizando Git y GitHub como sistema de control de versiones.

Cada tema principal de la lógica de programación ha sido implementado en una clase independiente dentro del paquete:

src/main/java/com/example

Todos los ejemplos son funcionales y muestran su comportamiento mediante salida por consola desde una clase principal llamada `App`.

---

##  Estructura del Proyecto

El proyecto sigue una estructura estándar de Java:

```
src/
 └── main/
     └── java/
         └── com/
             └── example/
                 ├── App.java
                 ├── VariablesYConstantes.java
                 ├── TiposDeDatosPrimitivos.java
                 ├── ConversionDeTipos.java
                 ├── Operadores.java
                 ├── EntradaDeDatos.java
                 ├── EstructurasCondicionales.java
                 ├── EstructurasDeRepeticion.java
                 ├── MetodosEstaticosSimples.java
                 ├── ArreglosUnidimensionales.java
                 ├── ArreglosBidimensionales.java
                 ├── ManipulacionCadenas.java
                 └── ManejoBasicoExcepciones.java
```

---

##  Cómo Compilar y Ejecutar

###  Opción 1: Desde la Terminal (Estructura Manual)

1. Ubicarse en la raíz del proyecto.
2. Compilar el código:

```
javac -d out src/main/java/com/example/*.java
```

3. Ejecutar la aplicación:

```
java -cp out com.example.App
```

---

###  Opción 2: Desde un IDE

1. Abrir el proyecto en IntelliJ IDEA, Eclipse o Visual Studio Code.
2. Ejecutar la clase `App.java`.
3. Observar la salida en la consola.

---

##  Tabla de Contenidos

Este proyecto incluye ejemplos prácticos de los siguientes temas fundamentales:

1. Variables y Constantes  
2. Tipos de Datos Primitivos  
3. Conversión de Tipos (Casting)  
4. Operadores  
5. Entrada de Datos con Scanner  
6. Estructuras Condicionales  
7. Estructuras de Repetición  
8. Métodos Estáticos  
9. Arreglos Unidimensionales  
10. Arreglos Bidimensionales  
11. Manipulación de Cadenas  
12. Manejo Básico de Excepciones  

Cada tema está organizado en una clase independiente y contiene métodos estáticos que demuestran ejemplos claros y funcionales.

---

##  Clase Principal

La clase `App` contiene el método:

```java
public static void main(String[] args)
```

Desde este método se realizan llamadas a todos los métodos estáticos implementados en las demás clases, permitiendo ejecutar cada ejemplo y visualizar su funcionamiento en consola.

Para mayor claridad, cada sección se separa con mensajes como:

```java
System.out.println("--- Tema: NombreDelTema ---");
```

---

##  Conceptos Implementados

###  Variables y Constantes
- Declaración y asignación de variables.
- Convenciones de nombres (camelCase).
- Uso de la palabra clave `final`.

###  Tipos de Datos Primitivos
- Enteros: byte, short, int, long.
- Flotantes: float, double.
- Caracteres: char.
- Booleanos: boolean.
- Explicación de valores por defecto.

###  Conversión de Tipos
- Casting implícito (widening).
- Casting explícito (narrowing).
- Problemas de pérdida de precisión.

###  Operadores
- Aritméticos (+, -, *, /, %).
- Incremento y decremento.
- Relacionales.
- Lógicos.
- Asignación compuesta.
- Operador ternario.

###  Entrada de Datos
- Uso de Scanner.
- Lectura de int, double y String.
- Manejo del salto de línea pendiente.

###  Estructuras Condicionales
- if
- if-else
- if-else if-else
- switch tradicional
- switch expression (si aplica)

###  Estructuras de Repetición
- while
- do-while
- for clásico
- for anidado
- break y continue
- Uso opcional de etiquetas

###  Métodos Estáticos
- Declaración y llamada.
- Paso de parámetros.
- Retorno de valores.
- Sobrecarga de métodos.

###  Arreglos Unidimensionales
- Declaración, creación e inicialización.
- Uso de length.
- Recorrido con for clásico.
- Recorrido con for-each.
- Métodos con arreglos como parámetro y retorno.

###  Arreglos Bidimensionales
- Declaración y creación de matrices.
- Recorrido con bucles anidados.
- Ejemplos de uso práctico.

###  Manipulación de Cadenas
- Concatenación.
- Métodos útiles (length, charAt, substring, toUpperCase).
- Inmutabilidad de String.
- Uso de StringBuilder.

###  Manejo Básico de Excepciones
- try-catch para división por cero.
- Manejo de InputMismatchException.
- Uso del bloque finally.
- Prevención de cierre inesperado del programa.

---

## Buenas Prácticas Aplicadas

- Código organizado de forma modular.
- Uso de nombres descriptivos en camelCase.
- Métodos claros y concisos.
- Comentarios explicativos cuando es necesario.
- Uso de constantes para evitar "magic numbers".
- Código compilable y ejecutable sin errores.

---

##  Autor

Samuel Rendon Loiaza
Proyecto Académico  
Fundamentos de Lógica de Programación en Java  
Año 2025