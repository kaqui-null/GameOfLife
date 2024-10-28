package Game;

public class Board {

    // square board
    private int size; // int by number of cells
    private Cell[][] cellMesh;

    public Board(int size) {
        this.size = size;
        this.cellMesh = new Cell[size][size];
    }

    public void fillCellMesh() {
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                this.cellMesh[i][j] = new Cell(false, i, j);
            }
        }
    }

    public void returnNumOfNeighbors(Cell cell) {
        int i, j;
        int neighborsAlive = 0;
        int cellX = cell.getX();
        int cellY = cell.getY();

        for (i = -1; i <= 1; i++) {
            try {
                for (j = -1; j <= 1; j++) {
                    if (!(i == 0 && j == 0)) {
                        if (this.cellMesh[cellX + i][cellY + j].getAlive()) {
                            neighborsAlive += 1;
                        }
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                //TODO: finish exception handling in returnNumOfNeighbors
            }
        }

        cell.setNeighbors(neighborsAlive);
    }

    // special getters and setters
    public Cell getCellInMesh(int x, int y) {
        return this.cellMesh[x][y];
    }

    // getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
