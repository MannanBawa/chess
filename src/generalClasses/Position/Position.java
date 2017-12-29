package generalClasses.Position;

public class Position implements IPosition {
  private final int x;
  private final int y;

  /**
   * Constructor for Position.
   *
   * @param x X coordinate of position.
   * @param y Y coordinate of position.
   */
  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Copy Constructor for Position.
   */
  public Position(Position p) {
    this.x = p.getX();
    this.y = p.getY();
  }

  @Override
  public int getX() {
    return x;
  }

  @Override
  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "(" + String.valueOf(this.x) + "," + String.valueOf(this.y) + ")";
  }
}
