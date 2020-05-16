
public class TikTacToe {

	public static void printBoard(char[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}

			System.out.println();
		}
	}

	public static char findWinner(char[][] board) {

		
		if ((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && (board[0][0] != '.')) { //check for left diagonal winner
			//System.out.println("Left Diagonal Winner is........." + board[0][0]);
			return board[0][0];
		} else if ((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && (board[0][2] != '.')) { //check for right diagonal winner
			//System.out.println("RIGHT DIAGONAL WINNER IS.........." + board[0][2]);
			return board[0][2];
		} else { 

			for (int i = 0; i < board.length; i++) {

				if (board[i][0] == '.') {
					continue;
				}

				if ((board[i][0] == board[i][1]) && (board[i][0] == board[i][2])) { //check for horizontal winner
					//System.out.println(" Horizontal Winner is -----" + board[i][0]);
					return board[i][0];
				}

				if ((board[0][i] == board[1][i]) && (board[0][i] == board[2][i])) { //check for vertical winner
					//System.out.println(" Vertical Winner is -----" + board[0][i]);
					return board[0][i];
				}

			}

		}
		
		return ' ';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] board1 = { { '.', 'O', '.' }, { 'O', 'X', 'O' }, { 'O', 'X', 'X' } };
		char[][] board2 = { { 'O', 'X', 'O' }, { 'O', 'X', 'O' }, { 'O', 'X', 'X' } };
		char[][] board3 = { { 'Y', 'X', 'O' }, { 'O', 'Y', 'O' }, { 'O', 'X', 'Y' } };
		
		printBoard(board1);
		
		System.out.println("board1 -- Winner is -->" + findWinner(board1));	
		System.out.println("board2 ...winner is..." + findWinner(board2));
		System.out.println("board3 ...WINNER IS..." + findWinner(board3));


	}

}
