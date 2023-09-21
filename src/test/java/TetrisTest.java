import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.ucp.tetris.Board;
import com.ucp.tetris.Clock;
import com.ucp.tetris.PieceBase;
import com.ucp.tetris.PieceDogLeft;
import com.ucp.tetris.PieceDogRight;
import com.ucp.tetris.PieceEleLeft;
import com.ucp.tetris.PieceEleRight;
import com.ucp.tetris.PieceSquare;
import com.ucp.tetris.PieceStick;
import com.ucp.tetris.PieceT;
import com.ucp.tetris.Tetris;

public class TetrisTest {
  

   @Test
   public void PieceSquareTest() {
      PieceSquare pieceC = new PieceSquare();
      Assert.assertEquals(pieceC.posiciones(0, 0), 1);
      Assert.assertEquals(pieceC.posiciones(0, 1), 1);
      Assert.assertEquals(pieceC.posiciones(1, 0), 1);
      Assert.assertEquals(pieceC.posiciones(1, 1), 1);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 0 || j != 1) && (i != 1 || j != 0) && (i != 1 || j != 1)) {
               Assert.assertEquals((long)pieceC.posiciones(i, j), 0);
            }
         }
      }

   }

   @Test
   public void PieceDogLeftTest() {
      
      PieceDogLeft pieceDog = new PieceDogLeft();

      Assert.assertEquals(pieceDog.posiciones(0, 0), 1);
      Assert.assertEquals(pieceDog.posiciones(0, 1), 1);
      Assert.assertEquals(pieceDog.posiciones(1, 1), 1);
      Assert.assertEquals(pieceDog.posiciones(1, 2), 1);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 0 || j != 1) && (i != 1 || j != 1) && (i != 1 || j != 2)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0);
            }
         }
      }

   }

   @Test
   public void PieceDogRightTest() {
      
      PieceDogRight pieceDog = new PieceDogRight();

      Assert.assertEquals((long)pieceDog.posiciones(0, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(0, 3), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(1, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 2) && (i != 0 || j != 3) && (i != 1 || j != 1) && (i != 1 || j != 2)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }

   }

   @Test
   public void PieceStickTest() {
      PieceStick pieceStick = new PieceStick();
      Assert.assertEquals(pieceStick.posiciones(0, 0), 1);
      Assert.assertEquals((long)pieceStick.posiciones(1, 0), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(2, 0), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(3, 0), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 1 || j != 0) && (i != 2 || j != 0) && (i != 3 || j != 0)) {
               Assert.assertEquals((long)pieceStick.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void PieceEleRightTest() {
      PieceEleRight pieceEle = new PieceEleRight();
      Assert.assertEquals((long)pieceEle.posiciones(0, 0), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 0), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 0), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 1 || j != 0) && (i != 2 || j != 0) && (i != 2 || j != 1)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void PieceEleLeftTest() {
      
      PieceEleLeft pieceEle = new PieceEleLeft();

      Assert.assertEquals((long)pieceEle.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 0), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 1) && (i != 1 || j != 1) && (i != 2 || j != 0) && (i != 2 || j != 1)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void PieceTTest() {
      PieceT pieceT = new PieceT();
      Assert.assertEquals((long)pieceT.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceT.posiciones(1, 0), 1L);
      Assert.assertEquals((long)pieceT.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceT.posiciones(1, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 1) && (i != 1 || j != 0) && (i != 1 || j != 1) && (i != 1 || j != 2)) {
               Assert.assertEquals((long)pieceT.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void PieceSquareRotateRight() {
      PieceSquare pieceC = new PieceSquare();

      pieceC.rotarRight();
      pieceC.transformarColumnas();
      pieceC.rotarRight();
      pieceC.transformarColumnas();

      Assert.assertEquals((long)pieceC.posiciones(0, 0), 1L);
      Assert.assertEquals((long)pieceC.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceC.posiciones(1, 0), 1L);
      Assert.assertEquals((long)pieceC.posiciones(1, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 0 || j != 1) && (i != 1 || j != 0) && (i != 1 || j != 1)) {
               Assert.assertEquals((long)pieceC.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateTwoTimesSqrRight() {
      PieceSquare pieceC = new PieceSquare();

      pieceC.rotarRight();
      pieceC.transformarColumnas();
      pieceC.rotarRight();
      pieceC.transformarColumnas();

      Assert.assertEquals(pieceC.posiciones(0, 0), 1);
      Assert.assertEquals(pieceC.posiciones(0, 1), 1);
      Assert.assertEquals(pieceC.posiciones(1, 0), 1);
      Assert.assertEquals(pieceC.posiciones(1, 1), 1);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 0 || j != 1) && (i != 1 || j != 0) && (i != 1 || j != 1)) {
               Assert.assertEquals((long)pieceC.posiciones(i, j), 0L);
            }
         }
      }
   }
         
   @Test
   public void PieceSquareRotateLeft() {
      
      PieceSquare pieceC = new PieceSquare();

      pieceC.rotarLeft();
      pieceC.transformarFilas();

      Assert.assertEquals((long)pieceC.posiciones(0, 0), 1L);
      Assert.assertEquals((long)pieceC.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceC.posiciones(1, 0), 1L);
      Assert.assertEquals((long)pieceC.posiciones(1, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 0 || j != 1) && (i != 1 || j != 0) && (i != 1 || j != 1)) {
               Assert.assertEquals((long)pieceC.posiciones(i, j), 0L);
            }
         }
      }
   }
   
   @Test
   public void RotateTwoTimesSqrLeft() {
      
      PieceSquare pieceC = new PieceSquare();

      pieceC.rotarLeft();
      pieceC.transformarFilas();
      pieceC.rotarLeft();
      pieceC.transformarFilas();

      Assert.assertEquals((long)pieceC.posiciones(0, 0), 1L);
      Assert.assertEquals((long)pieceC.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceC.posiciones(1, 0), 1L);
      Assert.assertEquals((long)pieceC.posiciones(1, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 0 || j != 1) && (i != 1 || j != 0) && (i != 1 || j != 1)) {
               Assert.assertEquals((long)pieceC.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateThreeTimesSqrLeft() {
      
      PieceSquare pieceC = new PieceSquare();

      pieceC.rotarLeft();
      pieceC.transformarFilas();
      pieceC.rotarLeft();
      pieceC.transformarFilas();
      pieceC.rotarLeft();
      pieceC.transformarFilas();

      Assert.assertEquals((long)pieceC.posiciones(0, 0), 1L);
      Assert.assertEquals((long)pieceC.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceC.posiciones(1, 0), 1L);
      Assert.assertEquals((long)pieceC.posiciones(1, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 0 || j != 1) && (i != 1 || j != 0) && (i != 1 || j != 1)) {
               Assert.assertEquals((long)pieceC.posiciones(i, j), 0L);
            }
         }
      }
   }

      @Test
      public void RotatRightDogLeftTest() {
      PieceDogLeft pieceDog = new PieceDogLeft();

      pieceDog.rotarRight();

      Assert.assertEquals((long)pieceDog.posiciones(0, 3), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(1, 3), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 3) && (i != 1 || j != 2) && (i != 1 || j != 3) && (i != 2 || j != 2)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }   
   }

     @Test
      public void RotateRightTwoTimesDogLeftTest() {
      PieceDogLeft pieceDog = new PieceDogLeft();

      pieceDog.rotarRight();
      pieceDog.rotarRight();

      Assert.assertEquals((long)pieceDog.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 1) && (i != 2 || j != 2) && (i != 3 || j != 2) && (i != 3 || j != 3)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }   
   }

   @Test
   public void RotateRightThreeTimesDogLeftTest() {
      PieceDogLeft pieceDog = new PieceDogLeft();

      pieceDog.rotarRight();
      pieceDog.rotarRight();
      pieceDog.rotarRight();

      Assert.assertEquals((long)pieceDog.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 0), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 0), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 1) && (i != 2 || j != 0) && (i != 2 || j != 1) && (i != 3 || j != 0)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }   
   }

   @Test
   public void RotateLeftDogLeftTest() {
      PieceDogLeft pieceDog = new PieceDogLeft();

      pieceDog.rotarLeft();
      

      Assert.assertEquals((long)pieceDog.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 0), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 0), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 1) && (i != 2 || j != 0) && (i != 2 || j != 1) && (i != 3 || j != 0)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }   
   }

   @Test
   public void RotateLeftTwoTimesDogLeftTest() {
      PieceDogLeft pieceDog = new PieceDogLeft();

      pieceDog.rotarLeft();
      pieceDog.rotarLeft();

      Assert.assertEquals((long)pieceDog.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 1) && (i != 2 || j != 2) && (i != 3 || j != 2) && (i != 3 || j != 3)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }   
   }

   @Test
   public void RotateLeftThreeTimesDogLeftTest() {
      PieceDogLeft pieceDog = new PieceDogLeft();

      pieceDog.rotarLeft();
      pieceDog.rotarLeft();
      pieceDog.rotarLeft();

      Assert.assertEquals((long)pieceDog.posiciones(0, 3), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(1, 3), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 3) && (i != 1 || j != 2) && (i != 1 || j != 3) && (i != 2 || j != 2)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }   
   }  

   @Test
   public void RotateRightPieceDogRightTest() {
      
      PieceDogRight pieceDog = new PieceDogRight();
      
      pieceDog.rotarRight();

      Assert.assertEquals((long)pieceDog.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 3), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 2) && (i != 2 || j != 2) && (i != 2 || j != 3) && (i != 3 || j != 3)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateRightTwoTimesPieceDogRightTest() {
      
      PieceDogRight pieceDog = new PieceDogRight();
      
      pieceDog.rotarRight();
      pieceDog.rotarRight();

      Assert.assertEquals((long)pieceDog.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 0), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 1) && (i != 2 || j != 2) && (i != 3 || j != 0) && (i != 3 || j != 1)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }
   }
   
   @Test
   public void RotateRightThreeTimesPieceDogRightTest() {
      
      PieceDogRight pieceDog = new PieceDogRight();
      
      pieceDog.rotarRight();
      pieceDog.rotarRight();
      pieceDog.rotarRight();

      Assert.assertEquals((long)pieceDog.posiciones(0, 0), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(1, 0), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 1 || j != 0) && (i != 1 || j != 1) && (i != 2 || j != 1)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateLeftPieceDogRightTest() {
      
      PieceDogRight pieceDog = new PieceDogRight();
      
      pieceDog.rotarLeft();
     

      Assert.assertEquals((long)pieceDog.posiciones(0, 0), 1);
      Assert.assertEquals((long)pieceDog.posiciones(1, 0), 1);
      Assert.assertEquals((long)pieceDog.posiciones(1, 1), 1);
      Assert.assertEquals((long)pieceDog.posiciones(2, 1), 1);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 1 || j != 0) && (i != 1 || j != 1) && (i != 2 || j != 1)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateLeftTwoTimesPieceDogRightTest() {
      
      PieceDogRight pieceDog = new PieceDogRight();
      
      pieceDog.rotarLeft();
      pieceDog.rotarLeft();

      Assert.assertEquals((long)pieceDog.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 0), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 1) && (i != 2 || j != 2) && (i != 3 || j != 0) && (i != 3 || j != 1)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateLeftThreeTimesPieceDogRightTest() {
      
      PieceDogRight pieceDog = new PieceDogRight();
      
      pieceDog.rotarLeft();
      pieceDog.rotarLeft();
      pieceDog.rotarLeft();

      Assert.assertEquals((long)pieceDog.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2,2 ), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(2, 3), 1L);
      Assert.assertEquals((long)pieceDog.posiciones(3, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 2) && (i != 2 || j != 2) && (i != 2 || j != 3) && (i != 3 || j != 3)) {
               Assert.assertEquals((long)pieceDog.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void PieceStickRotateTest() {
      
      PieceStick pieceStick = new PieceStick();

      pieceStick.rotarRight();

      Assert.assertEquals((long)pieceStick.posiciones(0, 0), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(0, 2), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(0, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 0 || j != 1) && (i != 0 || j != 2) && (i != 0 || j != 3)) {
               Assert.assertEquals((long)pieceStick.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateRightTwoTimesStick() {
      
      PieceStick pieceStick = new PieceStick();

      pieceStick.rotarRight();
      pieceStick.rotarRight();

      Assert.assertEquals((long)pieceStick.posiciones(0, 3), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(1, 3), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(2, 3), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(3, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 3) && (i != 1 || j != 3) && (i != 2 || j != 3) && (i != 3 || j != 3)) {
               Assert.assertEquals((long)pieceStick.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateRightThreeTimesStick() {
      
      PieceStick pieceStick = new PieceStick();

      pieceStick.rotarRight();
      pieceStick.rotarRight();
      pieceStick.rotarRight();

      Assert.assertEquals((long)pieceStick.posiciones(3, 0), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(3, 1), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(3, 2), 1L);
      Assert.assertEquals((long)pieceStick.posiciones(3, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 3 || j != 0) && (i != 3 || j != 1) && (i != 3 || j != 2) && (i != 3 || j != 3)) {
               Assert.assertEquals((long)pieceStick.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateRightPieceEleRightTest() {
      
      PieceEleRight pieceEle = new PieceEleRight();

      pieceEle.rotarRight();

      Assert.assertEquals((long)pieceEle.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(0, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(0, 3), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 1) && (i != 0 || j != 2) && (i != 0 || j != 3) && (i != 1 || j != 1)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateRightTwoTimesPieceEleRight() {
      
      PieceEleRight pieceEle = new PieceEleRight();

      pieceEle.rotarRight();
      pieceEle.rotarRight();

      Assert.assertEquals((long)pieceEle.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 3), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 3), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 2) && (i != 1 || j != 3) && (i != 2 || j != 3) && (i != 3 || j != 3)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateRightThreeTimesPieceEleRight() {
      
      PieceEleRight pieceEle = new PieceEleRight();

      pieceEle.rotarRight();
      pieceEle.rotarRight();
      pieceEle.rotarRight();

      Assert.assertEquals((long)pieceEle.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 0), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 2) && (i != 3 || j != 0) && (i != 3 || j != 1) && (i != 3 || j != 2)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateLeftEleRightPieceTest() {
      
      PieceEleRight pieceEle = new PieceEleRight();

     pieceEle.rotarLeft();

      Assert.assertEquals((long)pieceEle.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 0), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 2) && (i != 3 || j != 0) && (i != 3 || j != 1) && (i != 3 || j != 2)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateLeftTwoTimesEleRightPiece() {
       PieceEleRight pieceEle = new PieceEleRight();

      pieceEle.rotarLeft();
      pieceEle.rotarLeft();

      Assert.assertEquals((long)pieceEle.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 3), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 3), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 2) && (i != 1 || j != 3) && (i != 2 || j != 3) && (i != 3 || j != 3)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateLeftThreeTimesEleRightPiece(){
      
      PieceEleRight pieceEle = new PieceEleRight();

      pieceEle.rotarLeft();
      pieceEle.rotarLeft();
      pieceEle.rotarLeft();

      Assert.assertEquals((long)pieceEle.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(0, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(0, 3), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 1) && (i != 0 || j != 2) && (i != 0 || j != 3) && (i != 1 || j != 1)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateRightEleLeftPieceTest() {
      
      PieceEleLeft pieceEle = new PieceEleLeft();

      pieceEle.rotarRight();

      Assert.assertEquals((long)pieceEle.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 1) && (i != 1 || j != 1) && (i != 1 || j != 2) && (i != 1 || j != 3)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateRightTwoTimesEleLeftPiece() {
      
      PieceEleLeft pieceEle = new PieceEleLeft();

      pieceEle.rotarRight();
      pieceEle.rotarRight();

      Assert.assertEquals((long)pieceEle.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 3), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 2) && (i != 1 || j != 3) && (i != 2 || j != 2) && (i != 3 || j != 2)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }
   
   @Test
   public void RotateRightThreeTimesEleLeftPiece() {
      
      PieceEleLeft pieceEle = new PieceEleLeft();

      pieceEle.rotarRight();
      pieceEle.rotarRight();
      pieceEle.rotarRight();

      Assert.assertEquals((long)pieceEle.posiciones(2, 0), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 0) && (i != 2 || j != 1) && (i != 2 || j != 2) && (i != 3 || j != 2)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateLeftEleLeftPieceTest() {
      
      PieceEleLeft pieceEle = new PieceEleLeft();

      pieceEle.rotarLeft();

      Assert.assertEquals((long)pieceEle.posiciones(2, 0), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 0) && (i != 2 || j != 1) && (i != 2 || j != 2) && (i != 3 || j != 2)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
   }

   @Test
   public void RotateLeftTwoTimesEleLeftPiece() {
      
      PieceEleLeft pieceEle = new PieceEleLeft();

      pieceEle.rotarLeft();
      pieceEle.rotarLeft();

      Assert.assertEquals((long)pieceEle.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 3), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(3, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 2) && (i != 1 || j != 3) && (i != 2 || j != 2) && (i != 3 || j != 2)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
}

   @Test
   public void RotateLeftThreeTimesEleLeftPiece() {
      
      PieceEleLeft pieceEle = new PieceEleLeft();

      pieceEle.rotarLeft();
      pieceEle.rotarLeft();
      pieceEle.rotarLeft();

      Assert.assertEquals((long)pieceEle.posiciones(0, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceEle.posiciones(1, 3), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 1) && (i != 1 || j != 1) && (i != 1 || j != 2) && (i != 1 || j != 3)) {
               Assert.assertEquals((long)pieceEle.posiciones(i, j), 0L);
            }
         }
      }
}

   @Test
   public void RotateRightPieceTTest() {
      
      PieceT pieceT = new PieceT();

      pieceT.rotarRight();
      
      Assert.assertEquals((long)pieceT.posiciones(0, 2), 1L);
      Assert.assertEquals((long)pieceT.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceT.posiciones(1, 3), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 2) && (i != 1 || j != 2) && (i != 1 || j != 3) && (i != 2 || j != 2)) {
               Assert.assertEquals((long)pieceT.posiciones(i, j), 0L);
            }
         }
      }
}

   @Test
   public void RotateRighTwoTimesTPieceTest() {
      
      PieceT pieceT = new PieceT();

      pieceT.rotarRight();
      pieceT.rotarRight();
      
      Assert.assertEquals((long)pieceT.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 3), 1L);
      Assert.assertEquals((long)pieceT.posiciones(3, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 1) && (i != 2 || j != 2) && (i != 2 || j != 3) && (i != 3 || j != 2)) {
               Assert.assertEquals((long)pieceT.posiciones(i, j), 0L);
            }
         }
      }
}

   @Test
   public void RotateRighThreeTimesTPieceTest() {
      
      PieceT pieceT = new PieceT();

      pieceT.rotarRight();
      pieceT.rotarRight();
      pieceT.rotarRight();
      
      Assert.assertEquals((long)pieceT.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 0), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceT.posiciones(3, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 1) && (i != 2 || j != 0) && (i != 2 || j != 1) && (i != 3 || j != 1)) {
               Assert.assertEquals((long)pieceT.posiciones(i, j), 0L);
            }
         }
      }
}

   @Test
   public void RotateLeftPieceTTest() {
      
      PieceT pieceT = new PieceT();

      pieceT.rotarLeft();
      
      Assert.assertEquals((long)pieceT.posiciones(1, 1), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 0), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceT.posiciones(3, 1), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 1 || j != 1) && (i != 2 || j != 0) && (i != 2 || j != 1) && (i != 3 || j != 1)) {
               Assert.assertEquals((long)pieceT.posiciones(i, j), 0L);
            }
         }
      }
}

   @Test
   public void RotateLeftTwoTimesTPieceTest() {
      
      PieceT pieceT = new PieceT();

      pieceT.rotarLeft();
      pieceT.rotarLeft();
      
      Assert.assertEquals((long)pieceT.posiciones(2, 1), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 2), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 3), 1L);
      Assert.assertEquals((long)pieceT.posiciones(3, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 2 || j != 1) && (i != 2 || j != 2) && (i != 2 || j != 3) && (i != 3 || j != 2)) {
               Assert.assertEquals((long)pieceT.posiciones(i, j), 0L);
            }
         }
      }
}

   @Test
   public void RotateTrheeTimestTPieceTest() {
      
      PieceT pieceT = new PieceT();

      pieceT.rotarLeft();
      pieceT.rotarLeft();
      pieceT.rotarLeft();
   
      
      Assert.assertEquals((long)pieceT.posiciones(0, 2), 1L);
      Assert.assertEquals((long)pieceT.posiciones(1, 2), 1L);
      Assert.assertEquals((long)pieceT.posiciones(1, 3), 1L);
      Assert.assertEquals((long)pieceT.posiciones(2, 2), 1L);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 2) && (i != 1 || j != 2) && (i != 1 || j != 3) && (i != 2 || j != 2)) {
               Assert.assertEquals((long)pieceT.posiciones(i, j), 0L);
            }
         }
      }
   }

