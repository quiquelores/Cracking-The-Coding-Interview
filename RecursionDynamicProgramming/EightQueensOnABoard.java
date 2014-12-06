package RecursionDynamicProgramming;

public class EightQueensOnABoard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queensOnBoard();
	}
	/*
	 * [Q][*][*][*][*][*][*][*]
	 * [*][*][*][Q][*][*][*][*]
	 * [*][Q][*][*][*][*][*][*]
	 * [*][*][*][*][Q][*][][]
	 * [*][*][Q][*][*][*][*][*]
	 * [*][*][*][*][*][*][][*]
	 * [*][*][*][][*][*][*][]
	 * [*][*][*][][][*][*][*]
	 */
	
	public static void queensOnBoard(){
		char[][] board = new char[8][8];
		queensOnABoard(board, 0, 0);
	}
	public static void queensOnABoard(char[][] board, int numOfQueens, int nextRow){
		if(numOfQueens != nextRow) System.out.println("PROBLEM");
		
		if(numOfQueens == 8 && nextRow == 8){
			//print
			System.out.println();
			for(int i = 0; i < 8; i++){
				for(int j = 0; j < 8; j++){
					if(board[j][i] == 'Q') System.out.print("Q");
					else System.out.print("-");
				}
				System.out.println();
			}
			return;
		}
		
		
		for(int i = 0; i < 8; i++){
			char[][] newboard = new char[8][8];
			for(int w = 0; w < 8; w++){
				for(int y = 0; y < 8; y++){
					newboard[w][y] = board[w][y];
				}
			}
			if(newboard[nextRow][i] != '*'){
				newboard[nextRow][i] = 'Q';
				for(int j = nextRow+1; j < 8; j++) newboard[j][i] = '*';
				int up = i;
				int down = i;
				for(int a = nextRow+1; a < 8; a++){
					if(up+1 < 8) newboard[a][++up] = '*';
					if(down -1 > 0) newboard[a][--down] = '*';
				}
				queensOnABoard(newboard, numOfQueens +1, nextRow+1);
			}
		}
	}

}
