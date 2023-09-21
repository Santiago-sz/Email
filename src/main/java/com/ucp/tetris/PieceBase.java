package com.ucp.tetris;

import java.util.Random;

public abstract class PieceBase implements IRotator{
    String name = "";
    protected int[][] piece;
    private int[][] matrix;

    public PieceBase() {
        // Inicializa la matriz 4x4 con ceros
        matrix = new int[4][4];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                matrix[row][col] = 0;
            }
        }
    }

    public int[][] getMatrix() {
        return piece;
    }

    public static int[][] createMatrix() {
        int rows = 4;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        return matrix;
    }


    public PieceBase randomPieceAndRotate() {
        // Método para obtener una pieza aleatoria
        Random random = new Random();
        int randomPieceType = random.nextInt(7); // 7 tipos de piezas en total
        PieceBase piece;

        switch (randomPieceType) {
            case 0:
                piece = new PieceT();
                break;
            case 1:
                piece = new PieceEleLeft();
                break;
            case 2:
                piece = new PieceDogLeft();
                break;
            case 3:
                piece = new PieceSquare();
                break;
            case 4:
                piece = new PieceStick();
                break;
            case 5:
                piece = new PieceDogRight();
                break;
            case 6:
                piece = new PieceEleRight();
                break;
            default:
                piece = new PieceT(); // Si ocurre un valor inesperado, devuelve una pieza por defecto
        }

        // Rotar la pieza aleatoriamente
        int rotations = random.nextInt(4); // Número aleatorio de rotaciones de 0 a 3
        boolean rotateDoY = random.nextBoolean(); // True para rotar a la derecha, false para rotar a la izquierda

        for (int i = 0; i < rotations; i++) {
            if (rotateDoY) {
                piece.rotarLeft(); // Método para rotar la pieza a la derecha
            } else {
                piece.rotarRight(); // Método para rotar la pieza a la izquierda
            }
        }

        return piece; // Devolver la pieza creada y rotada
    }


    public int posiciones(int pos1, int pos2){
        return piece[pos1][pos2];
    }

    public void rotarLeft(){
    }

    public void rotarRight(){
    }

    public void transformarColumnas() {
    
        int[][] matrizTemporal = new int[4][4];
    
        // Copiar las dos primeras columnas en la matriz temporal
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                matrizTemporal[i][j] = piece[i][j];
            }
        }
    
        // Copiar las dos últimas columnas en las dos primeras columnas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                piece[i][j] = piece[i][j + 2];
            }
        }
    
        // Copiar el contenido de la matriz temporal en las dos últimas columnas
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 4; j++) {
                piece[i][j] = matrizTemporal[i][j - 2];
            }
        }
    }

    public void transformarFilas() {
        int filas = piece.length;
        int columnas = piece[0].length;
    
        if (filas != 4 || columnas != 4) {
            // La matriz debe ser de 4x4 para realizar esta transformación
            System.out.println("La matriz no es de 4x4.");
            return;
        }
    
        int[][] matrizTemporal = new int[2][4];
    
        // Copiar las dos primeras filas en la matriz temporal
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTemporal[i][j] = piece[i][j];
            }
        }
    
        // Copiar las dos últimas filas en las dos primeras filas
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                piece[i][j] = piece[i + 2][j];
            }
        }
    
        // Copiar el contenido de la matriz temporal en las dos últimas filas
        for (int i = 2; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                piece[i][j] = matrizTemporal[i - 2][j];
            }
        }
    }


    public int getCell(int row, int col) {
        return 0;
    }
}