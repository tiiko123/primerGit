package com.pruebaGit;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Persona {


    private int a,b, respuesta;

    public ArrayList lista = new ArrayList();
    Burbuja burbuja = new Burbuja();
    public void arrayedit(int a){
        for (int i=0;i<5;i++){
            lista.add(i,34+a);
        }
        for (int i=0;i<5;i++){
            System.out.println(lista.get(i));
        }
        this.aBurbuja(); //Aqui llamará el método "aBurbuja" de su propia clase. Es la que está abajo.
    }
    public void aBurbuja(){
        //Agregué valores random a la lista
         ArrayList lista = new ArrayList();
         lista.add(0,20);
         lista.add(0,37);
         lista.add(0,7);
         lista.add(0,52);
         lista.add(0,47);
         //Se manda esta lista al array que está en la clase Burbuja
        burbuja.setArray(lista);
    }


    public Persona(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void mensaje(){
        System.out.printf("Mensaje de hola");
    }
   
    public int suma(){

        respuesta=a+b;
        return respuesta;
    }
}

