<<<<<<< HEAD
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {}

    public static Scanner leer = new Scanner(System.in);

    //Validaciones:

    public static boolean sonIguales(double num1, double num2) {
        return num1 == num2;
    } //retorna true si son iguales, false sino

    public static boolean isMayorCero(double num1) {
        return num1 > 0;
    }//retorna true si es mayor que cero, false sino

    public static boolean isDistintoCero(double num1) {
        return num1 != 0; }


    //Formulas Basicas:

    public static double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double resta(double numero1, double numero2) {
        return numero2 - numero1;
    }

    public static double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double Divicion(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static double maximo (double num1, double num2) {
        return Math.max(num1, num2); }

    public static double minimo (double num1, double num2) {
        return Math.min(num1, num2); }

    public static double potencia (double num1, double num2) {
        return Math.pow(num1, num2); }

    public static double porcentaje(double numero1, double porcentaje) {
        return (numero1 * porcentaje) / 100;
    }

    public static double redondear(double num) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(num).replace(',', '.'));
    }


    //Formulas areas y volumenes:

    public static double perimetroCuadradoRectangulo(double ladoa, double ladob) {
        return redondear(2 * ladoa + 2 * ladob);
    }

    public static double perimetroCirculo (double radio) {
        return 2 * Math.PI * radio; }

    public static double areaCuadradoRectangulo(double ladoa, double ladob) {
        return redondear(ladoa * ladob);
    }

    public static double areaCirculo (double radio) {
        return Math.PI * potencia(radio,2); }

    public static double areaEsfera(double radio) {
        return redondear(Math.PI * 4 * Math.pow(radio, 2));
    }

    public static double areaCubo(double lado) {
        return redondear(6 * areaCuadradoRectangulo(lado, lado));
    }

    public static double areaCono(double Altura, double Radio) {
        double Hipoten = Math.sqrt(Math.pow(Altura, 2) + Math.pow(Radio, 2));
        return redondear(Math.PI * Math.pow(Radio, 2) + Math.PI * Radio * Hipoten);
    }

    public static double volumenEsfera (double radio) {
        return (double) 4/3 * Math.PI * potencia(radio, 3); }

    public static double volumenCono (double radio, double altura) {
        return (double) 1/3 * Math.PI * altura * potencia(radio,2); }

    public static double volumenCubo(double lado) {
        return redondear(Math.pow(lado, 3));
    }

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

    // Interseccion Rectas
    public static String interseccionRectas(double A, double B, double C, double D, double E, double F) {

        if (A*E - B*D == 0){
            return "No hay solucion unica";
        }

        double factor = D / A;

        double Y = (F - factor * C) / (E - factor * B);
        double X = (C - B * Y) / A;
        return ("X = " + X + ", Y = " + Y);
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

    public static void B_Suma(){
        System.out.println("\nPrimer valor: ");
        double num1 = validarMedida();

        System.out.println("\nSegundo valor: ");
        double num2 = validarMedida();

        mostrarResultado(suma(num1, num2));
    }

    public static void B_Resta(){
        System.out.println("\nPrimer valor: ");
        double num1 = validarMedida();

        System.out.println("\nSegundo valor: ");
        double num2 = validarMedida();

        mostrarResultado(resta(num1, num2));
    }

    public static void B_Multiplicacion(){
        System.out.println("\nPrimer valor: ");
        double num1 = validarMedida();

        System.out.println("\nSegundo valor: ");
        double num2 = validarMedida();

        mostrarResultado(multiplicacion(num1, num2));
    }

    public static void B_division(){

        System.out.println("\nIngrese Numerador: ");
        double num1 = validarCoordenada();

        double num2 = 0;

        do {

            System.out.println("\nIngrese Numerador: ");
            num2 = validarCoordenada();

        } while (!isDistintoCero(num2));

        mostrarResultado(Divicion(num1, num2));
    }

    public static void B_Porcentaje(){

        System.out.println("\nIngrese el numero al cual quiere calcular su porcentaje: ");
        double num1 = validarMedida();

        System.out.println("\nIngrese el numero respecto del cual requiere calcular el porcentaje: ");
        double porcentaje = validarMedida();

        mostrarResultado(porcentaje(num1, porcentaje));

    }

    public static void B_AreaCirculo() {

        System.out.println("\nSe requiere el radio del circulo");
        double radio = validarMedida();
        mostrarResultado(areaCirculo(radio));

    }

    public static void B_PerimetroCirculo(){

        System.out.println("\nSe requiere el radio del circulo");
        double radio = validarMedida();
        mostrarResultado(perimetroCirculo(radio));

    }

    public static void B_VolumenEsfera(){

        System.out.println("\nSe requiere el radio de la esfera");
        double radio = validarMedida();
        mostrarResultado(volumenEsfera(radio));
    }

    public static void B_VolumenCono(){

        System.out.println("\nSe requiere el radio del cono");
        double radio = validarMedida();

        System.out.println("\nSe requiere la altura del cono");
        double altura = validarMedida();

        mostrarResultado(volumenCono(radio, altura));
    }

    public static void B_EcuacionRecta() {

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

        try {

            System.out.println(obtenerEcuacionRecta(x1, y1, x2, y2));

        } catch (ArithmeticException e) {

            System.out.println("Error: División por cero. Las coordenadas x1 y x2 deben ser diferentes.");
        }
    }

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

    public static void B_AreaEsfera() {

        try {
            System.out.println("Ingrese el radio.");
            double radio = leer.nextDouble();

            if (isMayorCero(radio)) {

                System.out.println("El area es: " + areaEsfera(radio));

            } else {
                System.out.println("No se permite radio menor o igual a 0.");
            }

        } catch (Exception error) {
            System.out.println("Error al ingresar dato.");
        }
    }

    public static void B_AreaCubo () {
        try {
            System.out.println("Ingres el lado.");
            double LadoA = leer.nextDouble();

            if (isMayorCero(LadoA)) {

                System.out.println("El area es: " + areaCubo(LadoA));

            } else {
                System.out.println("No se permiten lados menores o iguales a 0.");
            }

        } catch (Exception error) {
            System.out.println("Error al ingresar dato.");
        }

    }

    public static void B_VolumenCubo () {

        try {
            System.out.println("Ingres el lado.");
            double LadoA = leer.nextDouble();

            if (isMayorCero(LadoA)) {

                System.out.println("El volumen es: " + volumenCubo(LadoA));

            } else {
                System.out.println("No se permiten lados menores o iguales a 0.");
            }

        } catch (Exception error) {
            System.out.println("Error al ingresar dato.");
        }

    }

    public static void B_AreaCono () {

        try {

            System.out.println("Ingrese la altura seguida del radio.");
            double altura = leer.nextDouble();
            double radio = leer.nextDouble();

            if (isMayorCero(altura) && isMayorCero(radio)) {

                System.out.println("El area es: " + areaCono(altura, radio));

            } else {
                System.out.println("No se permiten valores menores o iguales a 0.");
            }

        } catch (Exception error) {
            System.out.println("Error al ingresar dato.");
        }
    }

    public static void B_InterseccionRectas () {

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

            System.out.println(interseccionRectas(A, B, C, D, E, F));

        } catch (Exception error) {
            System.out.println("Error al ingresar dato.");
        }

    }

    public void menu_OpAritmet(){

        int continuar = 0;

        do {

            mostrarMenuOpAritmet();
            int opcion = leer.nextInt();

            switch (opcion) {

                case 0 -> continuar = 1;

                case 1 -> B_Suma();

                case 2 -> B_Resta();

                case 3 -> B_Multiplicacion();

                case 4 -> B_division();

                case 5 -> B_Porcentaje();

                default -> System.out.println("Ingrese una opcion valida.");

            }

        } while (continuar != 1) ;
    }

    public static void menu_FigsGeom () { //uno de los menus

        int continuar = 0;

        do {

            mostrarMenuFigsGeom();
            int opcion = leer.nextInt();

            switch (opcion) {

                case 0 -> continuar = 1;

                case 1 -> B_PerimetroCirculo();

                case 2 -> B_PerimetroCuadradoRectangulo();

                case 3 -> B_AreaCirculo();

                case 4 -> B_AreaCuadradoRectangulo();

                case 5 -> B_AreaCubo();

                case 6 -> B_AreaEsfera();

                case 7 -> B_AreaCono();

                case 8 -> B_VolumenCubo();

                case 9 -> B_VolumenEsfera();

                case 10 -> B_VolumenCono();

                default -> System.out.println("Ingrese una opcion valida.");

            }
        } while (continuar != 1) ;
    }

    public static void mostrarMenuFigsGeom () {
        System.out.println("\nMenu Figuras Geometricas ");
        System.out.println("[0] Volver\n[1] Perimetro Circulo\n[2] Perimetro Cuadrado o Rectangulo\n[3] Area Circulo\n[4] Area Cuadrado o Rectangulo\n[5] Area Cubo\n[6] Area Esfera\n[7] Area Cono\n[8] Volumen Cubo\n[9] Volumen ESfera\n[10] Volumen Cono");
        System.out.println("Ingrese su opcion: ");
    }

    public static void mostrarMenuOpAritmet() {
        System.out.println("\nMenu Figuras Geometricas ");
        System.out.println("[0] Volver\n[1] Suma\n[2] Resta\n[3] Multiplicacion\n[4] Division\n[5] Porcentaje");
        System.out.println("Ingrese su opcion: ");
    }

}//hasta aqui






=======
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
    public static double[] sistema2x2(double a, double b, double c, double d, double e, double f) {
        double determinante = (a * e) - (b * d);
        double x = 0;
        double y = 0;
        try {
            if (determinante != 0) {
                x = ((c * e) - (b * f)) / (determinante);
                y = ((a * f) - (d * c)) / (determinante);
            }
        }catch (ArithmeticException ae){
            throw new ArithmeticException("error: "+ ae.getMessage());
        }return new double[]{x, y};
    }

}
>>>>>>> origin/Javier_Alcalde
