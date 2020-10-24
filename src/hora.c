#include <stdio.h>
#include <stdlib.h>
#include <time.h> 
#include <signal.h>
#include <unistd.h>

void signalCtrl(int senhal){  //Esta funcion se encarga de ignorar la señal
			      //logrnado que se cierre el programa 
        signal(SIGINT, SIG_DFL); //aprentando 2 veces ctrl+c 

}

void signalHandler(int senhal){ 
//Esta funcion dice cuando capta la señal SIGUSR1 y retorna los datos 
//DIA/MES/NUM_DIA/HORA/AÑO

   	time_t tiempo = time(0);
        struct tm *tlocal = localtime(&tiempo);
       	char output[128];
	strftime(output,128,"%a %b %d %H:%M:%S %Y",tlocal);

	if (senhal == SIGUSR1) {
		
		printf("Señal SIGUSR1 recibida: %s", output);
		printf("\nListo para recibir la señal SIGUSR1.\n");
		pause();

   }

	else{printf("No hay señal");}

}


void start(){ // Esta funcion pide el pid del proceso acual 

		printf("Programa hora ejecutandose. PID=%d.\n", getpid());
                printf("Listo para recibir la señal SIGUSR1.\n");
                signal(SIGUSR1, signalHandler);
		//tambien llamamos a signalHandler	
		// al recivir la señal SIGUSR1
}

int main(int argc, char *argv[]){

	int n = 0;
	signal(SIGINT, signalCtrl);//Aqui llamo a la funcion signalCtr 
    					//Cuando capta la señal SIGINT
	while(n<1) {//Creamos un bucle para manter el proceso activo 
		    //y se pausa para que no se ejecute constantemente 
		start();
        	pause();
		sleep(2);

   }
      
	return(EXIT_SUCCESS);
    
}
