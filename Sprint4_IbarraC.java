import java.util.Scanner;

public class Sprint4_IbarraC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitud y validación del número de registro
        int kidInscription = 0;
        boolean esValido = false;
       

        while (!esValido) {
            System.out.println("Num. de registre del nen: ");
            if (teclado.hasNextInt()) { // Verificar si es un entero
                kidInscription = teclado.nextInt();
                if (kidInscription >= 1 && kidInscription <= 499) {
                    esValido = true;
                } else {
                    System.out.println("Error: El número debe estar entre 1 y 499.");
                }
            } else {
                System.out.println("Error: Introduzca un número entero válido.");
                teclado.next(); // Sustituir la entrada no válida
            }
        }

        // Resto de entradas, sin validación adicional
        System.out.println("Té algun germà al centre (0:no / 1:si): ");
        int brother = leerEnteroValido(teclado);
        System.out.println("Viu a la zona de l'escola (0:no / 1:si): ");
        int samePoblation = leerEnteroValido(teclado);
        System.out.println("El pare o mare treballa a la zona de l'escola (0:no / 1:si): ");
        int jobPoblation = leerEnteroValido(teclado);
        System.out.println("Té alguna discapacitat igual o superior al 33% o malaltia crònica (0:no / 1:si): ");
        int disability = leerEnteroValido(teclado);
        System.out.println("La familia del nen es nombrosa (0:no / 1:si): ");
        int bigFamily = leerEnteroValido(teclado);
        System.out.println("Algun familiar o tutor legal que ha estat escolaritzat a la mateixa escola (0:no / 1:si): ");
        int pastSchoolMembers = leerEnteroValido(teclado);

        // Resto de la lógica
        if (brother == 1) {
            brother = 40;
        }

        if (samePoblation == 1) {
            samePoblation = 30;
        }

        if (jobPoblation == 1) {
            jobPoblation = 20;
        }

        if (disability == 1) {
            disability = 10;
        }

        if (bigFamily == 1) {
            bigFamily = 15;
        }

        if (pastSchoolMembers == 1) {
            pastSchoolMembers = 5;
        }

        if (samePoblation > jobPoblation) {
            jobPoblation = 0;
        }

        int suma = brother + samePoblation + jobPoblation + disability + bigFamily + pastSchoolMembers;
        System.out.println("El nen amb el número " + kidInscription + " té " + suma + " punts");
        
        teclado.close();
    }

  // Método que valida si la entrada es un número entero y está entre 0 y 1
public static int leerEnteroValido(Scanner teclado) {
    int numero;
    do {
        System.out.println("Introduce un número entero entre 0 y 1: ");
        while (!teclado.hasNextInt()) { // Verificar si es un entero
            System.out.println("Error: Introduzca un número entero válido.");
            teclado.next(); // Sustituir la entrada no válida
        }
        numero = teclado.nextInt();
        if (numero < 0 || numero > 1) {
            System.out.println("Error: El número debe estar entre 0 y 1.");
        }
    } while (numero < 0 || numero > 1); // Repetir hasta que esté en el rango
    return numero;
}

}
