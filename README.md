Calculadora
=========================
![alt text](https://i.gyazo.com/b5ad130212399d1ddc94dae4b645d036.gif "Result APP Calculadora")


~~completar más datos~~


REQUIREMENTS
-------------------------
Create a new project.

- App Name: Calculadora
- Icon: anyone.

Constará de dos actividades.
1ª Actividad:
- El usuario podrá introducir dos números y hacer clic sobre una de las operaciones de la barra de acciones.
- Dispondrá de una barra de acciones sin icono de actividad, y con tres acciones:
  - Sumar (+): Siempre se mostrará su icono. Llama a la segunda actividad, pasándole la operación a realizar (suma) y los dos números introducidos por el usuario. Se procurará que el icono de esta acción esté siempre visible en la barra.
  - Restar (-): Siempre se mostrará su icono. Llama a la segunda actividad, pasándole la operación a realizar (resta) y los dos números introducidos por el usuario. Se procurará que el icono de esta acción esté siempre visible en la barra.
  - Acerca de: nunca se mostrará en la barra de acciones, sino que siempre lo hará en el menú de desbordamiento. Al seleccionarlo mostrará un Toast con cualquier mensaje.
- Los iconos de + y – que aparecen bajo los números sólo deberán implementarse si tienes problemas con hacerlo en la barra de acciones.
- No se pasará a la actividad 2 hasta que se introduzcan números válidos.

2ª Actividad:

Recibirá de la actividad 1 los dos números y la operación a realizar, mostrando tanto la operación como el resultado.

Se modificará el icono de la actividad de modo dinámico, y se habilitará su uso (para el caso de que se esté ejecutando en una versión de Android que deshabilite su uso por defecto), de modo que al tocarlo se regrese a la actividad 1, pasándole a esta el resultado de la operación.

GOAL
---------------------------------
![alt text](https://i.gyazo.com/b46033612109af73013851d213786be7.png "Images Calculadora")