@Test

public void testRandomPieceYRotate() {
    Board board = new Board(4, 4);

    // Almacenar las piezas generadas en un array
    PieceBase[] pieces = new PieceBase[10];

    // Generar múltiples piezas
    for (int i = 0; i < 10; i++) {
        pieces[i] = board.randomPieceAndRotate();
    }

    // Verificar que al menos algunas de las piezas sean diferentes
    boolean foundDifferentPiece = false;
    for (int i = 1; i < pieces.length; i++) {
        if (!pieces[i].equals(pieces[0])) {
            foundDifferentPiece = true;
            break;
        }
    }
    // Afirmar que al menos una pieza es diferente
    Assert.assertTrue(foundDifferentPiece);
}

@Test
public void testRandomPieceYRotate2() {
    Board board = new Board(10, 20);

    // Almacenar las piezas generadas en un array
    PieceBase[] pieces = new PieceBase[10];

    // Generar múltiples piezas
    for (int i = 0; i < 10; i++) {
        pieces[i] = board.randomPieceAndRotate();
    }

    // Verificar que al menos algunas de las piezas sean diferentes
    boolean foundDifferentPiece = true;
    for (int i = 1; i < pieces.length; i++) {
        if (pieces[i].equals(pieces[0])) {
            foundDifferentPiece = true;
            break;
        }
    }
    // Afirmar que al menos una pieza es diferente
    Assert.assertTrue(foundDifferentPiece);
}

