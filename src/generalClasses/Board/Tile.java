package generalClasses.Board;

import generalClasses.Pieces.IPiece;
import generalClasses.Pieces.Piece;

public class Tile implements ITile {

  protected boolean isEmpty;
  private IPiece currentPiece;

  /**
   * Constructor for an empty tile
   */
  public Tile() {
    this.isEmpty = true;
    this.currentPiece = null;
  }

  /**
   * Constructor for a tile with a piece already on it
   */
  public Tile(Piece thisPiece) {
    this.isEmpty = false;
    this.currentPiece = thisPiece;
  }

  /**
   * Copy constructor for a tile
   */
  public Tile(Tile copyTile) {
    this.isEmpty = copyTile.isEmpty();
    this.currentPiece = copyTile.getCurrentPiece();
  }

  @Override
  public void addPiece(IPiece pieceToAdd) {
    if (!isEmpty) {
      throw new IllegalArgumentException("Cannot add a piece to this tile, it already has one");
    } else {
      this.currentPiece = pieceToAdd;
    }
  }

  @Override
  public void removePiece() {
    this.currentPiece = null;
    this.isEmpty = true;
  }

  @Override
  public boolean isEmpty() {
    return this.isEmpty;
  }

  public boolean hasPiece() {
    if (this.currentPiece != null) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public IPiece getCurrentPiece() {
      return this.currentPiece;
  }


}
