package com.ucp.tetris;


public class Tetris {
public Board board = new Board(20, 10);
public Clock clock = new Clock();
   
public Tetris() {
}
public Tetris(Board board) {
    this.board = board;
    this.clock = new Clock();
}


public void Start(Board board){
board.insertRandomPiece();
board.moverSiSePuede();
}

public void tick() {
    board.moverSiSePuede();
    clock.tick();
    state(board);
    board.lineCount();
    board.borrarFilaLlena();
    board.borrarFilaLlena();
}

public boolean gameOver(Board board){
    return board.insertRandomPieceTF()||board.juegoTerminado();
}

public boolean victoria() {
    return (5 >= board.lineCount());
} 

public boolean state(Board board) {

        if (true == board.juegoTerminado()) {
            return false; // GameOver
        } else if (board.insertRandomPieceTF()) {
            return false; // GameOver
        }else if (gameOver(board)) {
            return false; // GameOver
        }else {
            return true; // juga :)
        }
}

    public void rotateRight(PieceBase piece) {
        if(board.sePuedeMover()==true){
            piece.rotarRight(); // Método para rotar la pieza a la derecha
        }
    }

    public void rotateLeft(PieceBase piece) {
          if(board.sePuedeMover()==true){    
            piece.rotarLeft(); // Método para rotar la pieza a la izquierda
        }
}
}

