public class Main {
    public static void main(String[] args) {
        calculoCuadratica(2,4,2);
    }
    public static double suma(double num1, double num2){
        return num1 + num2;
    }
    public static double resta(double num1, double num2){
        return num1 - num2;
    }
    public static double dividir(double num1, double num2){
        try {
            return num1 / num2;
        }catch (ArithmeticException ae){
            System.err.println("Error: " + ae.getMessage());
            return Double.NaN; // Devuelve NaN (Not-a-Number) como un valor predeterminado en caso de error
        }
    }
    public static double producto(double num1, double num2){
        return num1 * num2;
    }
    public static double numMayor(double num1, double num2){
        return Math.max(num1,num2);
    }
    public static double numMenor(double num1, double num2){
        return Math.min(num1,num2);
    }
    public static boolean isDistintoCero(double num){
        return num == 0;
    }
    public static boolean sonDistintos(double num1, double num2){
        return num1 == num2;
    }
    public static double calcularDiscriminante(double a, double b, double c){
        if (4*a*c > b*b){
            throw new ArithmeticException("No tiene solucino real");
        }else{
            return Math.sqrt(b*b - 4*a*c);
        }
    }
    public static void calculoCuadratica(double a, double b, double c){
        if (isDistintoCero(a)){
            throw new ArithmeticException("No es una cuadratica, ya que a es igual a 0");
        }
        double discriminante = calcularDiscriminante(a,b,c);
        double x1, x2;
        if (discriminante > 0){
            x1 = (-b + discriminante) / (a*2);
            x2 = (-b - discriminante) / (a*2);
            System.out.println("Solucion x1 = " + x1 + " Solucion x2 = " + x2);
        }
        else if(discriminante == 0){
            x1 = (-b + discriminante) / (a*2);
            System.out.println("Unica solucion: x1 = " + x1);
        }
    }
    public static void sistema2x2(double a, double b, double c, double d, double e, double f){

    }
}