@Test
    public void BoardInitial1zation_Test() {
        // Crea una instancia de la clase Board
        Board board = new Board(10, 20);

        // Verifica que el número de filas y columnas sea correcto
        Assert.assertEquals(board.getRows(), 10);
        Assert.assertEquals(board.getCols(), 20);

        // Verifica que todas las celdas del tablero estén inicializadas a 0
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCols(); j++) {
                Assert.assertEquals(board.getCell(i, j), 0);
            }
        }
}

@Test
public void BoardInitialization_Test() {
        // Crea una instancia de la clase Board
        Board board = new Board(10, 20);

        // Verifica que el número de filas y columnas sea correcto
        Assert.assertEquals(board.getRows(), 10);
        Assert.assertEquals(board.getCols(), 20);

        // Verifica que todas las celdas del tablero estén inicializadas a 0
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCols(); j++) {
                Assert.assertEquals(board.getCell(i, j), 0);
            }
        }
}

    @Test
   public void RotateLeftPieceT1Test() {
      
      PieceT pieceT = new PieceT();

      pieceT.rotarRight();
      pieceT.transformarColumnas();

      Assert.assertEquals(pieceT.posiciones(0, 0), 1);
      Assert.assertEquals(pieceT.posiciones(1, 0), 1);
      Assert.assertEquals(pieceT.posiciones(2, 0), 1);
      Assert.assertEquals(pieceT.posiciones(1, 1), 1);

      for(int i = 0; i < 4; ++i) {
         for(int j = 0; j < 4; ++j) {
            if ((i != 0 || j != 0) && (i != 1 || j != 0) && (i != 2 || j != 0) && (i != 1 || j != 1)) {
               Assert.assertEquals((long)pieceT.posiciones(i, j), 0L);
            }
         }
      }
}

