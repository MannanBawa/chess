package generalClasses.Pieces;

import generalClasses.Enums.PieceType;
import generalClasses.Position.Position;
import generalClasses.Enums.Team;

public interface IPiece {

  /**
   * Moves the given Piece to the target BoardPosition, if the move is possible, if not, will
   * throw an IllegalArguementException
   * @param destination the board co-ordinates of where the piece will move
   */
  void movePiece(Position destination);

  /**
   * Returns the type of the selected Piece (i.e. Pawn, Knight, Rook, etc.)
   */
  PieceType getType();

  /**
   * Returns the current Position of the piece on the board.
   */
  Position getPosition();

  /**
   * Returns the team of the piece, black or white
   */
  Team getTeam();

  /**
   * Returns whether or not the given peice has made a move yet in the current game.
   */
  boolean getHasMoved();

  /**
   * Returns whether or not the given piece is still in play (not being in play meaning that the
   * piece has been captured/killed
   */
  boolean getInPlay();

}
