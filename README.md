# SSOO-tarea01

{Alonso Benjamín Faúndez Garcia, Alonso.faundez@alumnos.uv.cl}

El codigo cuenta con 3 funciones signalCtrl, signalHandler y start, 
donde signalCtrl se encarga de ignorar la una señal de "ctrl+c" para
que este cierre realizando la accion 2 veces, por otro lado signalHandler
se acciona al captar la señal "SIGUSR1", si esa señal es captada manda
datos de fecha y hora, y start nos puetra le pid del proceso inicial y deja 
activo el capto de la señal SIGUSR1, finalmente en el Main se deja activo el capto
de la señal que activa el sginalCtrl para que ignore la primera señal al apretar "ctrl+c" 
tambien se hace un while para dejar el proceso activo y se usa un pause para que este espere
la siguente señal. 
