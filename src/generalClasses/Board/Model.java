package generalClasses.Board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import generalClasses.Enums.PieceType;
import generalClasses.Enums.Team;
import generalClasses.Pieces.IPiece;
import generalClasses.Pieces.Pawn;
import generalClasses.Pieces.Bishop;
import generalClasses.Pieces.Knight;
import generalClasses.Pieces.Piece;
import generalClasses.Pieces.Rook;
import generalClasses.Pieces.Queen;
import generalClasses.Pieces.King;
import generalClasses.Position.Position;
import javafx.geometry.Pos;

//TODO: TURN THIS INTO THE MODEL
public class Model implements IBoard {

  protected Tile Board[][];
  protected int numRows;
  protected int numCols;
  private HashMap<String, Piece> pieceMap = new HashMap<>();
  //TODO: FIGURE OUT HOW TO MAKE THE PIECES ACCESSIBLE

  /**
   * Creates a 0 by 0 board
   */
  public Model() {
    this.Board = new Tile[8][8];
    this.numRows = 0;
    this.numCols = 0;
  }

  public void setupChessBoard() {

    Tile[][] thisBoard = new Tile[8][8];
    for (int a = 0; a < 8; a++) {
      for (int b = 0; b < 8; b++) {
        thisBoard[a][b] = new Tile();
      }
    }

    //Rooks
    Rook blackRook1 = new Rook(new Position(0,0), Team.BLACK);
    Rook blackRook2 = new Rook(new Position(0,7), Team.BLACK);
    Rook whiteRook1 = new Rook(new Position(7,0), Team.WHITE);
    Rook whiteRook2 = new Rook(new Position(7,7), Team.WHITE);

    thisBoard[0][0].addPiece(blackRook1);
    thisBoard[0][7].addPiece(blackRook2);
    thisBoard[7][0].addPiece(whiteRook1);
    thisBoard[7][7].addPiece(whiteRook2);

    pieceMap.put("blackRook1", blackRook1);
    pieceMap.put("blackRook2", blackRook2);
    pieceMap.put("whiteRook1", whiteRook1);
    pieceMap.put("whiteRook2", whiteRook2);

    //Knights
    Knight blackKnight1 = new Knight(new Position(0,1), Team.BLACK);
    Knight blackKnight2 = new Knight(new Position(0,6), Team.BLACK);
    Knight whiteKnight1 = new Knight(new Position(7,1), Team.WHITE);
    Knight whiteKnight2 = new Knight(new Position(7,6), Team.WHITE);

    thisBoard[0][1].addPiece(blackKnight1);
    thisBoard[0][6].addPiece(blackKnight2);
    thisBoard[7][1].addPiece(whiteKnight1);
    thisBoard[7][6].addPiece(whiteKnight2);

    pieceMap.put("blackKnight1", blackKnight1);
    pieceMap.put("blackKnight2", blackKnight2);
    pieceMap.put("whiteKnight1", whiteKnight1);
    pieceMap.put("whiteKnight2", whiteKnight2);

    //Bishops
    Bishop blackBish1 = new Bishop(new Position(0,2), Team.BLACK);
    Bishop blackBish2 = new Bishop(new Position(0,5), Team.BLACK);
    Bishop whiteBish1 = new Bishop(new Position(7,2), Team.WHITE);
    Bishop whiteBish2 = new Bishop(new Position(7,5), Team.WHITE);

    thisBoard[0][2].addPiece(blackBish1);
    thisBoard[0][5].addPiece(blackBish2);
    thisBoard[7][2].addPiece(whiteBish1);
    thisBoard[7][5].addPiece(whiteBish2);

    pieceMap.put("blackBish1", blackBish1);
    pieceMap.put("blackBish2", blackBish2);
    pieceMap.put("whiteBish1", whiteBish1);
    pieceMap.put("whiteBish2", whiteBish2);

    //Queens
    Queen blackQueen = new Queen(new Position(0, 3), Team.BLACK);
    Queen whiteQueen = new Queen(new Position(7, 3), Team.WHITE);

    thisBoard[0][3].addPiece(blackQueen);
    thisBoard[7][3].addPiece(whiteQueen);

    pieceMap.put("blackQueen", blackQueen);
    pieceMap.put("whiteQueen", whiteQueen);

    //Kings
    King blackKing = new King(new Position(0, 4), Team.BLACK);
    King whiteKing = new King(new Position(7,4), Team.WHITE);

    thisBoard[0][4].addPiece(blackKing);
    thisBoard[7][4].addPiece(whiteKing);

    pieceMap.put("blackKing", blackKing);
    pieceMap.put("whiteKing", whiteKing);

    //Pawns
    Pawn blackPawn1 = new Pawn(new Position(1,0), Team.BLACK);
    Pawn blackPawn2 = new Pawn(new Position(1,1), Team.BLACK);
    Pawn blackPawn3 = new Pawn(new Position(1,2), Team.BLACK);
    Pawn blackPawn4 = new Pawn(new Position(1,3), Team.BLACK);
    Pawn blackPawn5 = new Pawn(new Position(1,4), Team.BLACK);
    Pawn blackPawn6 = new Pawn(new Position(1,5), Team.BLACK);
    Pawn blackPawn7 = new Pawn(new Position(1,6), Team.BLACK);
    Pawn blackPawn8 = new Pawn(new Position(1,7), Team.BLACK);

    Pawn whitePawn1 = new Pawn(new Position(6,0), Team.WHITE);
    Pawn whitePawn2 = new Pawn(new Position(6,1), Team.WHITE);
    Pawn whitePawn3 = new Pawn(new Position(6,2), Team.WHITE);
    Pawn whitePawn4 = new Pawn(new Position(6,3), Team.WHITE);
    Pawn whitePawn5 = new Pawn(new Position(6,4), Team.WHITE);
    Pawn whitePawn6 = new Pawn(new Position(6,5), Team.WHITE);
    Pawn whitePawn7 = new Pawn(new Position(6,6), Team.WHITE);
    Pawn whitePawn8 = new Pawn(new Position(6,7), Team.WHITE);

    thisBoard[1][0].addPiece(blackPawn1);
    thisBoard[1][1].addPiece(blackPawn2);
    thisBoard[1][2].addPiece(blackPawn3);
    thisBoard[1][3].addPiece(blackPawn4);
    thisBoard[1][4].addPiece(blackPawn5);
    thisBoard[1][5].addPiece(blackPawn6);
    thisBoard[1][6].addPiece(blackPawn7);
    thisBoard[1][7].addPiece(blackPawn8);

    thisBoard[6][0].addPiece(whitePawn1);
    thisBoard[6][1].addPiece(whitePawn2);
    thisBoard[6][2].addPiece(whitePawn3);
    thisBoard[6][3].addPiece(whitePawn4);
    thisBoard[6][4].addPiece(whitePawn5);
    thisBoard[6][5].addPiece(whitePawn6);
    thisBoard[6][6].addPiece(whitePawn7);
    thisBoard[6][7].addPiece(whitePawn8);

    pieceMap.put("blackPawn1", blackPawn1);
    pieceMap.put("blackPawn2", blackPawn2);
    pieceMap.put("blackPawn3", blackPawn3);
    pieceMap.put("blackPawn4", blackPawn4);
    pieceMap.put("blackPawn5", blackPawn5);
    pieceMap.put("blackPawn6", blackPawn6);
    pieceMap.put("blackPawn7", blackPawn7);
    pieceMap.put("blackPawn8", blackPawn8);

    pieceMap.put("whitePawn1", whitePawn1);
    pieceMap.put("whitePawn2", whitePawn2);
    pieceMap.put("whitePawn3", whitePawn3);
    pieceMap.put("whitePawn4", whitePawn4);
    pieceMap.put("whitePawn5", whitePawn5);
    pieceMap.put("whitePawn6", whitePawn6);
    pieceMap.put("whitePawn7", whitePawn7);
    pieceMap.put("whitePawn8", whitePawn8);

    this.Board = thisBoard;
    this.numRows = 8;
    this.numCols = 8;
  }