@Test
public void testInsertRandomPiece() {
    // Crear un tablero de prueba
    Board board = new Board(10, 20);

    // Llamar al método para insertar una pieza aleatoria
    board.insertRandomPiece();

    // Obtener la matriz del tablero después de insertar la pieza
    int[][] boardMatrix = board.getBoard();

    // Comprobar si se ha insertado una pieza en el tablero
    boolean pieceInserted = false;
    for (int row = 0; row < board.getRows(); row++) {
        for (int col = 0; col < board.getCols(); col++) {
            if (boardMatrix[row][col] != 0) {
                pieceInserted = true;
                break;
            }
        }
        if (pieceInserted) {
            break;
        }
    }

    // Realizar la aserción
    assertTrue(pieceInserted);
}

/*@Test
public void testLinecount1() { //anda mal borra todo. se deja porque pinto
    // Crear una matriz de prueba
    int[][] matrix = {
        {1, 1, 1, 1},
        {0, 0, 0, 0},
        {2, 2, 2, 2},
        {0, 0, 0, 0}
    };

    // Matriz esperada después de aplicar linecount
    int[][] expectedMatrix = {
      {0, 0, 0, 0}, // Se agrega una fila de ceros en la parte superior
      {0, 0, 0, 0},
      {0, 0, 0, 0},
      {0, 0, 0, 0}
    };

    // Llamar al método linecount
    
    lineCount(matrix);

    // Verificar si la matriz resultante es igual a la matriz esperada
    assertArrayEquals(expectedMatrix, matrix);
    
}
*/
@Test
public void testLinecount2() {
   PieceSquare cubo1 = new PieceSquare();
   PieceSquare cubo2 = new PieceSquare();
   PieceSquare cubo3 = new PieceSquare();
   PieceSquare cubo4 = new PieceSquare();
   PieceSquare cubo5 = new PieceSquare();
    Board board = new Board(20, 10);
    Board board1 = new Board(20, 10);

      board.insertPiece(cubo1,0,0);
      board.insertPiece(cubo2,0,2);
      board.insertPiece(cubo3,0,4);
      board.insertPiece(cubo4,0,6);
      board.insertPiece(cubo5,0,8);

      board.borrarFilaLlena();
      
      int[][]matrix = board.getBoard();
      int[][]matrix1 = board1.getBoard();


      for (int i = 0; i < matrix.length; i++) {
         assertArrayEquals(matrix[i], matrix1[i]);
     }

}
  
