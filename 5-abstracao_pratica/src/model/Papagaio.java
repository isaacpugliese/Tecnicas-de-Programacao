package model;

public class Papagaio {
    public String especie;
    public String genero;

    public void voa(){
        System.out.println("A " +especie+ " voa para encontrar uma " +genero);
    }

    public void triste(){
        System.out.println("Infelizmente " +especie+ " ficou sozinho 😢");
    }
}
