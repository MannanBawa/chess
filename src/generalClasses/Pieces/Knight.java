package generalClasses.Pieces;

import generalClasses.Enums.PieceType;
import generalClasses.Position.Position;
import generalClasses.Enums.Team;

public class Knight extends Piece {

  public Knight(Position position, Team team) {
    super(PieceType.KNIGHT, position, team);
  }

  @Override
  public void movePiece(Position destination) {

  }

  @Override
  public String toString() {
    if (this.team == Team.WHITE) {
      return "♘";
    } else {
      return "♞";
    }
  }

}
