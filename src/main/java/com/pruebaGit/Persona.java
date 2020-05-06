package com.pruebaGit;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Persona {

<<<<<<< HEAD
    private int a,b, respuesta;
=======
    public ArrayList lista = new ArrayList();

    public void arrayedit(int a){
        for (int i=0;i<5;i++){
            lista.add(i,34+a);
        }
        for (int i=0;i<5;i++){
            System.out.println(lista.get(i));
        }
    }

>>>>>>> 30b8942b949afc9f3cc61602c4367ddf3b81e972

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

