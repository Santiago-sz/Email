package com.ucp.tetris;

public class PieceEleRight extends PieceBase {
   public PieceEleRight() {
      this.name = "Piece Ele Right";

      // Inicializa la matriz 4x4 de la pieza
      this.piece = new int[4][4];

      // Configura la forma de la pieza
      this.piece[0][0] = 1;
      this.piece[1][0] = 1;
      this.piece[2][0] = 1;
      this.piece[2][1] = 1;
      
  }

   public void rotarRight() {
      int[][] nuevaP = new int[4][4];

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            nuevaP[i][j] = this.piece[3 - j][i];
         }
      }

      this.piece = nuevaP;
   }

   public void rotarLeft() {
      int[][] nuevaP = new int[4][4];

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            nuevaP[i][j] = this.piece[j][3 - i];
         }
      }

      this.piece = nuevaP;
   }
}
