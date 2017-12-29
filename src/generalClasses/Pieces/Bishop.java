package generalClasses.Pieces;

import generalClasses.Enums.PieceType;
import generalClasses.Position.Position;
import generalClasses.Enums.Team;

public class Bishop extends Piece {

  public Bishop(Position position, Team team) {
    super(PieceType.BISHOP, position, team);
  }

  @Override
  public void movePiece(Position destination) {

  }

  @Override
  public String toString() {
    if (this.team == Team.WHITE) {
      return "♗";
    } else {
      return "♝";
    }
  }

}
