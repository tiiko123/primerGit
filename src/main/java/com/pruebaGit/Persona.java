package com.pruebaGit;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Persona {

    public ArrayList lista = new ArrayList();

    public void arrayedit(int a){
        for (int i=0;i<5;i++){
            lista.add(i,34+a);
        }
        for (int i=0;i<5;i++){
            System.out.println(lista.get(i));
        }
    }



    public void mensaje(){
        System.out.printf("Mensaje de hola");
    }
   
    
}
