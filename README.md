---Definición de Nulos en Kotlin---

En Kotlin, el manejo de valores nulos es una característica central que promueve la seguridad de tipos y ayuda a prevenir errores comunes como el NullPointerException (NPE). Kotlin diferencia claramente entre tipos que pueden contener null (nullable) y aquellos que no pueden (non-nullable).


---Definición de Opcionales en Kotlin---
En Kotlin, las variables y propiedades pueden ser opcionales (nullable), lo que significa que pueden contener un valor o ser nulas (null). Esto se indica mediante el operador de signo de interrogación (?) después del tipo. Kotlin promueve la seguridad de tipos al evitar los errores comunes relacionados con los valores nulos a través de un manejo explícito y seguro de los opcionales.

---Definición de Variables en Kotlin---
En Kotlin, las variables son contenedores para almacenar datos que pueden ser utilizados y manipulados dentro de un programa. Dependiendo de su mutabilidad, las variables en Kotlin se definen utilizando dos palabras clave principales: var y val.

var - Variables Mutables
Las variables declaradas con var son mutables, lo que significa que su valor puede cambiar a lo largo de la ejecución del programa. Son adecuadas para datos que necesitan ser actualizados o modificados.

---Definicion de Constantes en Kotlin---
En Kotlin, una constante es una variable cuyo valor es inmutable y se define en tiempo de compilación. Esto significa que su valor no puede cambiar una vez que ha sido asignado. Las constantes se declaran utilizando la palabra clave const val.

Las constantes son adecuadas para valores que deben permanecer constantes a lo largo de la ejecución del programa, como configuraciones, URLs, límites numéricos, etc. Además, debido a que se resuelven en tiempo de compilación, pueden mejorar el rendimiento del programa al evitar la necesidad de calcular o buscar estos valores en tiempo de ejecución.

