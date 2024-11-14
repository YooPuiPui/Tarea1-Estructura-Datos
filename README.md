# Tarea1-Estructura-Datos

Este proyecto es un sistema basico de inventario para una tienda de meubles, implementado en java. El sistema permite realizar operaciones
de un CRUD (Crear, Leer, Actualizar, Eliminar) sobre los muebles de la tienda, permitiendo a los usuarios gestionar sus productos .

## Funcionalidades

El sistema permite las siguientes funcionalidades:

- **Agregar Producto**: Permite al usuario agregar un nuevo mueble al inventario, ingresando los detalles por consola.
- **Eliminar Producto**: Elimina un mueble del inventario.
- **Modificar Producto**: Permite actualizar la información de un mueble existente.
- **Consultar Dimensiones**: Proporciona las dimensiones de un mueble específico.
- **Verificar Material**: Verifica el material con el que está hecho un mueble.
- **Listar por Estilo**: Permite listar los muebles según el estilo (moderno, rústico, clásico).
- **Registrar Capacidad de Peso**: Permite establecer la capacidad máxima de peso que puede soportar un mueble.
- **Generar Historial**: Registra un historial de las operaciones realizadas sobre el inventario.

## Atributos del Mueble

Cada mueble tiene los siguientes atributos:

- **Nombre**: Nombre del mueble.
- **Precio**: Precio del mueble en dólares.
- **Tipo**: Tipo de mueble (Sofá, Silla, Mesa, etc.).
- **Material**: Material del mueble (madera, metal, cuero, etc.).
- **Dimensiones**: Tamaño del mueble (alto x ancho x profundidad).
- **Color**: Color del mueble.
- **Estilo**: Estilo del mueble (moderno, rústico, clásico).
- **Capacidad de Peso**: Capacidad de peso soportada por el mueble en kilogramos.

## Requisitos
- **Java Development Kit (JDK)** 11 o superior.
## Instrucciones para clonar el repositorio
1. Abre una terminal
2. Clona el repositorio usando el siguiente comando:
   ```bash
   git clone <https://github.com/YooPuiPui/Tarea1-Estructura-Datos.git>
3. Navega al directorio del proyecto
    ```bash
    cd <Nombre_del_directorio>

## Compilar y ejecutar el programa

    javac Main.java Inventario.java Mueble.java
    java Main


