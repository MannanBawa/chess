package generalClasses.Board;

import generalClasses.Pieces.IPiece;
import generalClasses.Pieces.Piece;

public interface ITile {

  /**
   * Adds the given input piece to that tile. A tile can only ever contain a single piece
   */
  void addPiece(IPiece piece);

  /**
   * Removes whatever piece is on that tile from the tile.
   */
  void removePiece();

  /**
   * Checks if the current tile has a piece on it or not
   */
  boolean isEmpty();

  /**
   * Returns the current piece that is on this tile. Returns Null if no piece is on the tile
   */
  IPiece getCurrentPiece();
}
