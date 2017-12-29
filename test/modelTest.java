import org.junit.Test;

import java.util.HashMap;

import generalClasses.Board.Model;
import generalClasses.Pieces.Piece;
import generalClasses.Position.Position;

import static org.junit.Assert.assertEquals;

public class modelTest {

  Model model = new Model();

  @Test
  public void printDefaultBoardTest() {
    model.setupChessBoard();
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  //PAWN TESTS
  
  @Test
  public void pawnBlackSingleFirstMoveTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    model.movePiece(blackPawn1, new Position(2, 0));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "| ||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "|♟|| || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void pawnBlackDoubleFirstMoveTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    model.movePiece(blackPawn1, new Position(3, 0));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "| ||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "|♟|| || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void pawnWhiteSingleFirstMoveTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    model.movePiece(whitePawn2, new Position(5, 1));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| ||♙|| || || || || || |\n" +
                    "|♙|| ||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void pawnWhiteDoubleFirstMoveTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    model.movePiece(whitePawn2, new Position(4, 1));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| ||♙|| || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙|| ||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void blackPawnRightCaptureTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    model.movePiece(whitePawn2, new Position(5, 1));
    model.movePiece(whitePawn2, new Position(4, 1));
    model.movePiece(whitePawn2, new Position(3, 1));
    model.movePiece(blackPawn1, new Position(2, 0));
    model.movePiece(blackPawn1, new Position(3, 1));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "| ||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| ||♟|| || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙|| ||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void blackPawnLeftCaptureTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn3 = pieceHashMap.get("blackPawn3");
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    model.movePiece(whitePawn2, new Position(5, 1));
    model.movePiece(whitePawn2, new Position(4, 1));
    model.movePiece(whitePawn2, new Position(3, 1));
    model.movePiece(whitePawn2, new Position(2, 1));
    model.movePiece(blackPawn3, new Position(2,1));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟|| ||♟||♟||♟||♟||♟|\n" +
                    "| ||♟|| || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙|| ||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void whitePawnRightCaptureTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    model.movePiece(whitePawn2, new Position(5, 1));
    model.movePiece(whitePawn2, new Position(4, 1));
    model.movePiece(whitePawn2, new Position(3, 1));
    model.movePiece(whitePawn2, new Position(2, 1));
    model.movePiece(whitePawn2, new Position(1, 2));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♙||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙|| ||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void whitePawnLeftCaptureTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    model.movePiece(whitePawn2, new Position(5, 1));
    model.movePiece(whitePawn2, new Position(4, 1));
    model.movePiece(whitePawn2, new Position(3, 1));
    model.movePiece(blackPawn1, new Position(2, 0));
    model.movePiece(whitePawn2, new Position(2, 0));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "| ||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "|♙|| || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙|| ||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test (expected = IllegalArgumentException.class)
  public void pawnBlackDoubleSecondMoveFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    model.movePiece(blackPawn1, new Position(2, 0));
    model.movePiece(blackPawn1, new Position(4, 0));
  }

  @Test (expected = IllegalArgumentException.class)
  public void pawnWhiteDoubleSecondMoveFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    model.movePiece(whitePawn2, new Position(5, 1));
    model.movePiece(whitePawn2, new Position(3, 1));
  }

  @Test (expected = IllegalArgumentException.class)
  public void pawnBlackSidewaysFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackPawn1, new Position(3, 1));
  }

  @Test (expected = IllegalArgumentException.class)
  public void pawnBlackDiagonalFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    model.movePiece(blackPawn1, new Position(3, 1));
  }

  @Test (expected = IllegalArgumentException.class)
  public void pawnWhiteSidewaysFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    model.movePiece(whitePawn2, new Position(4, 1));
    model.movePiece(whitePawn2, new Position(4, 2));
  }

  @Test (expected = IllegalArgumentException.class)
  public void pawnWhiteDiagonalFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    model.movePiece(whitePawn2, new Position(4, 1));
    model.movePiece(whitePawn2, new Position(5, 2));
  }

  @Test (expected = IllegalArgumentException.class)
  public void blackPawnBlockFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    Piece blackPawn2 = pieceHashMap.get("blackPawn2");
    model.movePiece(whitePawn2, new Position(5, 1));
    model.movePiece(whitePawn2, new Position(4, 1));
    model.movePiece(whitePawn2, new Position(3, 1));
    model.movePiece(whitePawn2, new Position(2, 1));
    model.movePiece(blackPawn2, new Position(3,1));
  }

  @Test (expected = IllegalArgumentException.class)
  public void whitePawnBlockFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whitePawn2 = pieceHashMap.get("whitePawn2");
    Piece blackPawn2 = pieceHashMap.get("blackPawn2");
    model.movePiece(blackPawn2, new Position(3,1));
    model.movePiece(blackPawn2, new Position(4,1));
    model.movePiece(blackPawn2, new Position(5,1));
    model.movePiece(whitePawn2, new Position(4,1));
    System.out.print(model.printBoard());
  }

  //ROOK TESTS

  @Test
  public void blackRookMoveDownTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(2,0));
    assertEquals("| ||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "| ||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "|♜|| || || || || || || |\n" +
                    "|♟|| || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());

  }

  @Test
  public void blackRookMoveUpTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(2,0));
    model.movePiece(blackRook1, new Position(1,0));
    assertEquals("| ||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♜||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "|♟|| || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());

  }

  @Test
  public void blackRookMoveRightTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(2,0));
    model.movePiece(blackRook1, new Position(2,3));
    assertEquals("| ||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "| ||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || ||♜|| || || || |\n" +
                    "|♟|| || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());

  }

  @Test
  public void blackRookMoveLeftTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(2,0));
    model.movePiece(blackRook1, new Position(2,3));
    model.movePiece(blackRook1, new Position(2,2));
    assertEquals("| ||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "| ||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || ||♜|| || || || || |\n" +
                    "|♟|| || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());

  }

  @Test (expected = IllegalArgumentException.class)
  public void blackRookMoveDownBlockedFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(4,0));
  }

  @Test (expected = IllegalArgumentException.class)
  public void blackRookMoveUpBlockedFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(2,0));
    model.movePiece(blackRook1, new Position(2,1));
    model.movePiece(blackRook1, new Position(4,1));
    model.movePiece(blackRook1, new Position(4,0));
    model.movePiece(blackRook1, new Position(0,0));
  }

  @Test (expected = IllegalArgumentException.class)
  public void blackRookMoveRightBlockedFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackPawn3 = pieceHashMap.get("blackPawn3");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(2,0));
    model.movePiece(blackPawn3, new Position(2,2));
    model.movePiece(blackRook1, new Position(2,3));
  }

  @Test (expected = IllegalArgumentException.class)
  public void blackRookMoveLeftBlockedFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackPawn3 = pieceHashMap.get("blackPawn3");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(2,0));
    model.movePiece(blackRook1, new Position(2,5));
    model.movePiece(blackPawn3, new Position(2,2));
    model.movePiece(blackRook1, new Position(2,1));
  }

  @Test (expected = IllegalArgumentException.class)
  public void blackRookMoveDiagonalFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(2,0));
    model.movePiece(blackRook1, new Position(3,1));
  }
}