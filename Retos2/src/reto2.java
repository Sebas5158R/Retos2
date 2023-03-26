import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        //Instanciar clases
        Scanner teclado = new Scanner(System.in);

        //Reto de competición

        //Declarar variables
        int n;

        //Solicitar datos
        System.out.println("Ingrese la cantidad de participantes");
        //Capturar datos
        n=teclado.nextInt();
        
        //Declarar variables(Arrays)
        String nombres[] = new String[n];
        
        //Operación(CICLO)
        for (int i = 0; i < n; i++) {
            //Solicitar dato
            System.out.println("Por favor ingrese nombre");
            //Capturar dato
            nombres[i] = teclado.next();
    
        }

        //Operación(CICLO)
        for(int i=0; i<n; i++){
            //Mostrar en pantalla
            System.out.println("Gracias a: "+nombres[i]+", Por participar");
        }
        
        //Operación para mostrar resultados
        int ganador = (int) (Math.random()*n);
        int t1=30, t2=35, t3=40;
        //Mostrar en pantalla
        System.out.println("El ganador es: " + nombres[ganador]+", con un tiempo de: "+t1+": segundos");
        int segundo = (int) (Math.random()*n);
        //Mostrar en pantalla
        System.out.println("El segundo puesto es para: "+nombres[segundo]+", con un tiempo de: "+t2+": segundos");
        int tercero = (int) (Math.random()*n);
        //Mostrar en pantalla
        System.out.println("El tercer puesto es para: "+nombres[tercero]+", con un tiempo de: "+t3+": segundos");


        //Limpiar buffer
        teclado.close();
    }
    
    }

