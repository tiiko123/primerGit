package com.pruebaGit;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Persona {
<<<<<<< HEAD

=======
>>>>>>> cc6c0adf5c3fb283b9b6aa4e48b584a021fd3699
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

    public void operacion(){
        String cadena = "Hola amigos como estan";
        ArrayList<String> palabras = new ArrayList<>();
        String [] palabrasSeparadas = cadena.split(" ");

        //palabrasSeparadas.get[i].substring("o",palabrasSeparadas.get[i].lenght);

        /*
        for(int i=0;i<palabrasSeparadas.length;i++){
            if(palabrasSeparadas[i].equals("o")){
                palabras.add(palabrasSeparadas[i]);
            }
        }*/

        //if(palabrasSeparadas[0].substring(palabrasSeparadas[0].indexOf("o"))












        for(int i=0;i<palabrasSeparadas.length;i++){

            try{

                 if(!palabrasSeparadas[i].substring(palabrasSeparadas[i].indexOf("como")).equals(null)){
                 palabras.add(palabrasSeparadas[i]);

                
            }

        }catch(Exception e){
            System.out.println("No tiene el patron");
        }
    }

    
        for(int i = 0; i < palabras.size(); i++){
            System.out.println(palabras.get(i));
        }
      


    
}
}
 