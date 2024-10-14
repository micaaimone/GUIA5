package Punto4;

import Punto1.ExcepcionSoloNumeros;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Colegio {
    private LinkedHashSet<Alumno> alumnos;

    //constructor
    public Colegio() {
        this.alumnos = new LinkedHashSet<>();
    }

    //metodos
    public void agregarAlumno (Alumno alumno) throws ExcepcionesColegio {
        //chequear illegalArgumentException


        /*
        if((alumno.getNombreApellido() != null) && (alumno.getNacionalidad() != null)){
            alumnos.add(alumno);
            System.out.println("Alumno " + alumno.getNombreApellido() + " agregado con exito");
        } else {
            if (alumno.getNombreApellido() == null){
                throw new ExcepcionesColegio("No se agrego el alumno porque el nombre esta nulo");
            } else{
                throw new ExcepcionesColegio("No se agrego el alumno porque la nacionalidad esta nulo");
            }
        }
         */
    }

    public void verNacionalidad(String nac){
        int cant = 0;
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            if(a.getNacionalidad().toString().toUpperCase()
                    .equals(nac.toUpperCase())){
                cant++;
            }
        }
        System.out.println("La nacionalidad " + nac + " cuenta con " + cant + " cantidad de alumnos");
    }

    public int cuantos(){
        /*.values() te permite acceder a cada uno de los valores definidos en el enum,
        facilitando la iteración sobre ellos.
        Es útil en situaciones donde necesitas recorrer los valores del enum,
        realizar operaciones sobre ellos o contabilizarlos*/
        int cant= 0;
        for (Nacionalidad n: Nacionalidad.values()){
            cant++;
        }
        return cant;
    }

    public void borrar(Alumno alumno) throws ExcepcionesColegio{
            if( alumnos.remove(alumno)) {
                System.out.println("Alumno " + alumno.getNombreApellido() + " eliminado");
            } else {
                throw new ExcepcionesColegio("No se encuentra el alumno");
            }
    }

    public void verTodos(){
        int cantA= 0;
        int cantB = 0;
        int cantC = 0;
        int cantCol = 0;
        int cantP = 0;
        int cantU = 0;

        for (Nacionalidad n: Nacionalidad.values()){
            switch (n){
                case n.Argentino -> cantA++;
                case n.Boliviano -> cantB++;
                case n.Chileno -> cantC++;
                case n.Colombiano -> cantCol++;
                case n.Peruano -> cantP++;
                case n.Uruguayo -> cantU++;
            }
        }

        System.out.println("Cantidad de argentinos: " + cantA);
        System.out.println("Cantidad de bolivianos: " + cantB);
        System.out.println("Cantidad de chilenos: " + cantC);
        System.out.println("Cantidad de colombianos: " + cantCol);
        System.out.println("Cantidad de peruanos: " + cantP);
        System.out.println("Cantidad de uruguayos: " + cantU);
    }

}
