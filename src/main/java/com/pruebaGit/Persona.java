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
<<<<<<< HEAD

=======
>>>>>>> cc6c0adf5c3fb283b9b6aa4e48b584a021fd3699
    private int a,b, respuesta;
    public ArrayList lista = new ArrayList();
>>>>>>> 89815a9a0b83534672e2e9d4002c532087bbf2ed

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

<<<<<<< HEAD

=======
>>>>>>> 89815a9a0b83534672e2e9d4002c532087bbf2ed
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
 