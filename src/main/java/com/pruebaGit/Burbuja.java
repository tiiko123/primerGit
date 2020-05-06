package com.pruebaGit;

import java.util.ArrayList;

public class Burbuja {
    //private int array[];
    private ArrayList array = new ArrayList();
    private int j,guardar;
    private boolean salir = false;

    public void setArray(ArrayList arrayN){
        //Aqui se le define al array de esta clase los valores del array de la otra clase
        this.array=arrayN;
        this.burbujaM();
    }

    public void burbujaM(){
        int longitud=array.size();
        while(salir!=true){
            /*Este ciclo manda el número mas alto de la lista hasta el final.
              Luego se repite, pero sin contar el número de la ultima posicion (Ya que este fue previamente acomodado).
              Y a si se va, excluyendo los que ya estan acomodados hasta que .... (Ir a la línea 34)
            */
            for(int i = 0; i<longitud-1; i++){
                j=i+1;
                if(Integer.parseInt(array.get(i).toString()) > Integer.parseInt(array.get(j).toString())){
                    guardar=Integer.parseInt(array.get(j).toString());
                    array.set(j,array.get(i));
                    array.set(i,guardar);
                }
            }
            longitud=longitud-1;
            if(longitud==1){
                //Hasta que solo quede un numero por evaluar, eso significa, si que todos ya fueron evaluados
                salir=true;
            }
        }
        System.out.println("Imprimiendo lista en orden ascendente");
        for(int i =0; i<array.size();i++){
            System.out.println(array.get(i));
        }
    }
}

