import Punto1.*;
import Punto4.*;

import java.util.Scanner;

public class Menu {

    public void menu() throws ExcepcionesColegio {
        Scanner scanner = new Scanner(System.in);
        boolean seguirMenu = true;

        while (seguirMenu) {
            System.out.println("Que punto desea hacer? \n"
                    + "1- Adivinar el numero");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    int intentos = 0;
                    int numero = 0;
                    boolean adivino = false;
                    IngresoPorConsola ingreso = new IngresoPorConsola();
                    System.out.println("Generando el numero aleatorio...\n");
                    GenerarNumero generarNumero = new GenerarNumero();

                    while (!adivino) {
                        try{
                            numero = ingreso.ingreseNumero("Ingrese un numero entre el 1 y el 500 \n");
                            intentos++;
                            generarNumero.setNumeroIngresado(numero);
                            adivino = generarNumero.comparar();
                        } catch (ExcepcionSoloNumeros e){
                            System.out.println(e.getMessage());
                            intentos++;
                            //e.printStackTrace();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }

                    System.out.println("Logro adivinar el numero " + numero + " en " + intentos + " intentos");
                    break;
                case 2:
                    Alumno alumno = new Alumno("Pedro", null);
                    Alumno alumno1 = new Alumno(null,Nacionalidad.Argentino);
                    Alumno alumno2 = new Alumno("Juanchi", Nacionalidad.Boliviano);
                    Alumno alumno3 = new Alumno("Mica", Nacionalidad.Chileno);

                    Colegio colegio = new Colegio();
                    System.out.println("Ingresando los alumnos \n");
                    try {
                        colegio.agregarAlumno(alumno);
                        colegio.agregarAlumno(alumno1);
                        colegio.agregarAlumno(alumno2);
                        colegio.agregarAlumno(alumno3);
                    } catch (ExcepcionesColegio e) {
                        throw new ExcepcionesColegio(e.getMessage());
                    }

                    System.out.println("Que desea hacer?");


                    break;
            }

            System.out.println("Desea seguir en el menu? true/false\n");
            seguirMenu = scanner.nextBoolean();
            scanner.nextLine();
        }
    }

}
