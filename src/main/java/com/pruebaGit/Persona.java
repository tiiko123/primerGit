package com.pruebaGit;

/**
 * Hello world!
 *
 */
public class Persona {

    private int a,b, respuesta;

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

