import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        //Instanciar clases
        Scanner teclado=new Scanner(System.in);

        //Declarar variables
        int n;
        
        //Solicitar dato
        System.out.println("Ingrese la cantidad de veces que desea digitar numeros");
        //Capturar dato
        n=teclado.nextInt();

        //Declarar array
        int[] multiplo=new int[n];
        //Operación
        for(int i=0; i<n; i++){
            //Solicitar dato
            System.out.println("Digite un numero");
            //Capturar dato
            multiplo[i]=teclado.nextInt();
        }

        //Operación de resultados
        for(int i=0; i<n; i++){
            //Operación
            if(multiplo[i]%2==0){
                //Mostrar en pantalla si es
                System.out.println("Es multiplo de dos: "+multiplo[i]);
            }else{//Mostrar en pantalla si no es
                System.out.println("No es multiplo de dos: "+multiplo[i]);
            }
        }

        //Limpiar buffer
        teclado.close();
    }
}
