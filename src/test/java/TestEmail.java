import org.junit.Assert;
import org.junit.Test;


public class TestEmail {
  

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


}