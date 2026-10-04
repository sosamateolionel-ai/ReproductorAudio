# Reproductor de Audio y Control Remoto

## Descripción

Este programa implementa un sistema simple de control de un reproductor de audio mediante un `ControlRemoto`. El control remoto mantiene una referencia al reproductor y permite reproducir, pausar y modificar el volumen.

## Funcionamiento

### `ReproductorAudio`

Representa el reproductor de audio.

Atributos:

* `volumenActual`: almacena el nivel de volumen actual.
* `estado`: indica el estado del reproductor.

El reproductor comienza con el volumen en `0` y el estado `"detenido"`.

Métodos:

* `play()`: cambia el estado a `"reproduciendo"`.
* `pause()`: cambia el estado a `"pausado"`.
* `subirVolumen()`: aumenta el volumen en la cantidad indicada, sin superar el máximo de `100`.
* `bajarVolumen()`: disminuye el volumen, sin permitir que sea menor que `0`.

### `ControlRemoto`

Representa el control utilizado para manejar el reproductor.

El constructor recibe un objeto `ReproductorAudio` y guarda una referencia al mismo.

Métodos:

* `reproducir()`: indica al reproductor que comience a reproducir.
* `pausar()`: indica al reproductor que se pause.
* `aumVolumen()`: aumenta el volumen en `5`.
* `disVolumen()`: disminuye el volumen en `3`.

## Ejemplo

<img width="357" height="145" alt="image" src="https://github.com/user-attachments/assets/4268ca1e-4bf0-4a4d-84f3-506bb8c5b0a6" />

## Conceptos utilizados

* Clases y objetos
* Constructores
* Atributos
* Métodos
* Encapsulamiento
* Asociación entre clases
* Referencias a objetos
* Condicionales `if`
* Control de límites
* Creación y utilización de objetos
