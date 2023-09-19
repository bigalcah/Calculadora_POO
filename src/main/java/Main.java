import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String [] args ){
        calculoAreaCirculo();
    }

    //Validaciones:
    public static boolean sonDistintos (double num1, double num2) {
        return num1 != num2; } //retorna true si son distintos, false sino

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
    public static double areaCirculo (double radio) {
        return Math.PI * potencia(radio,2); }

    public static double perimetroCirculo (double radio) {
        return 2 * Math.PI * radio; }

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
        return (y2-y1)/(x2 - x1);
    }


    //Metodos para realizar los calculos de las areas y volumenes

    public static void mostrarResultado(double resultado) {
        System.out.println("Resultado = " + resultado);
    }
    public static void calculoAreaCirculo() {

        double radio = 0;

        do {

            try{
                System.out.print("Ingresa el radio del círculo: ");
                String input = leer.next();
                radio = Double.parseDouble(input);
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número válido.");
            }

        } while (!isMayorCero(radio));

        mostrarResultado(areaCirculo(radio));

    }


}