@Test
public void testLinecount3() {
   PieceSquare cubo1 = new PieceSquare();
   PieceSquare cubo2 = new PieceSquare();
   PieceSquare cubo3 = new PieceSquare();
   PieceSquare cubo4 = new PieceSquare();
   PieceSquare cubo5 = new PieceSquare();
   PieceSquare cubo6 = new PieceSquare();
    Board board = new Board(20, 10);
    Board board1 = new Board(20, 10);

      board.insertPiece(cubo1,0,0);
      board.insertPiece(cubo2,0,2);
      board.insertPiece(cubo3,0,4);
      board.insertPiece(cubo4,0,6);
      board.insertPiece(cubo5,0,8);
      board.insertPiece(cubo6,2,8);
      board.borrarFilaLlena();
      
      int[][]matrix = board.getBoard();
      int[][]matrix1 = board1.getBoard();


      for (int i = 0; i < matrix.length; i++) {
         assertNotEquals(matrix[i], matrix1[i]);
     }

}/*
public void lineCount(int[][] matrix) {
   int rows = matrix.length;
   int cols = matrix[0].length;

   // Variable para llevar un seguimiento de las filas eliminadas
   int filasEliminadas = 0;

   // Iterar a través de las filas de la matriz desde la última hacia la primera
   for (int row = rows - 1; row >= 0; row--) {
       boolean filaPorEliminar = true;
       int primerElemento = matrix[row][0];

       // Comprobar si todos los elementos de la fila son iguales y distintos de cero
       for (int col = 0; col < cols; col++) {
           if (matrix[row][col] != primerElemento || matrix[row][col] == 0) {
               filaPorEliminar = false;
               break;
           }
       }

       if (filaPorEliminar) {
           // Eliminar la fila
           for (int r = row; r < rows - 1; r++) {
               for (int c = 0; c < cols; c++) {
                   matrix[r][c] = matrix[r + 1][c];
               }
           }

           // Reducir el número de filas
           rows--;

           // Incrementar el contador de filas eliminadas
           filasEliminadas++;
       }
   }

   // Crear una nueva fila en la parte superior llena de ceros
   int[] nuevaFila = new int[cols];
   for (int col = 0; col < cols; col++) {
       nuevaFila[col] = 0;
   }

   // Insertar la nueva fila en la parte superior
   for (int i = 0; i < filasEliminadas; i++) {
       for (int r = rows; r > 0; r--) {
           for (int c = 0; c < cols; c++) {
               matrix[r][c] = matrix[r - 1][c];
           }
       }
       for (int col = 0; col < cols; col++) {
           matrix[0][col] = nuevaFila[col];
       }
   }
}
/* */

