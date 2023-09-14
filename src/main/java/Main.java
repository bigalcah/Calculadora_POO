import java.text.DecimalFormat;

public class Main {
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

    public static double redondear(double num){//arreglando
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(num));
    }

    public static double porcentaje(double numero1, double porcentaje){
        return (numero1*porcentaje)/100;
    }


    //Areas - Perimetros - Volumen
    public static boolean isMayorCero(double num1){
        return (num1 > 0);
    }

    public static double perimetroCuadradoRectangulo(double ladoa, double ladob){
        return 2*ladoa+2*ladob;
    }

    public static double areaCuadradoRectangulo(double ladoa, double ladob){
        return ladoa*ladob;
    }

    public static double areaEsfera(double radio){
        return Math.PI*4*Math.pow(radio,2);
    }

    public static double areaCubo(double lado){
        return redondear(6*areaCuadradoRectangulo(lado, lado));
    }

    public static double volumenCubo(double lado){
        return Math.pow(lado, 3);
    }

    public static double areaCono(double Altura, double Radio){
        double Hipoten = Math.sqrt(Math.pow(Altura, 2) + Math.pow(Radio, 2));
        return Math.PI*Math.pow(Radio, 2)+ Math.PI*Radio*Hipoten;
    }


    // Rectas

}
