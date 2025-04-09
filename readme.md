### 1. Primero ejecutamos los test
### 2. Enumeramos la refactorización del codigo
### 3. Realizamos el commit
<h1>Lista de Cambios</h1>



### Commit 1: Refactorización del método `getScore`
- Se refactorizó el método `getScore` para delegar la lógica a métodos más pequeños y claros:
    - obtenerPuntuacionEmpate
    - obtenerVentajaOGanador
    - obtenerPuntuacionSinEmpate

### Commit 2: Refactorización del manejo de puntuaciones iguales
- Creación de obtenerPuntuacionEmpate

### Commit 3: Refactorización de puntuaciones regulares
- Extracción de la lógica que maneja las puntuaciones regulares (sin empate) a un método separado: obtenerPuntuacionSinEmpate.

