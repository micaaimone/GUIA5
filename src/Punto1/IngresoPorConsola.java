package Punto1;

import java.util.Scanner;

public class IngresoPorConsola {
    public IngresoPorConsola() {
    }

    public int ingreseNumero(String mensaje) throws ExcepcionSoloNumeros {
        System.out.println(mensaje);
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();

        //lo ingreso como cadena, .matches("\\d+") lo explico como;
        //"\\d" sirve para representar un numero entre el 0 y el 9
        // "+" sirve para decir que es uno o mas digitos, osea me aseguro q es al menos 1 digito
        if (!cadena.matches("\\d+")) {
            throw new ExcepcionSoloNumeros("Ingreso caracteres invalidos. Solo puede ingresar numeros.");
        }

        int numero = Integer.parseInt(cadena);

        //verifico que el numero que ingrese el usuario sea entre 1 y 500
        if (numero<1 || numero>500){
            throw new ExcepcionSoloNumeros("Ingreso de numero incorrecto, solo puede ingresar un numero entre el 1 y el 500");
        }

        return numero;
    }
}
