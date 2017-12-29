package generalClasses.Pieces;

import generalClasses.Enums.PieceType;
import generalClasses.Position.Position;
import generalClasses.Enums.Team;

public class Pawn extends Piece {


  public Pawn(Position position, Team team) {
    super(PieceType.PAWN, position, team);
  }

  @Override
  public void movePiece(Position destination) throws IllegalArgumentException {
    this.position = destination;
    this.hasMoved = true;
  }

  @Override
  public String toString() {
    if (this.team == Team.WHITE) {
      return "♙";
    } else {
      return "♟";
    }
  }

}
