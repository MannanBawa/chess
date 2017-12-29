package generalClasses.Pieces;

import generalClasses.Enums.PieceType;
import generalClasses.Position.Position;
import generalClasses.Enums.Team;

public abstract class Piece implements IPiece {

  protected PieceType type;
  protected Position position;
  protected Team team;
  protected boolean hasMoved = false;
  protected boolean inPlay = true;


  public Piece(PieceType type, Position position, Team team) {
    this.type = type;
    this.position = position;
    this.team = team;
    this.hasMoved = false;
    this.inPlay = true;
  }

  /**
   * Copy constructor for Piece.
   */
  public Piece(Piece copyPiece) {
    this.type = copyPiece.getType();
    this.position = copyPiece.getPosition();
    this.team = copyPiece.getTeam();
    this.hasMoved = copyPiece.getHasMoved();
    this.inPlay = copyPiece.getInPlay();
  }

  @Override
  public PieceType getType() {
    return this.type;
  }

  @Override
  public Position getPosition() {
    return this.position;
  }

  @Override
  public Team getTeam() {
    return this.team;
  }

  @Override
  public boolean getHasMoved() {
    return this.hasMoved;
  }

  @Override
  public boolean getInPlay() {
    return this.inPlay;
  }


}
