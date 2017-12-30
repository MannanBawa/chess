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
  public void pawnBlackReverseMoveFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    model.movePiece(blackPawn1, new Position(2, 0));
    model.movePiece(blackPawn1, new Position(1, 0));
  }

  @Test (expected = IllegalArgumentException.class)
  public void pawnWhiteReverseMoveFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whitePawn1 = pieceHashMap.get("whitePawn1");
    model.movePiece(whitePawn1, new Position(4, 0));
    model.movePiece(whitePawn1, new Position(5, 0));
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
  public void pawnBlackBlockFailTest() {
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
  public void pawnWhiteBlockFailTest() {
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
  public void rookBlackMoveDownTest() {
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
  public void rookBlackMoveUpTest() {
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
  public void rookBlackMoveRightTest() {
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
  public void rookBlackMoveLeftTest() {
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
  public void rookBlackMoveDownBlockedFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(4,0));
  }

  @Test (expected = IllegalArgumentException.class)
  public void rookBlackMoveUpBlockedFailTest() {
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
  public void rookBlackMoveRightBlockedFailTest() {
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
  public void rookBlackMoveLeftBlockedFailTest() {
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
  public void rookBlackMoveDiagonalFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn1 = pieceHashMap.get("blackPawn1");
    Piece blackRook1 = pieceHashMap.get("blackRook1");
    model.movePiece(blackPawn1, new Position(3, 0));
    model.movePiece(blackRook1, new Position(2,0));
    model.movePiece(blackRook1, new Position(3,1));
  }

  //KNIGHT TESTS

  @Test
  public void knightBlackMoveDownRightTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackKnight1 = pieceHashMap.get("blackKnight1");
    model.movePiece(blackKnight1, new Position(2, 2));
    assertEquals("|♜|| ||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || ||♞|| || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void knightBlackMoveDownLeftTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackKnight1 = pieceHashMap.get("blackKnight1");
    model.movePiece(blackKnight1, new Position(2, 0));
    assertEquals("|♜|| ||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "|♞|| || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void knightBlackMoveRightDownTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackKnight1 = pieceHashMap.get("blackKnight1");
    model.movePiece(blackKnight1, new Position(2, 2));
    model.movePiece(blackKnight1, new Position(3, 4));
    assertEquals("|♜|| ||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || || ||♞|| || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void knightBlackMoveLeftDownTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackKnight1 = pieceHashMap.get("blackKnight1");
    model.movePiece(blackKnight1, new Position(2, 2));
    model.movePiece(blackKnight1, new Position(3, 0));
    assertEquals("|♜|| ||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "|♞|| || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void knightWhiteMoveUpRightTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteKnight2 = pieceHashMap.get("whiteKnight2");
    model.movePiece(whiteKnight2, new Position(5, 7));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || ||♘|\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗|| ||♖|\n",
            model.printBoard());
  }

  @Test
  public void knightWhiteMoveUpLeftTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteKnight2 = pieceHashMap.get("whiteKnight2");
    model.movePiece(whiteKnight2, new Position(5, 5));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || ||♘|| || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗|| ||♖|\n",
            model.printBoard());
  }

  @Test
  public void knightWhiteMoveRightUpTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteKnight2 = pieceHashMap.get("whiteKnight2");
    model.movePiece(whiteKnight2, new Position(5, 5));
    model.movePiece(whiteKnight2, new Position(4, 7));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || ||♘|\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗|| ||♖|\n",
            model.printBoard());
  }

  @Test
  public void knightWhiteMoveLeftUpTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteKnight2 = pieceHashMap.get("whiteKnight2");
    model.movePiece(whiteKnight2, new Position(5, 5));
    model.movePiece(whiteKnight2, new Position(4, 3));
    assertEquals("|♜||♞||♝||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♟||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || ||♘|| || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗|| ||♖|\n",
            model.printBoard());
  }

  @Test (expected = IllegalArgumentException.class)
  public void knightWhiteMoveUpFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteKnight2 = pieceHashMap.get("whiteKnight2");
    model.movePiece(whiteKnight2, new Position(5, 5));
    model.movePiece(whiteKnight2, new Position(4, 3));
    model.movePiece(whiteKnight2, new Position(3, 3));
  }

  @Test (expected = IllegalArgumentException.class)
  public void knightWhiteMoveRightFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteKnight2 = pieceHashMap.get("whiteKnight2");
    model.movePiece(whiteKnight2, new Position(5, 5));
    model.movePiece(whiteKnight2, new Position(4, 3));
    model.movePiece(whiteKnight2, new Position(4, 7));
  }

  @Test (expected = IllegalArgumentException.class)
  public void knightWhiteMoveLeftFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteKnight2 = pieceHashMap.get("whiteKnight2");
    model.movePiece(whiteKnight2, new Position(5, 5));
    model.movePiece(whiteKnight2, new Position(4, 3));
    model.movePiece(whiteKnight2, new Position(4, 0));
  }

  @Test (expected = IllegalArgumentException.class)
  public void knightWhiteMoveDownFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteKnight2 = pieceHashMap.get("whiteKnight2");
    model.movePiece(whiteKnight2, new Position(5, 5));
    model.movePiece(whiteKnight2, new Position(4, 3));
    model.movePiece(whiteKnight2, new Position(5, 3));
  }

  //BISHOP TESTS

  @Test
  public void bishopBlackMoveDownRightTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn4 = pieceHashMap.get("blackPawn4");
    Piece blackBish1 = pieceHashMap.get("blackBish1");
    model.movePiece(blackPawn4, new Position(2, 3));
    model.movePiece(blackBish1, new Position(3, 5));
    assertEquals("|♜||♞|| ||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟|| ||♟||♟||♟||♟|\n" +
                    "| || || ||♟|| || || || |\n" +
                    "| || || || || ||♝|| || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void bishopBlackMoveDownLeftTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn4 = pieceHashMap.get("blackPawn4");
    Piece blackBish1 = pieceHashMap.get("blackBish1");
    model.movePiece(blackPawn4, new Position(2, 3));
    model.movePiece(blackBish1, new Position(2, 4));
    model.movePiece(blackBish1, new Position(3, 3));
    assertEquals("|♜||♞|| ||♛||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟|| ||♟||♟||♟||♟|\n" +
                    "| || || ||♟|| || || || |\n" +
                    "| || || ||♝|| || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void bishopBlackMoveUpLeftTest() {
      model.setupChessBoard();
      HashMap<String, Piece> pieceHashMap = model.getPieceMap();
      Piece blackPawn4 = pieceHashMap.get("blackPawn4");
      Piece blackBish1 = pieceHashMap.get("blackBish1");
      model.movePiece(blackPawn4, new Position(2, 3));
      model.movePiece(blackBish1, new Position(2, 4));
      model.movePiece(blackBish1, new Position(3, 3));
      model.movePiece(blackBish1, new Position(2, 2));
      assertEquals("|♜||♞|| ||♛||♚||♝||♞||♜|\n" +
                      "|♟||♟||♟|| ||♟||♟||♟||♟|\n" +
                      "| || ||♝||♟|| || || || |\n" +
                      "| || || || || || || || |\n" +
                      "| || || || || || || || |\n" +
                      "| || || || || || || || |\n" +
                      "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                      "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
              model.printBoard());
    }

  @Test
  public void bishopBlackMoveUpRightTest() {
      model.setupChessBoard();
      HashMap<String, Piece> pieceHashMap = model.getPieceMap();
      Piece blackPawn4 = pieceHashMap.get("blackPawn4");
      Piece blackBish1 = pieceHashMap.get("blackBish1");
      model.movePiece(blackPawn4, new Position(2, 3));
      model.movePiece(blackBish1, new Position(2, 4));
      model.movePiece(blackBish1, new Position(3, 3));
      model.movePiece(blackBish1, new Position(2, 2));
      model.movePiece(blackBish1, new Position(1, 3));
      assertEquals("|♜||♞|| ||♛||♚||♝||♞||♜|\n" +
                      "|♟||♟||♟||♝||♟||♟||♟||♟|\n" +
                      "| || || ||♟|| || || || |\n" +
                      "| || || || || || || || |\n" +
                      "| || || || || || || || |\n" +
                      "| || || || || || || || |\n" +
                      "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                      "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
              model.printBoard());
  }

  @Test (expected = IllegalArgumentException.class)
  public void bishopBlackMoveDownRightBlockedFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackBish1 = pieceHashMap.get("blackBish1");
    model.movePiece(blackBish1, new Position(2, 4));
  }

  @Test (expected = IllegalArgumentException.class)
  public void bishopBlackMoveDownLeftBlockedFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackBish1 = pieceHashMap.get("blackBish1");
    model.movePiece(blackBish1, new Position(2, 0));
  }

  @Test (expected = IllegalArgumentException.class)
  public void bishopWhiteMoveUpRightBlockedFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteBish2 = pieceHashMap.get("whiteBish2");
    model.movePiece(whiteBish2, new Position(5, 7));
  }

  @Test (expected = IllegalArgumentException.class)
  public void bishopWhiteMoveUpLeftBlockedFailTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece whiteBish2 = pieceHashMap.get("whiteBish2");
    model.movePiece(whiteBish2, new Position(5, 3));
  }

  //QUEEN TESTS

  @Test
  public void queenMoveDownTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn4 = pieceHashMap.get("blackPawn4");
    Piece blackQueen = pieceHashMap.get("blackQueen");
    model.movePiece(blackPawn4, new Position(3, 3));
    model.movePiece(blackQueen, new Position(2, 3));
    assertEquals("|♜||♞||♝|| ||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟|| ||♟||♟||♟||♟|\n" +
                    "| || || ||♛|| || || || |\n" +
                    "| || || ||♟|| || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void queenMoveRightTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn4 = pieceHashMap.get("blackPawn4");
    Piece blackQueen = pieceHashMap.get("blackQueen");
    model.movePiece(blackPawn4, new Position(3, 3));
    model.movePiece(blackQueen, new Position(2, 3));
    model.movePiece(blackQueen, new Position(2, 5));
    assertEquals("|♜||♞||♝|| ||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟|| ||♟||♟||♟||♟|\n" +
                    "| || || || || ||♛|| || |\n" +
                    "| || || ||♟|| || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void queenMoveLeftTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn4 = pieceHashMap.get("blackPawn4");
    Piece blackQueen = pieceHashMap.get("blackQueen");
    model.movePiece(blackPawn4, new Position(3, 3));
    model.movePiece(blackQueen, new Position(2, 3));
    model.movePiece(blackQueen, new Position(2, 0));
    assertEquals("|♜||♞||♝|| ||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟|| ||♟||♟||♟||♟|\n" +
                    "|♛|| || || || || || || |\n" +
                    "| || || ||♟|| || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void queenMoveUpTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn4 = pieceHashMap.get("blackPawn4");
    Piece blackQueen = pieceHashMap.get("blackQueen");
    model.movePiece(blackPawn4, new Position(3, 3));
    model.movePiece(blackQueen, new Position(2, 3));
    model.movePiece(blackQueen, new Position(1, 3));
    assertEquals("|♜||♞||♝|| ||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟||♛||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || ||♟|| || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void queenMoveDownRightDiagonalTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn4 = pieceHashMap.get("blackPawn4");
    Piece blackQueen = pieceHashMap.get("blackQueen");
    model.movePiece(blackPawn4, new Position(3, 3));
    model.movePiece(blackQueen, new Position(2, 3));
    model.movePiece(blackQueen, new Position(3, 4));
    assertEquals("|♜||♞||♝|| ||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟|| ||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || ||♟||♛|| || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  public void queenMoveDownLeftDiagonalTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn4 = pieceHashMap.get("blackPawn4");
    Piece blackQueen = pieceHashMap.get("blackQueen");
    model.movePiece(blackPawn4, new Position(3, 3));
    model.movePiece(blackQueen, new Position(2, 3));
    model.movePiece(blackQueen, new Position(3, 2));
    assertEquals("|♜||♞||♝|| ||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟|| ||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || ||♛||♟|| || || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }

  @Test
  //TODO: FIX THIS
  public void queenMoveUpRightDiagonalTest() {
    model.setupChessBoard();
    HashMap<String, Piece> pieceHashMap = model.getPieceMap();
    Piece blackPawn4 = pieceHashMap.get("blackPawn4");
    Piece blackQueen = pieceHashMap.get("blackQueen");
    model.movePiece(blackPawn4, new Position(3, 3));
    model.movePiece(blackQueen, new Position(2, 3));
    System.out.print(model.printBoard());
    model.movePiece(blackQueen, new Position(4, 5));
    //model.movePiece(blackQueen, new Position(3, 6));
    assertEquals("|♜||♞||♝|| ||♚||♝||♞||♜|\n" +
                    "|♟||♟||♟|| ||♟||♟||♟||♟|\n" +
                    "| || || || || || || || |\n" +
                    "| || || ||♟||♛|| || || |\n" +
                    "| || || || || || || || |\n" +
                    "| || || || || || || || |\n" +
                    "|♙||♙||♙||♙||♙||♙||♙||♙|\n" +
                    "|♖||♘||♗||♕||♔||♗||♘||♖|\n",
            model.printBoard());
  }



}