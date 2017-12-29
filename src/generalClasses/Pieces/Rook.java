package generalClasses.Pieces;

import generalClasses.Enums.PieceType;
import generalClasses.Position.Position;
import generalClasses.Enums.Team;

public class Rook extends Piece {

  public Rook(Position position, Team team) {
    super(PieceType.ROOK, position, team);
  }

  @Override
  public void movePiece(Position destination) {
    this.position = destination;
    this.hasMoved = true;
  }

  @Override
  public String toString() {
    if (this.team == Team.WHITE) {
      return "♖";
    } else {
      return "♜";
    }
  }

}
