# TallerRPGStefanny

## ¿De qué trata el proyecto?

Este proyecto consiste en crear un pequeño sistema RPG en Java donde se pueden crear personajes y realizar diferentes acciones de combate.

El usuario puede crear su propio personaje ingresando su nombre, vida, ataque y defensa, y después puede atacar, curarse, subir de nivel o participar en una pelea automática.

El proyecto fue realizado para practicar conceptos de Programación Orientada a Objetos y el uso de clases, objetos, métodos y constructores en Java.

## Clases utilizadas

### Personaje.java

Esta clase representa a los personajes del juego y contiene sus características principales como nombre, vida, ataque, defensa y nivel.

También contiene los métodos que permiten que el personaje ataque, reciba daño, se cure, suba de nivel y muestre su estado.

### Batalla.java

Esta clase contiene los métodos relacionados directamente con las batallas entre personajes.

Se utiliza para realizar ataques críticos y para iniciar una pelea automática entre dos personajes hasta que uno de ellos pierde toda su vida.

### Main.java

Esta es la clase principal del programa y es donde se ejecuta el menú.

Permite al usuario seleccionar las diferentes acciones del juego y utiliza `Scanner` para recibir los datos ingresados desde la consola.

## Métodos utilizados

### `atacar(Personaje objetivo)`

Permite que un personaje ataque a otro personaje.

El daño se calcula utilizando los puntos de ataque del atacante y los puntos de defensa del objetivo.

### `recibirDano(double cantidad)`

Reduce los puntos de vida del personaje según la cantidad de daño recibida.

También evita que los puntos de vida sean menores que cero.

### `curar()`

Permite recuperar todos los puntos de vida del personaje.

La vida vuelve al valor establecido como puntos de vida máximos.

### `estaVivo()`

Comprueba si el personaje todavía tiene puntos de vida.

Devuelve `true` si está vivo y `false` si sus puntos de vida llegaron a cero.

### `subirNivel()`

Aumenta el nivel actual del personaje.

Cada vez que se utiliza el método, el nivel aumenta en uno.

### `mostrarEstado()`

Muestra en consola la información actual del personaje.

Incluye su nombre, vida, ataque, defensa y nivel.

### `ejecutarAtaqueCritico()`

Realiza un ataque crítico utilizando el doble de los puntos de ataque del personaje.

Este método pertenece a la clase `Batalla`.

### `iniciarPeleaAutomatica()`

Inicia una pelea entre dos personajes de forma automática.

Los personajes se atacan por turnos hasta que uno de ellos pierde todos sus puntos de vida.

### `getTotalPersonajesCreados()`

Permite consultar cuántos personajes han sido creados durante la ejecución del programa.

Este método utiliza la variable estática `totalPersonajesCreados`.

## Constructores utilizados

### Constructor por defecto

Crea un personaje utilizando valores establecidos previamente.

El personaje se crea con el nombre "Guerrero Novato", 100 puntos de vida, 15 de ataque, 5 de defensa y nivel 1.

### Constructor parametrizado

Permite crear un personaje utilizando los valores que ingresa el usuario.

Recibe el nombre, los puntos de vida máximos, los puntos de ataque y los puntos de defensa.

## Conceptos de Java utilizados

### Clases y objetos

Se utilizan tres clases principales para organizar el programa y crear los objetos que representan a los personajes.

### Constructores

Se utilizan constructores para crear personajes con valores predeterminados o con valores proporcionados por el usuario.

### Métodos

Los métodos permiten separar las diferentes acciones del programa, como atacar, curarse, subir de nivel y mostrar información.

### Métodos estáticos

Se utilizan métodos `static` para las funciones relacionadas con la batalla y para llevar el conteo de personajes creados.

### `if` y `switch`

Se utilizan estructuras de decisión para controlar las diferentes opciones del menú y validar algunas acciones.

### `while` y `do-while`

Se utilizan ciclos para mantener activo el menú y para controlar la pelea automática hasta que uno de los personajes pierda.

## Autora

Stefanny Estevez