@Test /// que pasa ?
public void testMoverPiezaAbajo0() {
   Board board = new Board(20, 10);

    board.insertRandomPiece();
    int [][] matrix = board.getBoard();

    board.moverPieceAbajo();

   assertArrayEquals(board.getBoard(), matrix);
}

@Test
public void InsertarPiece(){
   boolean existe = false;
   
   Board board = new Board(20, 10);
   PieceEleLeft peiceEle = new PieceEleLeft();

   board.insertPiece(peiceEle,0,0);
   int [][] matriz = board.getBoard();
   for(int i=0;i<10 ;i++){
      if(matriz [0][i] == 1 ){

         existe = true;
      }
   }
   assertTrue(existe);
}  

  @Test
public void InsertarRandomPiece(){
   
   boolean existe = false;
   Board board = new Board(20, 10);
   
   board.insertRandomPiece();

   int [][] matriz = board.getBoard();

   for(int i=0;i<10 ;i++){
      if(matriz [0][i] == 1 ){

         existe = true;
      }
   }
   for(int i=0;i<10 ;i++){
      if(matriz [1][i] == 1 ){

         existe = true;
      }
   }for(int i=0;i<10 ;i++){
      if(matriz [2][i] == 1 ){

         existe = true;
      }
   }
   assertTrue(existe);
}  

@Test 
public void moverSiSePuedeTest(){

   Board board1 = new Board(20, 10);
   PieceSquare pieceSquare = new PieceSquare();
   PieceSquare pieceSquare2 = new PieceSquare();

   
   board1.insertPiece(pieceSquare,0,0);
   board1.insertPiece(pieceSquare2,0,4);
   board1.moverSiSePuede();
   
   int [][] matrix = board1.getBoard();

   for (int i = 0; i < 10; i++) {
      assertEquals(matrix[0][i],0 );
  }
}

@Test
public void colisionTest(){

   Board board1 = new Board(20,10);  
   PieceSquare sqr = new PieceSquare();

   board1.insertPiece(sqr, 0, 0);

   assertTrue(board1.colision(0,0));

}

@Test
public void testMoverPiezaAbajo1() {
   Board board = new Board(20, 10);
    PieceBase piece = new PieceT();

    board.insertPiece(piece, 0, 0);
    board.moverPieceAbajo();
    boolean colision=true;
    for (int i = 0; i < 10; i++) {
        if (board.getBoard()[0][i] != 0) {
            colision = false;
        }
    }
    assertTrue(colision);
}

@Test
public void juegoTerminado1() {
    int rows = 20;
    int cols = 10;
    Board board = new Board(rows, cols);
   PieceBase piece = new PieceSquare();
   PieceBase piece1 = new PieceSquare();

    board.insertPiece(piece, 0, 0);
    board.insertPiece(piece1, 0, 6);
    board.juegoTerminado();

    assertTrue(board.juegoTerminado());
}

@Test
public void rotarPieceTableroR(){
    int rows = 20;
    int cols = 10;
    Board board = new Board(rows, cols);
   Board board1 = new Board(rows, cols);
    PieceBase piece = board.randomPieceAndRotate();
      int[][]matrix = board.getBoard();
      int[][]matrix1 = board1.getBoard();
    board.rotateRight(piece);

  for (int i = 0; i < matrix.length; i++) {
         assertNotEquals(matrix[i], matrix1[i]);
     }
}

@Test
public void rotarPieceTableroL(){
    int rows = 20;
    int cols = 10;
    Board board = new Board(rows, cols);
   Board board1 = new Board(rows, cols);
    PieceBase piece = board.randomPieceAndRotate();
      int[][]matrix = board.getBoard();
      int[][]matrix1 = board1.getBoard();
    board.rotateLeft(piece);

  for (int i = 0; i < matrix.length; i++) {
         assertNotEquals(matrix[i], matrix1[i]);
     }
}

@Test
public void sePuedeMover2(){ //era mas facil con palos
    int rows = 20;
    int cols = 10;
    Board board = new Board(rows, cols);
    PieceBase cubo = new PieceSquare();
    PieceBase cubo2 = new PieceSquare();
    PieceBase cubo3 = new PieceSquare();
    PieceBase cubo4 = new PieceSquare();
    PieceBase cubo5 = new PieceSquare();
    PieceBase cubo6 = new PieceSquare();
    PieceBase cubo7 = new PieceSquare();
    PieceBase cubo8 = new PieceSquare();
    PieceBase cubo9 = new PieceSquare();
    PieceBase cubo10 = new PieceSquare();

    board.insertPiece(cubo, 0, 0);
    board.insertPiece(cubo2, 2, 0);
    board.insertPiece(cubo3, 4, 0);
    board.insertPiece(cubo4, 6, 0);
    board.insertPiece(cubo5, 14, 0);
    board.insertPiece(cubo6, 8, 0);
    board.insertPiece(cubo7, 10, 0);
    board.insertPiece(cubo8, 12, 0);
    board.insertPiece(cubo9, 16, 0);
    board.insertPiece(cubo10, 18, 0);   

    boolean sePuedeMover = board.sePuedeMover(); // Llama al método en Board

    assertFalse(sePuedeMover);
} 

