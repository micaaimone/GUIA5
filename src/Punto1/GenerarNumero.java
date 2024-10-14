package Punto1;

import java.util.Random;

public class GenerarNumero {
    private int numeroIngresado;
    private int numero = generarAleatorio();


    public GenerarNumero(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }

    public GenerarNumero() {
    }

    public int getNumeroIngresado() {
        return numeroIngresado;
    }

    public void setNumeroIngresado(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }

    public int getNumero() {
        return numero;
    }

    //metodo
    public int generarAleatorio(){
        Random random = new Random();
        return random.nextInt(500) + 1;
    }

    public boolean comparar(){
        boolean comparar;
        //System.out.println("numero generado: " + numero);
        //System.out.println("NUMERO INGRESADO: " + numeroIngresado);
        if (numero == numeroIngresado)
        {
            comparar = true;
            System.out.println("Muy bn adivino el nro: " + numero);
        } else {
            comparar = false;
            if (numeroIngresado<numero){
                System.out.println("El numero ingresado es menor al numero que debe adivinar");
            } else {
                System.out.println("El numero ingresado es mayor al numero que debe adivinar");
            }
        }
        return comparar;
    }

}
