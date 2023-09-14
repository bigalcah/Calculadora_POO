public class Main {

    public static void main(String [] args ){
       System.out.println(obtenerEcuacionRecta(4,6,3,5));
    }


    //Validaciones:
    public static boolean sonDistintos (double num1, double num2) {
        return num1 != num2; } //retorna true si son distintos, false sino

    public static boolean isMayorCero(double num1) {
        return num1 > 0; }//retorna true si es mayor que cero, false sino

    public static boolean isDistintoCero(double num1) {
        return num1 != 0; }


    //Fomrmulas:
    public static double maximo (double num1, double num2) {
        return Math.max(num1, num2); }

    public static double minimo (double num1, double num2) {
        return Math.min(num1, num2); }

    public static double potencia (double num1, double num2) {
        return Math.pow(num1, num2); }

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

        double pendiente = calculoPendiente(x1, y1, x2, y2);
        double corteEjeY = -(pendiente*x1) + y1;

        return  "y = " + pendiente + "x + " + corteEjeY;

    }

    public static double calculoPendiente (double x1, double y1, double x2, double y2){
        return (y2-y1)/(x2 - x1);
    }


}
