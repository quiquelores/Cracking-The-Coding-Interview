package RecursionDynamicProgramming;

public class RobotPaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Point[] offlimits = {new Point(3,3)};//, new Point(5, 1)};
		System.out.println(numPaths(2, 2, offlimits));
	}
	
	
	public static int numPaths(int x, int y, Point[] offlimits){
		int[][] paths = new int[1+x][1+y];
		paths[0][0] = 1;
		paths[1][0] = 1;
		paths[0][1] = 1;
		for(int a = 0; a <= x; a++)
			paths[a][0] = 1;
		for(int b = 0; b <= y; b++)
			paths[b][0] = 1;
		
		//for all points in off limits, set path to -1
		for(int p = 0; p < offlimits.length; p++){
			Point p1 = offlimits[p];
			if(p1.x <= x && p1.y <= y)
				paths[offlimits[p].x][offlimits[p].y] = -1;
		}
		
		for(int i = 1; i <= x; i++){
			for(int j = 1; j <= y; j++){
				if(paths[i][j] != -1){
					paths[i][j] = 0;
					if(paths[i-1][j] != -1) paths[i][j] += paths[i-1][j];
					if(paths[i][j-1] != -1) paths[i][j] += paths[i][j-1];
				}
			}
		}
		return paths[x][y];
	}

}
class Point{
	int x;
	int y;
	public Point(){
		
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