  @Override
  public void clearBoard() {
  }

  @Override
  public String printBoard() {
    StringBuilder outputString = new StringBuilder();
    Tile[][] board = this.Board;

    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        IPiece thisPiece = board[i][j].getCurrentPiece();
        if (thisPiece != null) {
          outputString.append("|" + thisPiece.toString() + "|");
        }
        else {
          outputString.append("| |");
        }
      }
      outputString.append("\n");
    }
    return outputString.toString();
  }

  public HashMap<String, Piece> getPieceMap() {
    return pieceMap;
  }

  public void movePiece(IPiece pieceToMove, Position destination) throws IllegalArgumentException {

    PieceType pieceType = pieceToMove.getType();
    Position srcPos = pieceToMove.getPosition();
    int srcX = srcPos.getX();
    int srcY = srcPos.getY();
    int destX = destination.getX();
    int destY = destination.getY();
    Tile srcTile = Board[srcX][srcY];
    Tile destinationTile = Board[destX][destY];
    boolean isValidMove = false;
    boolean isBlocked = false;

    switch (pieceType) {
      case PAWN: {
        Pawn pawnPiece = (Pawn) pieceToMove;
        isValidMove = isValidPawnMove(srcPos, destination, pawnPiece);
        isBlocked = isPawnMoveBlocked(srcPos, destination);
        if (isValidMove && !isBlocked) {
          pawnPiece.movePiece(destination);
        } else if (isBlocked) {
          throw new IllegalArgumentException("Model: There is a piece in the way, preventing this" +
                  " move");
        } else if (!isValidMove) {
          throw new IllegalArgumentException("Model: Not a valid Pawn move");
        }
        break;
      }
      case ROOK: {
        Rook rookPiece = (Rook) pieceToMove;
        isValidMove = isValidRookMove(srcPos, destination, rookPiece);
        if (isValidMove) {
          isBlocked = isRookMoveBlocked(srcPos, destination);
          if (!isBlocked) {
            rookPiece.movePiece(destination);
          } else {
            throw new IllegalArgumentException("Model: There is a piece in the way, preventing " +
                    "this move");
          }
        } else {
          throw new IllegalArgumentException("Model: Not a valid Rook move");
        }
        break;
      }
      case KNIGHT: {
        Knight knightPiece = (Knight) pieceToMove;
        isValidMove = isValidKnightMove(srcPos, destination);
        if (isValidMove) {
          knightPiece.movePiece(destination);
        } else {
          throw new IllegalArgumentException("Model: Not a valid Knight move");
        }
        break;
      }
      case BISHOP: {
        Bishop bishPiece = (Bishop) pieceToMove;
        isValidMove = isValidBishopMove(srcPos, destination);
        isBlocked = isBishopMoveBlocked(srcPos, destination);
        if (isValidMove) {
          if (!isBlocked) {
            bishPiece.movePiece(destination);
          } else {
            throw new IllegalArgumentException("Model: There is a piece in the way, preventing " +
                    "this move");
          }
        } else {
          throw new IllegalArgumentException("Model: Not a valid Bishop move");
        }
        break;
      }
      case QUEEN: {
        Queen queenPiece = (Queen) pieceToMove;
        isValidMove = isValidQueenMove(srcPos, destination);
        isBlocked = isQueenMoveBlocked(srcPos, destination);
        if (isValidMove) {
          if (!isBlocked) {
            queenPiece.movePiece(destination);
          } else {
            throw new IllegalArgumentException("Model: There is a piece in the way, preventing " +
                    "this move");
          }
        } else {
          throw new IllegalArgumentException("Model: Not a valid Queen move");
        }
        break;
      }
//      case KING: {
//        King kingPiece = (King) pieceToMove;
//        kingPiece.isValidMove(srcPos, destination);
//        break;
//      }
      default: {
        throw new IllegalArgumentException("ERROR: Unknown Piece Type");
      }
    }

    IPiece targetPiece;
    try {
      targetPiece = Board[destX][destY].getCurrentPiece();
    } catch (NullPointerException e) {
      targetPiece = null;
    }

    if (targetPiece != null) {
      Team targetTeam = targetPiece.getTeam();
      Team moverTeam = pieceToMove.getTeam();
      if (targetTeam.equals(moverTeam)) {
        throw new IllegalArgumentException ("Cannot move to space occupied by an allied piece");
      } else {
        destinationTile.removePiece();
        destinationTile.addPiece(pieceToMove);
        srcTile.removePiece();
      }
    } else {
      destinationTile.addPiece(pieceToMove);
      srcTile.removePiece();
    }
  }


  private boolean isValidPawnMove(Position start, Position end, Pawn thisPawn) {

    boolean[] possibleCapture = isPossibleCapture(thisPawn);
      switch (thisPawn.getTeam()) {
        case WHITE: {

          //The two checks below, check to see if the pawn is being moved diagonally to capture a
          // piece
          if (possibleCapture[0]) {         //Capture on board left
            if ((end.getX() == start.getX() - 1) && (end.getY() == start.getY() - 1)) {
              return true;
            }
          }
          if (possibleCapture[1]) {         //Capture on board right
            if ((end.getX() == start.getX() - 1) && (end.getY() == start.getY() + 1)) {
              return true;
            }
          }

          //This check ensures that the pawn is not being moved diagonally.
          if (end.getX() != start.getX() && end.getY() != start.getY()) {
            return false;
          }

          //This check ensures that the pawn is not begin moved sideways.
          if (end.getX() == start.getX() && end.getY() != start.getY()) {
            return false;
          }


          //This if/else block allows the pawn to move 2 spaces forward if it has not moved yet,
          // or only one space forward if it has.
          if (!thisPawn.getHasMoved()) {                 //If the pawn has not moved yet
            if (end.getX() >= start.getX() - 2 && end.getX() < start.getX()) {
              return true;
            } else {
              return false;
            }
          } else {                                       //If the pawn has moved
            if (end.getX() >= start.getX() - 1 && end.getX() < start.getX()) {
              return true;
            } else {
              return false;
            }
          }
        }

        case BLACK: {
          //System.out.println("IT'S BLACK");
          //The two checks below, check to see if the pawn is being moved diagonally to capture a
          // piece
          if (possibleCapture[0]) {         //Capture on board left
            if ((end.getX() == start.getX() + 1) && (end.getY() == start.getY() - 1)) {
              return true;
            }
          }
          if (possibleCapture[1]) {         //Capture on board right
            if ((end.getX() == start.getX() + 1) && (end.getY() == start.getY() + 1)) {
              return true;
            }
          }

          //This check ensures that the pawn is not being moved diagonally.
          if (end.getX() != start.getX() && end.getY() != start.getY()) {
            //System.out.println("TRYING TO MOVE DIAGONALLY");
            return false;
          }

          //This check ensures that the pawn is not being moved sideways.
          if (end.getX() == start.getX() && end.getY() != start.getY()) {
            //System.out.println("TRYING TO MOVE SIDEWAYS");
            return false;
          }

          //This if/else block allows the pawn to move 2 spaces forward if it has not moved yet,
          // or only one space forward if it has.
          if (!thisPawn.getHasMoved()) {      //If the pawn has not moved yet
            //System.out.println("BLACK HAS NOT MOVED");
            if (end.getX() <= start.getX() + 2 && end.getX() > start.getX()) {
              return true;
            } else {
              return false;
            }
          } else {                            //If the pawn has moved
            //System.out.println("BLACK HAS MOVED");
            if ((end.getX() <= (start.getX() + 1)) && (end.getX() > start.getX())) {
              return true;
            } else {
              return false;
            }
          }
        }
        default: {
          return false;
        }
      }
  }

  private boolean isPawnMoveBlocked(Position start, Position end) {
    boolean blockedFlag = false;
    if (start.getX() > end.getX()){
      for (int i = start.getX() - 1; i > end.getX(); i--) {
        if (Board[i][start.getY()].hasPiece()) {
          blockedFlag = true;
          break;
        }
      }
    }
    if (start.getX() < end.getX()) {
      for (int i = start.getX() + 1; i < end.getX(); i++) {
        if (Board[i][start.getY()].hasPiece()) {
          blockedFlag = true;
          break;
        }
      }
    }
    //System.out.println("blocked: " + blockedFlag);
    return blockedFlag;
  }

  private boolean[] isPossibleCapture(Pawn thisPawn) {
    Position thisPos = thisPawn.getPosition();
    boolean checkRight = true;
    boolean checkLeft = true;
    boolean rightCapture = false;
    boolean leftCapture = false;
    boolean[] outArray = new boolean[2];


    if (thisPos.getY() == 0) {
      checkLeft = false;
    }
    if (thisPos.getY() == 7) {
      checkRight = false;
    }
    switch (thisPawn.getTeam()) {
      case BLACK: {
        if (checkRight) {
          if (Board[thisPos.getX() + 1][thisPos.getY() + 1].hasPiece()) {
            IPiece rightPiece = Board[thisPos.getX() + 1][thisPos.getY() + 1].getCurrentPiece();
            if (rightPiece.getTeam() != thisPawn.getTeam()) {
              rightCapture = true;
            }
          }
        }
        if (checkLeft) {
          if (Board[thisPos.getX() + 1][thisPos.getY() - 1].hasPiece()) {
            IPiece leftPiece = Board[thisPos.getX() + 1][thisPos.getY() - 1].getCurrentPiece();
            if (leftPiece.getTeam() != thisPawn.getTeam()) {
              leftCapture = true;
            }
          }
        }
        break;
      }

      case WHITE: {
        if (checkRight) {
          if (Board[thisPos.getX() - 1][thisPos.getY() + 1].hasPiece()) {
            IPiece rightPiece = Board[thisPos.getX() - 1][thisPos.getY() + 1].getCurrentPiece();
            if (rightPiece.getTeam() != thisPawn.getTeam()) {
              rightCapture = true;
            }
          }
        }
        if (checkLeft) {
          if (Board[thisPos.getX() - 1][thisPos.getY() - 1].hasPiece()) {
            IPiece leftPiece = Board[thisPos.getX() - 1][thisPos.getY() - 1].getCurrentPiece();
            if (leftPiece.getTeam() != thisPawn.getTeam()) {
              leftCapture = true;
            }
          }
        }
        break;
      }
    }
    outArray[0] = leftCapture;
    outArray[1] = rightCapture;
    return outArray;
  }

  private boolean isValidRookMove(Position start, Position end, Rook thisRook) {

    //This allows the Rook to Castle
    //TODO: IMPLEMENT CASTLING WHEN KING MOVE HAS BEEN IMPLEMENTED

    //This check ensures that the Rook is not being moved diagonally.
    if (end.getX() != start.getX() && end.getY() != start.getY()) {
      return false;
    }

    //This allows the Rook to move Sideways
    if (end.getX() != start.getX() && end.getY() == start.getY()) {
      return true;
    }

    //This allows the Rook to move Forward and Backwards
    if (end.getY() != start.getY() && end.getX() == start.getX()) {
      return true;
    } else {
      return false;
    }
  }

  private boolean isRookMoveBlocked(Position start, Position end) {
    boolean blockedFlag = false;

    if (start.getX() != end.getX()) {        // If the Rook is moving Vertically
      if (start.getX() > end.getX()){        // If the Rook is moving Down the board
        for (int i = start.getX() - 1; i > end.getX(); i--) {
          if (Board[i][start.getY()].hasPiece()) {
            blockedFlag = true;
            break;
          }
        }
      } else if (start.getX() < end.getX()) {         // If the Rook is moving Up the board
        for (int i = start.getX() + 1; i < end.getX(); i++) {
          if (Board[i][start.getY()].hasPiece()) {
            blockedFlag = true;
            break;
          }
        }
      }
    } else if (start.getY() != end.getY()) {          //Else if the Rook is moving Horizontally
      //System.out.println("MOVING HORIZONTALLY");
      if (start.getY() > end.getY()) {                //If the Rook is moving to the Left
        //System.out.println("MOVING LEFT");
        for (int i = start.getY() - 1; i > end.getY(); i--) {
          if (Board[start.getX()][i].hasPiece()) {
            blockedFlag = true;
            break;
          }
        }
      } else if (start.getY() < end.getY()) {         //If the Rook is moving to the Right
        //System.out.println("MOVING RIGHT");
          for (int i = start.getY() + 1; i < end.getY(); i++) {
            if (Board[start.getX()][i].hasPiece()) {
              blockedFlag = true;
              break;
            }
          }
      }
    }
    return blockedFlag;
  }

  private boolean isValidKnightMove(Position start, Position end) {
    int startX = start.getX();
    int startY = start.getY();
    int endX = end.getX();
    int endY = end.getY();

    if (endX == startX + 2 && endY == startY + 1) {
      return true;
    } else if (endX == startX + 2 && endY == startY - 1) {
      return true;
    } else if (endX == startX - 2 && endY == startY + 1) {
      return true;
    } else if (endX == startX - 2 && endY == startY - 1) {
      return true;
    } else if (endX == startX + 1 && endY == startY + 2) {
      return true;
    } else if (endX == startX + 1 && endY == startY - 2) {
      return true;
    } else if (endX == startX - 1 && endY == startY + 2) {
      return true;
    } else if (endX == startX - 1 && endY == startY - 2) {
      return true;
    } else {
      return false;
    }
  }

  private boolean isValidBishopMove(Position start, Position end) {
    int startX = start.getX();
    int startY = start.getY();
    int endX = end.getX();
    int endY = end.getY();

    int xDiffAbs = Math.abs(endX - startX);
    int yDiffAbs = Math.abs(endY - startY);

    return (xDiffAbs == yDiffAbs);
  }

  private boolean isBishopMoveBlocked(Position start, Position end) {
    boolean blockedFlag = false;
    int startX = start.getX();
    int startY = start.getY();
    int endX = end.getX();
    int endY = end.getY();

    int xDiffAbs = Math.abs(endX - startX);

    if (endX > startX && endY > startY) {
      for (int i = 1; i < xDiffAbs; i ++) {
        if (Board[startX + i][startY + i].hasPiece()) {
          blockedFlag = true;
          break;
        }
      }
    } else if (endX > startX && endY < startY) {
      for (int i = 1; i < xDiffAbs; i ++) {
        if (Board[startX + i][startY - i].hasPiece()) {
          blockedFlag = true;
          break;
        }
      }
    } else if (endX < startX && endY > startY) {
      for (int i = 1; i < xDiffAbs; i ++) {
        if (Board[startX - i][startY + i].hasPiece()) {
          blockedFlag = true;
          break;
        }
      }
    } else if (endX < startX && endY < startY) {
      for (int i = 1; i < xDiffAbs; i ++) {
        if (Board[startX - i][startY - i].hasPiece()) {
          blockedFlag = true;
          break;
        }
      }
    }
    return blockedFlag;
  }

  private boolean isValidQueenMove(Position start, Position end) {

    int startX = start.getX();
    int startY = start.getY();
    int endX = end.getX();
    int endY = end.getY();

    int xDiffAbs = Math.abs(endX - startX);
    int yDiffAbs = Math.abs(endY - startY);

    //This allows the Queen to move Sideways
    if (end.getX() != start.getX() && end.getY() == start.getY()) {
      return true;
    }

    //This allows the Queen to move Forward and Backwards
    if (end.getY() != start.getY() && end.getX() == start.getX()) {
      return true;
    }

    //This allows the Queen to move Diagonally
    if (xDiffAbs == yDiffAbs) {
      return true;
    }

    //This prevents the piece from moving to a random place
    if (end.getX() != start.getX() && end.getY() != start.getY()) {
      return false;
    }
    return false;
  }

  private boolean isQueenMoveBlocked(Position start, Position end) {
    boolean blockedFlag = false;
    boolean rookStyleMoveBlock = isRookMoveBlocked(start, end);
    boolean bishopStyleMoveBlock = isBishopMoveBlocked(start, end);

    if (rookStyleMoveBlock || bishopStyleMoveBlock) {
      blockedFlag = true;
    }
    System.out.println("\nRook:" + rookStyleMoveBlock);
    System.out.println("Bish:" + bishopStyleMoveBlock);
    return blockedFlag;
  }
}
