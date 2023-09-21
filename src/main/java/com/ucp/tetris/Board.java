package com.ucp.tetris;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Board {
    protected int[][] board; // Cambia el nombre de la matriz a "board"
    private int rows;
    private int cols;
    private int[][] matrix;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        board = new int[rows][cols];

        // Inicializa todas las celdas del tablero a 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = 0;
            }
        }
    } 

    public int[][] getBoard() {
        return this.board;
    }
    
  
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public void setBoard(int[][] newBoard) {
        this.board = newBoard;
    }


   // Método para obtener el número de filas
   public int getRows() {
        return rows;
    }

    // Método para obtener el número de columnas
    public int getCols() {
        return cols;
    }

    public int getCell(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return board[row][col];
        } else {
            // Manejo de error: Si los índices están fuera de rango, puedes devolver un valor especial o lanzar una excepción.
            throw new IllegalArgumentException("Índices de celda fuera de rango");
        }
    }


    /*public void copyMatrixRandomColumn(int[][] matriz) {                              // no se usa 
        if (matriz.length != 4 || matriz[0].length != 4) {
            throw new IllegalArgumentException("La matriz debe ser de 4x4");
        }
        
        Random random = new Random();
        int columnToInsert = random.nextInt(cols - 4 + 1); // Elije aleatoriamente una columna entre las disponibles
    
        // Copia la matriz de 4x4 en la matriz más grande en la parte superior
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row < rows && (col + columnToInsert) < cols) {
                    board[row][col + columnToInsert] = matriz[row][col];
                }
            }
        }
    }
            */



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

public void insertRandomPiece() {

    PieceBase piece = randomPieceAndRotate(); // Genera y rota la pieza aleatoria
    int[][] pieceMatrix = piece.getMatrix();

    // Encuentra todas las posiciones válidas para insertar la pieza
    List<Integer> validColumns = new ArrayList<>();
    for (int col = 0; col <= cols - 4; col++) {
        // Verifica si se puede insertar la pieza en esta columna
        boolean isValidColumn = true;
        for (int row = 0; row < 4; row++) {
            for (int subCol = 0; subCol < 4; subCol++) {
                // Comprueba si la celda está ocupada por otra pieza en el tablero
                if (board[row][col + subCol] != 0 && pieceMatrix[row][subCol] != 0) {
                    isValidColumn = false;
                    break;
                }
            }
            if (!isValidColumn) {
                break;
            }
        }
        if (isValidColumn) {
            validColumns.add(col);
        }
    }

    // Elije aleatoriamente una columna válida para insertar la pieza
    if (!validColumns.isEmpty()) {
        Random random = new Random();
        int randomColumnIndex = random.nextInt(validColumns.size());
        int selectedColumn = validColumns.get(randomColumnIndex);

        // Inserta la pieza en el tablero en la columna seleccionada
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (pieceMatrix[row][col] != 0) {
                    board[row][selectedColumn + col] = pieceMatrix[row][col];
                }
            }
        }
    }
}

public boolean insertRandomPieceTF() {
    PieceBase piece = randomPieceAndRotate(); // Genera y rota la pieza aleatoria
    int[][] pieceMatrix = piece.getMatrix();

    List<Integer> validColumns = new ArrayList<>();

    for (int col = 0; col <= cols - 4; col++) {
        boolean isValidColumn = true;

        for (int row = 0; row < 4; row++) {
            for (int subCol = 0; subCol < 4; subCol++) {
                if (board[row][col + subCol] != 0 && pieceMatrix[row][subCol] != 0) {
                    isValidColumn = false;
                    break;
                }
            }
            if (!isValidColumn) {
                break;
            }
        }
        
        if (isValidColumn) {
            validColumns.add(col);
        }
    }

    if (!validColumns.isEmpty()) {
        Random random = new Random();
        int randomColumnIndex = random.nextInt(validColumns.size());
        int selectedColumn = validColumns.get(randomColumnIndex);

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (pieceMatrix[row][col] != 0) {
                    board[row][selectedColumn + col] = pieceMatrix[row][col];
                }
            }
        }
        return false; // La inserción se realizó correctamente
    }

    return true; // No se pudo insertar la pieza en ninguna columna válida
}

/*public void linecount(int[][] matrix) {//no se usa esta testeado. lo dejamos por si las moscas 
    int rows = matrix.length;
    int cols = matrix[0].length;
 
    // Variable para mantener un seguimiento de si se encontró una fila a borrar
    boolean filaEncontrada = false;
 
    // Iterar a través de las filas desde la segunda hasta la última
    for (int row = 1; row < rows; row++) {
        boolean filaPorBorrar = true;
        int elemento = matrix[row][0];
 
        // Comprobar si todos los elementos de la fila son iguales y distintos de 0
        for (int col = 1; col < cols; col++) {
            if (matrix[row][col] != elemento || matrix[row][col] == 0) {
                filaPorBorrar = false;
                break;
            }
        }
 
        if (filaPorBorrar) {
            // Borrar la fila
            for (int r = row; r < rows - 1; r++) {
                for (int c = 0; c < cols; c++) {
                    matrix[r][c] = matrix[r + 1][c];
                }
            }
 
            // Llenar la última fila con ceros
            for (int c = 0; c < cols; c++) {
                matrix[rows - 1][c] = 0;
            }
 
            // Indicar que se encontró una fila a borrar
            filaEncontrada = true;
        }
    }
 
    // Si se encontró una fila a borrar, crear una nueva fila en la parte superior llena de ceros
    if (filaEncontrada) {
        for (int c = 0; c < cols; c++) {
            matrix[0][c] = 0;
        }
    }}
 /* */

