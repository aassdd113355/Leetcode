import java.util.Arrays;

public class BattleshipsInABoard {
	public static void main(String[] args) {
		int x;
		char[][] a= {	{'x','.','.','x'},
						{'.','.','.','x'},
						{'.','.','.','x'},
		};
		x = countBattleships(a);
		System.out.println(x);
	}

	public static int countBattleships(char[][] board){
		int count = 0;
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				if(i>0 && j>0){
				if(board[i][j] == 'x'){
					if(board[i-1][j] == 'x' || board[i][j-1] == 'x') continue;
					count++;
				}
				}else if(i==0 && j!=0){
					if(board[i][j] == 'x'){
						if(board[i][j-1] == 'x') continue;
						count++;
					}
				}else if(j==0 && i!=0){
					if(board[i][j] == 'x'){
						if(board[i-1][j] == 'x') continue;
						 count++;
				}
				}	else{
					if(board[i][j] == 'x'){
						count++;
					}
					}
				
			}
		}
		return count;
	}
	
}


//利用深度优先来遍历整个图中的连通图块
// public class Solution {
//    
//    static int[] dx = {0, 1, 0, -1};
//    static int[] dy = {1, 0, -1, 0};
//    //将每个连通域中的标志都变为true,方向为上下左右四个方向
//    void DFS(int x, int y, int n, int m, char[][] board, boolean[][] vis) {
//        vis[x][y] = true;
//        for (int i = 0; i < 4; i ++) {
//            int xx = x + dx[i];
//            int yy = y + dy[i];
//            if (xx >= 0 && yy >= 0 && xx < n && yy < m && board[xx][yy] == 'X' && !vis[xx][yy]) {
//                DFS(xx, yy, n, m, board, vis);
//            }
//        }
//    }
//    
//    public int countBattleships(char[][] board) {
//        int n = board.length;
//        if (n == 0) {
//            return 0;
//        }
//        int m = board[0].length;					
//        int cnt = 0;
//        boolean[][] vis = new boolean[n][m]; //创建一个访问标志矩阵
//        for (int i = 0; i < n; i ++) {
//            for (int j = 0; j < m; j ++) {
//                if (board[i][j] == 'X' && !vis[i][j]) {
//                    DFS(i, j, n, m, board, vis);
//                    cnt ++;
//                }
//            }
//        }
//        return cnt;
//    }
//}
