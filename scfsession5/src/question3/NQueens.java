package question3;

public class NQueens {

	int[][] chessBoard;

	/**
	 * Checks that the specified position is safe or not for placing Queen
	 * 
	 * @param boardall elements of board are initially initialized to zero
	 * @param row index of row where queen is placed
	 * @param columnindex of column where queen is placed
	 * @param dimensionOfChessBoard
	 * @return returns true if specified position is safe or false if specified position is not safe
	 */
	public boolean isSafe(int[][] board, int row, int column,
			int dimensionOfChessBoard) {
		chessBoard = board;
		
		for (int i = 0; i < row; i++) {			// check if Queen is present in same column
			if (chessBoard[i][column] == 1) {
				return false;
			}
		}
	
		for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {			// check if Queen is present in upper left diagonal
			if (chessBoard[i][j] == 1) {
				return false;
			}
		}
		
		for (int i = row, j = column; i >= 0 && j < dimensionOfChessBoard; i--, j++) {		// check if Queen is present in upper right diagonal
			if (chessBoard[i][j] == 1) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The N Queen is the problem of placing N chess queens on an N�N chess
	 * board so that no two queens attack each other.
	 * 
	 * @param board
	 *            board all elements of board are initially initialized to zero
	 * @param startRow
	 * @param dimensionOfChessBoard
	 * @return
	 */

	public boolean nQueen(int[][] board, int startRow, int dimensionOfChessBoard) {
		chessBoard = board;
		if (startRow >= dimensionOfChessBoard) {
			
			for (int i = 0; i < dimensionOfChessBoard; i++) {		// print final queen location
				for (int j = 0; j < dimensionOfChessBoard; j++) {
					System.out.print(chessBoard[i][j] + " ");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
			return true;

		}
		for (int i = 0; i < dimensionOfChessBoard; i++) {
			if (isSafe(chessBoard, startRow, i, dimensionOfChessBoard)) {
				chessBoard[startRow][i] = 1;
				if (nQueen(chessBoard, startRow + 1, dimensionOfChessBoard)) {
					return true;
				}
				chessBoard[startRow][i] = 0;
			}
		}
		return false;
	}

}