public int lineCount() {
    int ganaste = 0; 

    for (int fila = board.length - 1; fila >= 0; fila--) {
        boolean filaLlena = true; // Suponemos inicialmente que la fila está llena

        // Verifica si todos los elementos de la fila son diferentes de 1
        for (int col = 0; col < board[fila].length; col++) {
            if (board[fila][col] != 1) {
                filaLlena = false; // Si encuentra un valor diferente de 1, la fila no está llena
                break; // No es necesario verificar el resto de la fila
            }
        }

        // Si la fila está llena, incrementa la variable ganaste
        if (filaLlena) {
            ganaste++;
        }
    }

    return ganaste;
}




public void borrarFilaLlena() {

        for (int fila = board.length - 1; fila >= 0; fila--) {

            boolean filaLlena = true;

            // Verifica si todos los elementos de la fila son "1"
            for (int col = 0; col < board[fila].length; col++) {
                if (board[fila][col] != 1) {
                    filaLlena = false;
                    break;
                }
            }

            // Si la fila está llena, borra la fila moviendo las filas por encima hacia abajo
            if (filaLlena) {
                for (int i = fila; i > 0; i--) {
                    // Copia la fila de arriba en la fila actual
                    System.arraycopy(board[i - 1], 0, board[i], 0, board[i].length);
                }

                // Establece la fila superior como una fila vacía
                Arrays.fill(board[0], 0);
                fila++; // Revisa la fila actual nuevamente, ya que ahora contiene las filas de arriba
            }
        }
    }

public void pieceMatrix(PieceBase piece) {
    // Obtén la matriz de la pieza actual
    int[][] pieceMatrix = piece.getMatrix();

    // Inicializa la matriz 4x4 con ceros
    matrix = new int[4][4];

    // Copia la matriz de la pieza en la matriz de la clase
    for (int row = 0; row < 4; row++) {
        for (int col = 0; col < 4; col++) {
            matrix[row][col] = pieceMatrix[row][col];
        }
    }
}

public int[][] getMatrix() {
    return matrix;
}

public boolean juegoTerminado() {
    
    // Verifica las primeras filas del tablero para determinar si no se pueden ingresar más piezas
    for (int fila = 0; fila < 1; fila++) {
        for (int col = 0; col < board[fila].length; col++) {
            if (board[fila][col] == 1){
                return true; // La fila está ocupada, el juego ha terminado
            }
        }
    }
    return false; // No hay filas ocupadas en las primeras filas, el juego continúa
}


public void insertPiece(PieceBase piece, int rowOffset, int colOffset) {
    int[][] pieceMatrix = piece.getMatrix();
    
    int pieceRows = pieceMatrix.length;
    int pieceCols = pieceMatrix[0].length;
    
    for (int row = 0; row < pieceRows; row++) {
        for (int col = 0; col < pieceCols; col++) {
            if (pieceMatrix[row][col] != 0) {
                int targetRow = row + rowOffset;
                int targetCol = col + colOffset;
                
                if (targetRow >= 0 && targetRow < rows && targetCol >= 0 && targetCol < cols) {
                    board[targetRow][targetCol] = pieceMatrix[row][col];
                }
            }
        }
    }
}

public boolean sePuedeMover() {
    boolean sePuedeMover = false;

    for (int row = rows - 2; row >= 0; row--) { // Cambio row + 2 a row - 2
        for (int col = 0; col < cols; col++) {
            if (row + 1 >= rows || board[row + 1][col] == 1) {
                // La pieza no puede moverse hacia abajo
                sePuedeMover = false;
                break;
            } else if (board[row][col] != 0) {
                // Mover la pieza hacia abajo
                board[row + 1][col] = board[row][col];
                board[row][col] = 0;
                sePuedeMover = true; // La pieza se ha movido
            }
        }
    }
    return sePuedeMover;
}

    public void moverSiSePuede(){

        for (int row = rows - 1; row >= 0; row--) {
            for (int col = 0; col < cols; col++) {
                if((row + 1 >= rows || board[row + 1][col] == 1)){
                    break;
                }
                else if(board[row][col] != 0) {
                        board[row + 1][col] = board[row][col];
                        board[row][col] = 0;
                }
            }
        }
    }

    public void moverPieceAbajo(){
         for (int row = rows - 1; row >= 0; row--) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] != 0) {
                    board[row + 1][col] = board[row][col];
                    board[row][col] = 0;
                }
            }
        }
    }

    public boolean colision(int x, int y) {
        if (board[x][y] == 1) {
            if (x + 1 >= rows || board[x + 1][y] == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void rotateRight(PieceBase piece) {
    }

    public void rotateLeft(PieceBase piece) {
    }

}


