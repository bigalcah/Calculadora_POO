import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static Scanner leer = new Scanner(System.in);

    public static double Suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double resta(double numero1, double numero2) {
        return numero2 - numero1;
    }

    public static double Multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double Divicion(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static double Mayor(double numero1, double numero2) {
        return Math.max(numero1, numero2);
    }

    public static double Menor(double numero1, double numero2) {
        return Math.min(numero1, numero2);
    }

    public static double Potencia(double numero1, double Potencia) {//se muere con potencias double
        return Math.pow(numero1, Potencia);
    }

    public static double porcentaje(double numero1, double porcentaje) {
        return (numero1 * porcentaje) / 100;
    }

    public static double redondear(double num) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(num).replace(',', '.'));
    }

    //Areas - Perimetros - Volumen
    public static boolean isMayorCero(double num1) {
        return (num1 > 0);
    }

    public static double perimetroCuadradoRectangulo(double ladoa, double ladob) {
        return redondear(2 * ladoa + 2 * ladob);
    }

    public static double areaCuadradoRectangulo(double ladoa, double ladob) {
        return redondear(ladoa * ladob);
    }

    public static double areaEsfera(double radio) {
        return redondear(Math.PI * 4 * Math.pow(radio, 2));
    }

    public static double areaCubo(double lado) {
        return redondear(6 * areaCuadradoRectangulo(lado, lado));
    }

    public static double volumenCubo(double lado) {
        return redondear(Math.pow(lado, 3));
    }

    public static double areaCono(double Altura, double Radio) {
        double Hipoten = Math.sqrt(Math.pow(Altura, 2) + Math.pow(Radio, 2));
        return redondear(Math.PI * Math.pow(Radio, 2) + Math.PI * Radio * Hipoten);
    }


    // Rectas
    public static String interseccionRectas(double A, double B, double C, double D, double E, double F) {
        if (A*E - B*D == 0){
            return "No hay solucion unica";
        }

        double factor = D / A;

        double Y = (F - factor * C) / (E - factor * B);
        double X = (C - B * Y) / A;
        return ("X = " + X + ", Y = " + Y);
    }



    // Botones
    public static void B_PerimetroCuadradoRectangulo(){
        try {
            System.out.println("Ingrese los lados.");
            double LadoA = leer.nextDouble();
            double LadoB = leer.nextDouble();

            if (isMayorCero(LadoA) && isMayorCero(LadoB)){

                System.out.println("El perimetro es: " + perimetroCuadradoRectangulo(LadoA, LadoB));

            }else{
                System.out.println("No se permiten lados menores o iguales a 0.");
            }

        } catch (Exception error){
            System.out.println("Error al ingresar dato.");
        }

    }
    public static void B_AreaCuadradoRectangulo(){
        try {
            System.out.println("Ingrese los lados.");
            double LadoA = leer.nextDouble();
            double LadoB = leer.nextDouble();

            if (isMayorCero(LadoA) && isMayorCero(LadoB)){

                System.out.println("El area es: " + areaCuadradoRectangulo(LadoA, LadoB));

            }else{
                System.out.println("No se permiten lados menores o iguales a 0.");
            }

        } catch (Exception error){
            System.out.println("Error al ingresar dato.");
        }

    }
    public static void B_AreaEsfera(){
        try {
            System.out.println("Ingrese el radio.");
            double radio = leer.nextDouble();

            if (isMayorCero(radio)){

                System.out.println("El area es: " + areaEsfera(radio));

            }else{
                System.out.println("No se permite radio menor o igual a 0.");
            }

        } catch (Exception error){
            System.out.println("Error al ingresar dato.");
        }

    }
    public static void B_AreaCubo(){
        try {
            System.out.println("Ingres el lado.");
            double LadoA = leer.nextDouble();

            if (isMayorCero(LadoA)){

                System.out.println("El area es: " + areaCubo(LadoA));

            }else{
                System.out.println("No se permiten lados menores o iguales a 0.");
            }

        } catch (Exception error){
            System.out.println("Error al ingresar dato.");
        }

    }
    public static void B_VolumenCubo(){
        try {
            System.out.println("Ingres el lado.");
            double LadoA = leer.nextDouble();

            if (isMayorCero(LadoA)){

                System.out.println("El volumen es: " + volumenCubo(LadoA));

            }else{
                System.out.println("No se permiten lados menores o iguales a 0.");
            }

        } catch (Exception error){
            System.out.println("Error al ingresar dato.");
        }

    }
    public static void B_AreaCono(){
        try {
            System.out.println("Ingrese la altura seguida del radio.");
            double altura = leer.nextDouble();
            double radio = leer.nextDouble();

            if (isMayorCero(altura) && isMayorCero(radio)){

                System.out.println("El area es: " + areaCono(altura, radio));

            }else{
                System.out.println("No se permiten valores menores o iguales a 0.");
            }

        } catch (Exception error){
            System.out.println("Error al ingresar dato.");
        }

    }

    public static void B_InterseccionRectas(){
        try {
            System.out.println("Ingrese los valores para las rectas de la forma: \n\tAx + By = C \nPrimera recta\nA:");
            double A = leer.nextDouble();
            System.out.println("B:");
            double B = leer.nextDouble();
            System.out.println("C:");
            double C = leer.nextDouble();

            System.out.println("\nSegunda recta\nA:");
            double D = leer.nextDouble();
            System.out.println("B:");
            double E = leer.nextDouble();
            System.out.println("C:");
            double F = leer.nextDouble();

            System.out.println(interseccionRectas(A,B,C,D,E,F));

        } catch (Exception error){
            System.out.println("Error al ingresar dato.");
        }

    }

}
