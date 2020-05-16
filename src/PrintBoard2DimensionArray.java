
public class PrintBoard2DimensionArray {

	 static char checkBoard(char[][] board) {
		
		 for(int i = 0; i < board.length; i++) {
			 for (int j = 0; j< board[i].length; j++) {
				 System.out.print(board[i][j]);
			 }
			 System.out.println();
		 }
		
		return ' ';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] currentBoard = {{'X', 'O', '.'}, {'O', 'X', '.'}, {'O', '.', 'X'}};
		
		checkBoard(currentBoard);
	}

}
