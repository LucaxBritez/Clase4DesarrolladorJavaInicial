import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        //Uso la clase scan para poder recibir parametros por consola.
        Scanner scan = new Scanner(System.in);



//        /*1-Tomando los Ejercicios de la clase anterior
//        *   a-haga un main, donde por parámetro ponga 3 números y una letra que
//                 represente ascendente o descendente y los muestre ordenados por
//                     tal criterio*/
//        System.out.println("-----Ejercicio 1-A-----");
//
//        int num1 = 12;
//        int num2 = 2;
//        int num3 = 5;
//
//        System.out.println("Para ordenar de modo ascendente ingrese 'A', para ordenar de modo descendente ingrese 'D': ");
//        char ascDesc1 = scan.next().toUpperCase().charAt(0);
//
//        if(ascDesc1 == 'A'){
//            System.out.println("Este es el orden de los numeros ordenados de modo ascendente");
//            ordenarNumAsc(num1, num2, num3);
//        }else if(ascDesc1 == 'D'){
//            System.out.println("Este es el orden de los numeros ordenados de modo descendente: ");
//            ordenarNumDesc(num1, num2, num3);
//        }else{
//            System.out.println("La opcion ingresada no es correcta");
//        }
//
//        System.out.println(" ");
//
//        /*b-haga lo mismo, pero solicitando los parámetros de a uno por consola*/
//        System.out.println("-----Ejercicio 1-B-----");
//
//        System.out.println("Por favor ingrese el primer numero: ");
//        int num4= scan.nextInt();
//
//        System.out.println("Por favor ingrese el segundo numero: ");
//        int num5 = scan.nextInt();
//
//        System.out.println("Por favor ingrese el tercer numero: ");
//        int num6 = scan.nextInt();
//
//        System.out.println("Para ordenar de modo ascendente ingrese 'A', para ordenar de modo descendente ingrese 'D': ");
//        char ascDesc = scan.next().toUpperCase().charAt(0);
//
//        if(ascDesc == 'A'){
//            System.out.println("Este es el orden de los numeros ordenados de modo ascendente");
//            ordenarNumAsc(num4, num5, num6);
//        }else if(ascDesc == 'D'){
//            System.out.println("Este es el orden de los numeros ordenados de modo descendente: ");
//            ordenarNumDesc(num4, num5, num6);
//        }else{
//            System.out.println("La opcion ingresada no es correcta");
//        }
//
//
//
//        /*c-o mismo, pero usando los parámetros si hay alguno (como en a) y
//            haciendo (b) si no detecta ninguno. Vea si con una función puede
//                evitar repetir código.*/
//
//        System.out.println(" ");
//
//        System.out.println("-----Ejercicio 1-C-----");
//
//        int num7 = 12;
//        int num8 = 0;
//        int num9 = 2;
//
//        //If para definir si los parametros estan vacios.
//        if(num7 == 0){
//            System.out.println("Por favor ingrese un numero: ");
//            num7 = scan.nextInt();
//        }else if(num8 == 0){
//            System.out.println("Por favor ingrese un numero: ");
//            num8 = scan.nextInt();
//        }else if(num9 == 0){
//            System.out.println("Por favor ingrese un numero: ");
//            num9 = scan.nextInt();
//        }
//
//        //Con este segmento defino el tipo de orden que debe aplicarse.
//        System.out.println("Para ordenar de modo ascendente ingrese 'A', para ordenar de modo descendente ingrese 'D': ");
//        char ascDesc3 = scan.next().toUpperCase().charAt(0);
//
//        if(ascDesc3 == 'A'){
//            System.out.println("Este es el orden de los numeros ordenados de modo ascendente");
//            ordenarNumAsc(num7, num8, num9);
//        }else if(ascDesc3 == 'D'){
//            System.out.println("Este es el orden de los numeros ordenados de modo descendente: ");
//            ordenarNumDesc(num7, num8, num9);
//        }else{
//            System.out.println("La opcion ingresada no es correcta");
//        }
//
//        System.out.println(" ");
//
        /*Ejercicio 2:
            Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
                contener números. El programa debe escribir por consola la suma de esos números*/

