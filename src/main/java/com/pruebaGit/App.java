package com.pruebaGit;

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
    }
}
