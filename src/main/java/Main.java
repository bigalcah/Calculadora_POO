<<<<<<< HEAD
public class Main {
=======
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in);
    public static void main(String [] args ){menu_FigsGeom();}

    //Validaciones:

    public static boolean sonIguales (double num1, double num2) {
        return num1 == num2; } //retorna true si son iguales, false sino

    public static boolean isMayorCero(double num1) {
        return num1 > 0; }//retorna true si es mayor que cero, false sino

    public static boolean isDistintoCero(double num1) {
        return num1 != 0; }

    //Formulas Basicas:

    public static double maximo (double num1, double num2) {
        return Math.max(num1, num2); }

    public static double minimo (double num1, double num2) {
        return Math.min(num1, num2); }

    public static double potencia (double num1, double num2) {
        return Math.pow(num1, num2); }


    //Formulas areas y volumenes:

    public static double perimetroCirculo (double radio) {
        return 2 * Math.PI * radio; }

    public static double areaCirculo (double radio) {
        return Math.PI * potencia(radio,2); }

    public static double volumenEsfera (double radio) {
        return (double) 4/3 * Math.PI * potencia(radio, 3); }

    public static double volumenCono (double radio, double altura) {
        return (double) 1/3 * Math.PI * altura * potencia(radio,2); }

    //Ecuacion de la recta:
    public static String obtenerEcuacionRecta (double x1, double y1, double x2, double y2) {

        double pendiente = obtenerPendiente(x1, y1, x2, y2);
        double corteEjeY = -(pendiente*x1) + y1;

        if (pendiente == 0) {
            return "y = " + corteEjeY;
        }

        return  "y = " + pendiente + "x + " + corteEjeY;

    }

    public static double obtenerPendiente(double x1, double y1, double x2, double y2){

        if(sonIguales(x1,x2)) {
            throw new ArithmeticException("No se puede dividir por sero");
        }

        return (y2-y1)/(x2 - x1);
    }


    //Metodos para realizar los calculos de las areas y volumenes

    public static void mostrarResultado(double resultado) {
        System.out.println("Resultado = " + resultado);
    }

    public static double validarMedida(){
        //verifica que, en el caso de ser la medida de una figura, sea mayor distinto de cero
        // ademas maneja expecion de inbgresar un caracter alfabetico, y no numerico

        double medida = 0;

        do {

            try{
                System.out.print("Ingresa la medida necesaria: ");
                String input = leer.next();
                medida = Double.parseDouble(input);
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un valor numerico.");
            }

        } while (!isMayorCero(medida));

        return medida;

    } //para areas y volumenes

    public static double validarCoordenada(){

        double punto = 0;
        int conitunar = 0;

        do {

            try{
                System.out.print("Ingresa la coordenada solicitada: ");
                String input = leer.next();
                punto = Double.parseDouble(input);
                conitunar = 1;
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un valor numerico.");
            }

        } while (conitunar != 1);

        return punto;
    } //para la recta

    public static void calculoAreaCirculo() {

        System.out.println("\nSe requiere el radio del circulo");
        double radio = validarMedida();
        mostrarResultado(areaCirculo(radio));

    }

    public static void calculoPerimetroCirculo(){

        System.out.println("\nSe requiere el radio del circulo");
        double radio = validarMedida();
        mostrarResultado(perimetroCirculo(radio));

    }

    public static void calculoVolumenEsfera(){

        System.out.println("\nSe requiere el radio de la esfera");
        double radio = validarMedida();
        mostrarResultado(volumenEsfera(radio));
    }

    public static void calculoVolumenCono(){

        System.out.println("\nSe requiere el radio del cono");
        double radio = validarMedida();

        System.out.println("\nSe requiere la altura del cono");
        double altura = validarMedida();

        mostrarResultado(volumenCono(radio, altura));
    }

    public static void calculoEcuacionRecta(){

        System.out.println("\nIngrese la coordenada X del primer punto");
        double x1 = validarCoordenada();
        System.out.println();

        System.out.println("Ingrese la coordenada Y del primer punto");
        double y1 = validarCoordenada();
        System.out.println();

        System.out.println("Ingrese la coordenada X del segundo punto");
        double x2 = validarCoordenada();
        System.out.println();

        System.out.println("Ingrese la coordenada Y del segundo punto");
        double y2 = validarCoordenada();
        System.out.println();

        try{

            System.out.println(obtenerEcuacionRecta(x1,y1,x2,y2));

        }catch (ArithmeticException e) {

            System.out.println("Error: División por cero. Las coordenadas x1 y x2 deben ser diferentes.");
        }

    }

    public static void menu_FigsGeom(){ //uno de los menus

        int continuar = 0;

        do {

            mostrarMenuFigsGeom();
            int opcion = leer.nextInt();

            switch (opcion) {

                case 0 -> continuar = 1;


                case 1 -> calculoPerimetroCirculo();

                case 2 -> calculoAreaCirculo();

                case 3 -> calculoVolumenEsfera();

                case 4 -> calculoVolumenCono();

                default -> System.out.println("Ingrese una opcion valida.");

            }

        } while (continuar != 1);
    }

    public static void mostrarMenuFigsGeom(){
        System.out.println("\nMenu Figuras Geometricas ");
        System.out.println("[0] Volver\n[1] Perimetro Circulo\n[2] Area Circulo\n[3] Volumen ESfera\n[4] Volumen Cono");
        System.out.println("Ingrese su opcion: ");
    }

>>>>>>> Joaquin_Faundez_Avance2
}
