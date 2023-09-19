Calculadora compartida POO

Java excepcions:
https://rymden.nu/exceptions.html

Java applet calculos:
https://es.onlinemschool.com/math/assistance/figures_volume/cone/

do {
System.out.print("Ingrese el radio del circulo: ");
try {

                radio = leer.nextInt();
                if (isMayorCero(radio)) {
                    continuar = 1;
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un valor numerico");
            }

        } while (continuar != 0);
