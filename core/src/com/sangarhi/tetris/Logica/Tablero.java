package com.sangarhi.tetris.Logica;

public class Tablero {
    int[][] casillas;

    public  Tablero(){
        casillas = new int[20][10];
        for (int i = 0; i < casillas.length; i++){
            for (int z = 0; z < casillas[i].length;z++){
                casillas[i][z] = 0;
            }
        }
    }

    public void clearLine(){
        int clearline = 0;
        for (int i = 0; i < casillas.length; i++){
            int ancho = casillas[i].length;
            for (int z = 0; z < casillas[i].length; z++){
                if (casillas[i][z] == 1){
                    ancho--;
                }

            }
        }
    }
}
