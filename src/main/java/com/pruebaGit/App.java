package com.pruebaGit;

import javax.sound.sampled.SourceDataLine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ;
        Persona respuesta = new Persona(2,2);
        System.out.println( "Hello World!" );

        respuesta.mensaje();
        System.out.println(respuesta.suma());



        respuesta.mensaje();
        respuesta.arrayedit(5);


        respuesta.mensaje();
        respuesta.arrayedit(5);

        System.out.println("---------------");
        respuesta.operacion();

        System.out.println("**********");
        respuesta.aBurbuja();

        System.out.println("Ya quedó! - Aleeeeeecssssss");

    }
}
