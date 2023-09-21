package com.ucp.tetris;

public class PieceSquare extends PieceBase {
    
    public PieceSquare() {
        this.name = "Piece Square";

        // Inicializa la matriz 4x4 de la pieza
        this.piece = new int[4][4];

        // Configura la forma de la pieza
        this.piece[0][0] = 1;
        this.piece[0][1] = 1;
        this.piece[1][0] = 1;
        this.piece[1][1] = 1;
    }

    
@Override
    public void rotarRight() {
        int[][] nuevaP = new int[4][4]; 
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    nuevaP[i][j] = piece [3 - j][i];
                }
            }  
        piece = nuevaP;
        }
    
@Override
    public void rotarLeft() {
        int[][] nuevaP = new int[4][4];
    
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    nuevaP[i][j] = piece [j][3 - i];
                }
            }
    
        piece = nuevaP;
        }

    }
