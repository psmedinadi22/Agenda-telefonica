# Programa de Agenda Telefónica

### Descripción:
Este programa implementa una agenda telefónica que permite al usuario gestionar contactos a través de un menú interactivo en la consola. El usuario puede agregar nuevos contactos, buscar contactos existentes, eliminar contactos, listar todos los contactos y verificar la cantidad de espacios libres en la agenda. El programa ofrece la opción de definir la capacidad de la agenda al inicio o utilizar una capacidad predeterminada si el usuario no desea especificarla.

### Clases Principales:
1. `Main`: La clase principal del programa que contiene el método `main`. Es responsable de la lógica principal del programa, incluyendo la interacción con el usuario a través de la consola y la gestión de las operaciones de la agenda.
   
2. `Agenda`: Esta clase representa la agenda telefónica y contiene los métodos para gestionar los contactos, incluyendo agregar, buscar, eliminar, listar y verificar la capacidad y los espacios libres.

3. `Contacto`: Esta clase representa un contacto individual en la agenda y contiene los atributos de nombre y teléfono.

### Funcionalidades:
- **Agregar Contacto**: Permite al usuario ingresar un nombre y un número de teléfono para agregar un nuevo contacto a la agenda.
- **Buscar Contacto**: Permite al usuario buscar un contacto existente ingresando su nombre.
- **Eliminar Contacto**: Permite al usuario eliminar un contacto de la agenda ingresando su nombre.
- **Listar Contactos**: Muestra una lista de todos los contactos en la agenda.
- **Espacios Libres**: Indica al usuario la cantidad de espacios libres disponibles en la agenda.
- **Definir Capacidad**: Pregunta al usuario si desea definir la capacidad de la agenda al inicio del programa y permite ingresar un valor personalizado.

### Flujo de Ejecución:
1. El programa solicita al usuario si desea definir la capacidad de la agenda. Si el usuario elige definir la capacidad, se le solicita ingresar un número entero para la capacidad deseada.
2. Se crea una instancia de la clase `Agenda` utilizando la capacidad especificada por el usuario o una capacidad predeterminada si no se proporciona ninguna.
3. Se muestra un menú de opciones al usuario que incluye todas las funcionalidades disponibles.
4. El usuario elige una opción del menú y el programa ejecuta la operación correspondiente.
5. El programa continúa mostrando el menú y procesando las selecciones del usuario hasta que el usuario elige salir del programa.

### Dependencias Externas:
- El programa no depende de ninguna biblioteca externa. Se basa únicamente en las bibliotecas estándar de Java.

### Requisitos del Sistema:
- Java Development Kit (JDK) instalado en el sistema.
- Consola de línea de comandos para la interacción con el usuario.

### Lenguaje de Programación:
- El programa está escrito en Java.
