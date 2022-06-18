package com.upchiapas.EjercicioSuberClass.models;

import java.util.Scanner;
import java.util.Stack;

public class Electrodomestico {
    private final float PRECIO_BASE=100;
    private final byte PESO=5;
    private final char CONSUMO_ENERGETICO='F';
    private final String COLOR="Blanco";
    protected float precioBase;
    protected byte peso;
    protected char consumoEnergetico;
    protected String color;
    public Electrodomestico(){
        this(100.0f,(byte)5, 'F', "Blanco");
    }
    public Electrodomestico(float precioBase, byte peso){
        this(precioBase, peso, 'F', "Blanco");
    }
    public Electrodomestico(float precioBase, byte peso, char consumoEnergetico, String color){
        this.color=color;
        this.peso=peso;
        this.precioBase=precioBase;
        this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
    }
    private char comprobarConsumoEnergetico(char letra){
        char[] letras;
        letras= new char[]{'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f'};
        for (int i=0; i<12;i++){
            if (letra==letras[i]){
                letra=CONSUMO_ENERGETICO;
            }
        }
        return letra;
    }
}