//        System.out.println("-----Ejercicio 2-----");

        //Metodo que suma los numeros de un archivo .txt
//        receptorPathSum("C:\\Users\\Zeac\\Desktop\\Prueba\\Prueba1.txt");

        /*a-Al programa anterior agreguele un parámetro para que la operación pueda ser
            suma o multiplicación*/

//        System.out.println("-----Ejercicio 2-A-----");
//
//        System.out.println("Oprima S si desea sumar los numeros del archivo o M si desea multiplicarlos");
//        char multOrSum = scan.next().toUpperCase().charAt(0);
//
//        if(multOrSum == 'S'){
//            receptorPathSum("C:\\Users\\Zeac\\Desktop\\Prueba\\Prueba1.txt");
//        }else if(multOrSum == 'M'){
//            receptorPathMult("C:\\Users\\Zeac\\Desktop\\Prueba\\Prueba1.txt");
//        }else{
//            System.out.println("La opcion ingresada no es correcta");
//        }

        /*Ejercicio 3-
            Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
                codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
                    otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
                        resultados deben estar en el archivo de salida*/

        System.out.println("-----Ejercicio 3-----");

        //Variables que almacenan las direcciones de entrada y salida.
        String archivoEntrada = "C:\\Users\\Zeac\\Desktop\\PruebaEjercicio3\\Entrada.txt";
        String archivoSalida = "C:\\Users\\Zeac\\Desktop\\PruebaEjercicio3\\Salida.txt";

        //Creacion de la variable cifOrDescif utilizada en el bucle do while.
        char cifOrDescif = 'a';

        /*Bucle do while utilizado para determinar si se ejecutara el metodo
            para cifrar o descifrar.*/
        do {
            System.out.println("Ingrese la letra C para cifrar el contenido del archivo o ingrese la letra D para descifrarlo: ");
            cifOrDescif = scan.next().toUpperCase().charAt(0);

            System.out.println("Ingrese la cantidad de espacios que desea desplazarse dentro del abcedario del cifrado: ");
            int espacios = scan.nextInt();

            switch(cifOrDescif){
                case 'C':
                    System.out.println("Estamos dentro de c");
                     cifrar(archivoEntrada, archivoSalida, espacios);
                    break;

                case 'D':
                    System.out.println("Estamos dentro de d");
                    descifrar(archivoEntrada, archivoSalida, espacios);
                    break;


                default:
                    System.out.println("La letra ingresada no es correcta");
            }
        }while(cifOrDescif != 'C' && cifOrDescif != 'D');

    }


    public static void descifrar(String archEntrada,String archSalida, int desplazo) throws IOException{

        String abcedario = "abcdefghijklmnopqrstuvwxyz ";
        char[] arrayAbcedario = abcedario.toCharArray();

        for(String linea : Files.readAllLines(Paths.get(archEntrada))){

            char arrayLinea [] = linea.toCharArray();

            for(int i = 0; i<linea.length() ;i++){

                int index = abcedario.indexOf(arrayLinea[i]);
                int indexDesplazo = index - desplazo;

                int resta = indexDesplazo + 27;

                if(resta > 0 && resta < 27){
                    index = resta;
                    arrayLinea[i] = arrayAbcedario[index];
                }else{
                    arrayLinea[i] =  arrayAbcedario[index - desplazo];
                }

            }

            String contenidoDescifrado = String.valueOf(arrayLinea);
            System.out.println("El contenido Descifrado es: " + contenidoDescifrado);

            Files.writeString(Paths.get(archSalida), contenidoDescifrado);
        }
    }

    public static void cifrar(String archEntrada,String archSalida, int desplazo) throws IOException {

        String abcedario = "abcdefghijklmnopqrstuvwxyz ";
        char[] arrayAbcedario = abcedario.toCharArray();

        for(String linea : Files.readAllLines(Paths.get(archEntrada))){

            char arrayLinea [] = linea.toCharArray();

            for(int i = 0; i<linea.length() ;i++){

                int index = abcedario.indexOf(arrayLinea[i]);
                int indexDesplazo = index + desplazo;

                int resta = indexDesplazo - 27;

                if(resta > 0){
                    index = resta;
                    arrayLinea[i] = arrayAbcedario[index];
                }else{
                    arrayLinea[i] =  arrayAbcedario[index + desplazo];
                }



            }

            String contenidoCif = String.valueOf(arrayLinea);
            System.out.println("El contenido cifrado es: " + contenidoCif);

            Files.writeString(Paths.get(archSalida), contenidoCif);
        }

    }

    //Metodo para sumar los numeros del archivo.
    public static void receptorPathSum(String direccion) throws IOException {
        int suma = 0;

        for(String linea : Files.readAllLines(Paths.get(direccion))){
            System.out.println(linea);
            for(char caracter : linea.toCharArray()){
             //   System.out.println(caracter);
                int car = Integer.parseInt(String.valueOf(caracter));
                suma = suma + car;
            }
            System.out.println("La suma total de los numeros del archivo es: " + suma);
            suma = 0;
        }
    }

    //Metodo para multiplicar los numeros del archivo.
    public static void receptorPathMult(String direccion) throws IOException {
        int multi = 1;

        for(String linea : Files.readAllLines(Paths.get(direccion))){
            System.out.println(linea);
            for(char caracter : linea.toCharArray()){
                //   System.out.println(caracter);
                int car = Integer.parseInt(String.valueOf(caracter));
                multi = multi * car;
            }
            System.out.println("La multiplicacion total de los numeros del archivo es: " + multi);
            multi = 1;
        }
    }

    //Metodo para ordenar de modo ascendente.
    public static void ordenarNumAsc(int a, int b, int c) {

        int[] arrayOrd = new int[3];


        if (a <= b && a <= c) {
            arrayOrd[0] = a;
        }else if(a >= b && a <= c || a <= b && a >= c){
            arrayOrd[1] = a;
        }else if(a >= b && a >= c){
            arrayOrd[2] = a;
        }

        if(b <= a && b <= c){
            arrayOrd[0] = b;
        }else if(b >= a && b <=c ||b <= a && b >=c){
            arrayOrd[1] = b;
        }else if(b >= a && b >= c){
            arrayOrd[2] = b;
        }

        if(c <= a && c <= b){
            arrayOrd[0] = c;
        }else if(c >= a && c <= b||c <= a && c >= b){
            arrayOrd[1] = c;
        }else if(c >= a && c >= b){
            arrayOrd[2] = c;
        }
        for(int i : arrayOrd) {
            System.out.println(i);
        }
    }

    //Metodo para ordenar de modo descendente.
    public static void ordenarNumDesc(int a, int b, int c) {

        int[] arrayOrd = new int[3];


        if (a <= b && a <= c) {
            arrayOrd[2] = a;
        }else if(a >= b && a <= c || a <= b && a >= c){
            arrayOrd[1] = a;
        }else if(a >= b && a >= c){
            arrayOrd[0] = a;
        }

        if(b <= a && b <= c){
            arrayOrd[2] = b;
        }else if(b >= a && b <=c ||b <= a && b >=c){
            arrayOrd[1] = b;
        }else if(b >= a && b >= c){
            arrayOrd[0] = b;
        }

        if(c <= a && c <= b){
            arrayOrd[2] = c;
        }else if(c >= a && c <= b||c <= a && c >= b){
            arrayOrd[1] = c;
        }else if(c >= a && c >= b){
            arrayOrd[0] = c;
        }

        for(int i : arrayOrd) {
            System.out.println(i);
        }
    }


}
