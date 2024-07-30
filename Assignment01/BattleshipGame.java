package Assignment01;
public class BattleshipGame {
    private boolean[][] seaGrid;
    private int size;

    public BattleshipGame(int size) {
        this.size = size;
        this.seaGrid = new boolean[size][size];
    }

    public void placeShip(int x, int y) {
        if (isValidCoordinates(x, y)) {
            seaGrid[x][y] = true;
        } else {
            System.out.println("Error: Coordinates out of bounds.");
        }
    }

    public boolean attack(int x, int y) {
        if (isValidCoordinates(x, y)) {
            return seaGrid[x][y];
        } else {
            System.out.println("Error: Coordinates out of bounds.");
            return false;
        }
    }

    private boolean isValidCoordinates(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }

    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame(5);
        game.placeShip(1, 2);
        game.placeShip(3, 4);

        System.out.println(game.attack(1, 2)); // Should print true (ship hit)
        System.out.println(game.attack(0, 0)); // Should print false (no ship)
        System.out.println(game.attack(3, 4)); // Should print true (ship hit)
        System.out.println(game.attack(5, 5)); // Should print Error message and return false
    }
}
