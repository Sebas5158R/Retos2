import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        //Instanciar clases
        Scanner teclado = new Scanner(System.in);

        //Reto de maquina expendedora

        //Declarar variables
        int [][] posicion = new int [4][4];
        String [][] nombreProducto = new String[4][4];
        int [][] precio =  new int[4][4];

        //Operación(CICLO)
        for(int i=0; i<posicion.length; i++){
            for(int j=0; j<posicion.length; j++){
                //Solicitar datos
                System.out.println("Ingrese la posicion del producto que quiere agregar");
                //Capturar datos
                posicion[i][j]=teclado.nextInt();
                //Solicitar datos
                System.out.println("Ingrese el nombre del producto");
                //Capturar datos
                nombreProducto[i][j]=teclado.next();
                //Solicitar datos
                System.out.println("Ingrese el precio");
                //Capturar datos
                precio[i][j]=teclado.nextInt();
            }
        }

        //Operación para mostrar resultados(CICLO)
        for(int i=0; i<posicion.length; i++){
            for(int j=0; j<posicion.length; j++){
                //Solicitar datos
                System.out.println("Ingrese que es lo que quiere hacer:\n1.Comprar\n2.Salir");
                //Capturar datos
                int desicion=teclado.nextInt();

                //Operacion
                switch(desicion){
                    case 1:
                    //Uso de la segunda clase para mostrar productos
                    mostrarProductos(posicion, nombreProducto, precio);
                    //Solicitar datos
                    System.out.println("Ingrese el codigo del producto");
                    //Capturar datos
                    int code=teclado.nextInt();
                    //Operación
                    if(code==posicion[i][j]){
                        System.out.println("Gracias por su compra de: "+nombreProducto[i][j]+" "+"por: "+precio[i][j]);
                    }
                    break;

                    case 2:
                    System.out.println("Adiós");
                }
            }


            //Limpiar buffer
            teclado.close();
        }
    }

    //otra clase para mostrar los productos
    public static void mostrarProductos(int[][] codigo,  String[][] nombres, int[][] Precios){

        //Operación
        for(int i=0; i<codigo.length; i++){
            for(int j=0; j<codigo.length; j++){
                System.out.println(codigo[i][j]+" "+nombres[i][j]+" "+Precios[i][j]);
            }
        }
        }
    
}
