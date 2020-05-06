package com.pruebaGit;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Persona {

    private int a,b, respuesta;
    public ArrayList lista = new ArrayList();

    public void arrayedit(int a){
        for (int i=0;i<5;i++){
            lista.add(i,34+a);
        }
        for (int i=0;i<5;i++){
            System.out.println(lista.get(i));
        }
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

