import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        //Instanciar clases
        Scanner teclado = new Scanner(System.in);

        //Reto del concentrese

        //Declarar variables(Matriz)
        String [][] adivina = new String[2][3];

        //Imprimir en pantalla
        System.out.println("Concentrese de palabras de animales:\n1.si escribes el animal y sale se repite es porque esta\n2.Si sale que no se repite es porque no esta");

        //Operación
        for(int i=0; i<adivina.length; i++){
            for(int j=0; j<adivina.length; j++){
                //Solicitar dato
                System.out.println("Ingrese un animal");
                //Capturar dato
                adivina[i][j]=teclado.next();
                //Solicitar
                System.out.println("escriba otra vez el mismo animal");
                //Capturar
                adivina[i][j]=teclado.next();

                //Operación
                    switch (adivina[i][j]) {
                        case "perro":
                        System.out.println("La palabra perro se repite");
                        break;

                        case "gato":
                        System.out.println("La palabra gato se repite");
                        break;
                        
                        case "tigre":
                        System.out.println("La palabra tigre se repite");
                        break;

                        case "leon":
                        System.out.println("La palabra leon se repite");
                        break;

                        default:
                        System.out.println("No se repite");
                        break;
                    }
            }
        }

        //Mostrar en pantalla
        System.out.print("Las palabras a adivinar eran:\n1.perro\n2.gato\n3.tigre\n4.leon"+"\t");

        //Limpiar buffer
        teclado.close();

    }
}
