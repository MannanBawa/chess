package generalClasses.Board;


/**
 * A board consists of 64 Tiles
 */
public interface IBoard {


  /**
   * Populates the board with a standard chess setup
   */
  void setupChessBoard();

  /**
   * Clears/Empties the current board of all pieces
   */
  void clearBoard();

  /**
   * Prints the current board to the console.
   */
  String printBoard();
}