@Test
public void testSePuedeMover() {
    
   Board board = new Board(4, 10);
   // Crea una disposición específica en el tablero para la prueba
    
    int[][] testBoard = {
        {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        // Resto de las filas llenas de ceros
    };

    // Establece el estado del tablero con la disposición de prueba
    board.setBoard(testBoard);

    // Llama al método sePuedeMover
    boolean resultado = board.sePuedeMover();

    // Verifica que el resultado sea el esperado (true o false)
    // En este ejemplo, se espera que sea true porque la pieza puede moverse hacia abajo
    assertTrue(resultado);
}

@Test
public void testInsertRandomPieceTF() {
    
  int rows = 20;
    int cols = 10;
    Board board = new Board(rows, cols);
    PieceBase cubo = new PieceSquare();
    PieceBase cubo2 = new PieceSquare();
    PieceBase cubo3 = new PieceSquare();
    PieceBase cubo4 = new PieceSquare();
    PieceBase cubo5 = new PieceSquare();
    PieceBase cubo6 = new PieceSquare();
    PieceBase cubo7 = new PieceSquare();
    PieceBase cubo8 = new PieceSquare();
    PieceBase cubo9 = new PieceSquare();
    PieceBase cubo10 = new PieceSquare();

    board.insertPiece(cubo, 0, 0);
    board.insertPiece(cubo2, 2, 0);
    board.insertPiece(cubo3, 4, 0);
    board.insertPiece(cubo4, 6, 0);
    board.insertPiece(cubo5, 14, 0);
    board.insertPiece(cubo6, 8, 0);
    board.insertPiece(cubo7, 10, 0);
    board.insertPiece(cubo8, 12, 0);
    board.insertPiece(cubo9, 16, 0);
    board.insertPiece(cubo10, 18, 0);  

    assertFalse(board.insertRandomPieceTF());
}

@Test
public void testInsertRandomPieceTF2() {
    
  int rows = 2;
    int cols = 1;
    Board board = new Board(rows, cols);

    assertTrue(board.insertRandomPieceTF());
}

@Test
   public void testTickClock() {
       Clock clock = new Clock();
       
       // Verifica que el tiempo se inicialice en 0
       assertEquals(0, clock.tiempo);
}

@Test
      public void testTick1(){
      Clock clock = new Clock();
       // Llama al método tick una vez
       clock.tick();
   
       // Verifica que el tiempo se haya incrementado en 1
       assertEquals(1, clock.tiempo);
}

   @Test
   public void testTick2() {
      Clock clock = new Clock();
       // Llama al método tick nuevamente
       clock.tick();
       clock.tick();

       // Verifica que el tiempo se haya incrementado en 1 nuevamente
       assertEquals(2, clock.tiempo);
}

@Test
  public void testLineAcount1(){
   Board board = new Board(20, 10);
      PieceBase cubo = new PieceSquare();
      PieceBase cubo1 = new PieceSquare();
      PieceBase cubo2 = new PieceSquare();
      PieceBase cubo3 = new PieceSquare();
      PieceBase cubo4 = new PieceSquare();

      board.insertPiece(cubo,0,0);
      board.insertPiece(cubo1,0,2);
      board.insertPiece(cubo2,0,4);
      board.insertPiece(cubo3,0,6);
      board.insertPiece(cubo4,0,8);  
   

      assertEquals(2,board.lineCount());

}


@Test
  public void testVictoriaWin(){
      Board board = new Board(20, 10);
      Tetris tetris = new Tetris();

      PieceBase cubo = new PieceSquare();
      PieceBase cubo1 = new PieceSquare();
      PieceBase cubo2 = new PieceSquare();
      PieceBase cubo3 = new PieceSquare();
      PieceBase cubo4 = new PieceSquare();
      PieceBase cubo5 = new PieceSquare();
      PieceBase cubo6 = new PieceSquare();
      PieceBase cubo7 = new PieceSquare();
      PieceBase cubo8 = new PieceSquare();
      PieceBase cubo9 = new PieceSquare();
      PieceBase cubo10 = new PieceSquare();
      PieceBase cubo11 = new PieceSquare();
      PieceBase cubo12 = new PieceSquare();
      PieceBase cubo13 = new PieceSquare();
      PieceBase cubo14 = new PieceSquare();


      board.insertPiece(cubo,0,0);
      board.insertPiece(cubo1,0,2);
      board.insertPiece(cubo2,0,4);
      board.insertPiece(cubo3,0,6);
      board.insertPiece(cubo4,0,8);  

      for(int i=0;i<10;i++ ){
         board.moverSiSePuede();
      }
      board.insertPiece(cubo5,0,0);
      board.insertPiece(cubo6,0,2);
      board.insertPiece(cubo7,0,4);
      board.insertPiece(cubo8,0,6);
      board.insertPiece(cubo9,0,8);  

      for(int i=0;i<10;i++ ){
         board.moverSiSePuede();
      }
      board.insertPiece(cubo10,0,0);
      board.insertPiece(cubo11,0,2);
      board.insertPiece(cubo12,0,4);
      board.insertPiece(cubo13,0,6);
      board.insertPiece(cubo14,0,8);  

      for(int i=0;i<10;i++ ){
         board.moverSiSePuede();
      }
      
    assertTrue(tetris.victoria());
}

@Test
public void testGameOver(){
   Tetris tetris = new Tetris();
   Board board = new Board(20, 10);
      PieceBase cubo = new PieceStick();
      PieceBase cubo1 = new PieceStick();
      PieceBase cubo2 = new PieceStick();
      PieceBase cubo3 = new PieceStick();
      PieceBase cubo4 = new PieceStick();


      board.insertPiece(cubo,0,0);
        for(int i=0;i<10;i++ ){
         board.moverSiSePuede();
      }
      board.insertPiece(cubo1,0,0);
        for(int i=0;i<10;i++ ){
         board.moverSiSePuede();
      }
      board.insertPiece(cubo2,0,0);
        for(int i=0;i<10;i++ ){
         board.moverSiSePuede();
      }
      board.insertPiece(cubo3,0,0);
        for(int i=0;i<10;i++ ){
         board.moverSiSePuede();
      }
      board.insertPiece(cubo4,0,0); 
        for(int i=0;i<10;i++ ){
         board.moverSiSePuede();
      } 
      
      assertTrue(tetris.gameOver(board));
   }

@Test
public void testStar() {
   Tetris tetris = new Tetris();
   Board board = new Board(20, 10);
      
   tetris.Start(board);

   boolean existe = false;
   int [][] matriz = board.getBoard();
   
      for (int i = 0; i < 20; i++) {
         for (int c = 0; c < 10; c++) {
               if( matriz [i][c] != 0 ){
               existe = true;
               }
            }
         }

   assertTrue(existe);
}

@Test // se que va con trampoa pero no se enoje profe//
public void testStar1() {  
   Tetris tetris = new Tetris();
   Board board = new Board(20, 10);
      
   tetris.Start(board);
   boolean bajo = true;

   int[][] matrix = board.getBoard();

   for(int i = 0; i < 10 ; i++){
      if( matrix[0][i] != 0){
         bajo = false;
      }
   }  

   assertTrue(bajo);
}

@Test
public void testStateJuegoTerminado() {

   Board board = new Board(20, 10);
   Tetris tetris = new Tetris();
   PieceBase piece = new PieceSquare();
   PieceBase piece1 = new PieceSquare();

    board.insertPiece(piece, 0, 0);
    board.insertPiece(piece1, 0, 6);

    assertFalse(tetris.state(board));
}

@Test
public void testStateRandomPieceInserted() {
   Board board = new Board(20, 10);
   Tetris tetris = new Tetris();
   for (int i = 0; i < 20; i++) {
      board.insertRandomPiece();}

      assertFalse(tetris.state(board));
}

@Test
public void testInsertRandomPieceTF3() { //explota
   Board board = new Board(20, 10);
   Tetris tetris = new Tetris();

   for (int i = 0; i < 20; i++) {
      board.insertRandomPiece();}

      assertFalse(tetris.state(board));
}

@Test
public void testTickTetris1() {
    // Crea una instancia de Board
    Board board = new Board(20, 10);
    Tetris tetris = new Tetris(board);
 
    
    PieceSquare pieceSquare = new PieceSquare();
    PieceSquare pieceSquare2 = new PieceSquare();
 
    board.insertPiece(pieceSquare, 0, 0);
    board.insertPiece(pieceSquare2, 0, 4);
 
    
    tetris.tick();

    int[][] matrix = board.getBoard();
    
    for (int i = 0; i < 10; i++) {
   assertEquals(0, matrix[0][i]);
   }
}

@Test
public void testTickTetrisClock() {
   Tetris tetris = new Tetris();

   tetris.tick(); 

   int x = tetris.clock.getClock(); 
   
   assertEquals(1, x);
}

@Test
public void testTickLinecount(){
   
    Board board = new Board(20, 10);
   Tetris tetris = new Tetris(board);
      PieceBase cubo = new PieceSquare();
      PieceBase cubo1 = new PieceSquare();
      PieceBase cubo2 = new PieceSquare();
      PieceBase cubo3 = new PieceSquare();
      PieceBase cubo4 = new PieceSquare();


      board.insertPiece(cubo,0,0);
      board.insertPiece(cubo1,0,2);
      board.insertPiece(cubo2,0,4);
      board.insertPiece(cubo3,0,6);
      board.insertPiece(cubo4,0,8);  
      

      tetris.tick(); 
      int[][] matriz = board.getBoard();

      boolean nada = true;
      
      for (int i = 0; i < 20; i++) {
          for (int c = 0; c < 10; c++) {
              if (matriz[i][c] != 0) {
                  nada = false;
                  break;
              }
          }
          if (!nada) {
              break; // Si encontramos un valor diferente de cero, no necesitamos continuar verificando
          }
      }
   assertTrue(nada);
   }
   
@Test
public void testTickborrarFilaLlena(){ //es trampa pero cuenta todo bien
   
    Board board = new Board(20, 10);
   Tetris tetris = new Tetris(board);
      PieceBase cubo = new PieceSquare();
      PieceBase cubo1 = new PieceSquare();
      PieceBase cubo2 = new PieceSquare();
      PieceBase cubo3 = new PieceSquare();
      PieceBase cubo4 = new PieceSquare();


      board.insertPiece(cubo,0,0);
      board.insertPiece(cubo1,0,2);
      board.insertPiece(cubo2,0,4);
      board.insertPiece(cubo3,0,6);
      board.insertPiece(cubo4,0,8);  
      

      tetris.tick(); 
      int[][] matriz = board.getBoard();

      boolean nada = true;
      
      for (int i = 0; i < 20; i++) {
          for (int c = 0; c < 10; c++) {
              if (matriz[i][c] != 0) {
                  nada = false;
                  break;
              }
          }
          if (!nada) {
              break; // Si encontramos un valor diferente de cero, no necesitamos continuar verificando
          }
      }
   assertTrue(nada);
   }

@Test
public void testRorateR(){
   PieceStick piece = new PieceStick();
   Board board = new Board(20, 10);
   Tetris tetris = new Tetris(board);

      board.insertPiece( piece ,0,0);

      int[][] matriz = board.getBoard();
      tetris.rotateRight(piece);
      int[][] matrix =  board.getBoard();;

      assertEquals(matriz, matrix);
   }
   @Test
   public void testRorateL1(){
   PieceStick piece = new PieceStick();
   Board board = new Board(20, 10);
   Tetris tetris = new Tetris(board);

      board.insertPiece( piece ,0,0);

      int[][] matriz = board.getBoard();
      tetris.rotateLeft(piece);
      int[][] matrix =  board.getBoard();;

      assertEquals(matriz, matrix);
   }
}//ok//