package com.example.administrador.hechoscuriosos2;

import java.util.Random;

/**
 * Created by ivan on 10/11/14.
 */
public class FactBook {
    String [] frases = {"Las hormigas se estiran cuando se despiertan por la mañana.",
            "Las avestruces pueden correr más rápido que los caballos.","Las medallas de oro de los juegos olímpicos están hechas de  plata.",
            "Naciste con 300 huesos, pero en la edad adulta tendrás 206.",  "Toma unos 8 minutos en llegar la luz del sol a la tierra.",
            "Algunas plantas de bambu pueden crecer hasta un metro al día.",
            "El estado de Florida es más grande que Inglaterra.",
            "Algunos pingüinos pueden saltar de 2 a 3 metros por encima del" };

    //me creo el atributo de ramdon fuera para solo crearlo una vez

    private Random random;
    //construyo el constuctor y cuando llame al constructor llamara al aleatorio

FactBook(){

       random = new Random();
    }

    //Metodo hechos aleatorios devolvera las frases:

    public String getRamdomFact(){

    return frases[random.nextInt(frases.length)];


}

}
