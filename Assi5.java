package practiced;

public class Assi5 {

	static int n = 8, c=0;
	
	public static void main(String[] args) {
		solvekt();
	}

	private static boolean solvekt() {
		int a[][]=new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j]=-1;
			}
		}
		
		int xMove[]= {2,1,-1,-2,-2,-1,1,2};
		int yMove[]= {1,2,2,1,-1,-2,-2,-1};
		
		a[0][0]=0;
		
		if(!jumpnext(0,0,1,a,xMove,yMove)) {
			System.out.println("Solution dosent exist");
			return false;
		}else {
			printSolution(a);
			return true;
		}
	}

	private static boolean jumpnext(int x, int y,int jumpNo, int[][] a, int[] xMove, int[] yMove) {
		int xNext, yNext;
		if(jumpNo==n*n) return true;
		
		for(int k=0; k<n; k++) {
			xNext = x+xMove[k];
			yNext = y+yMove[k];
			
			if(canjump(xNext, yNext, a)) {
				a[xNext][yNext]=jumpNo;
				if(jumpnext(xNext, yNext, jumpNo+1, a,xMove, yMove)) { 
					return true;
				}else { 
					a[xNext][yNext]=-1;
				}
				
			}
		}
		return false;
	}

	

	private static void printSolution(int[][] a) {
		for(int i=0; i<n; i++) {
			System.out.println();
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j]+"\t");
			}
		}
	}
	
	private static boolean canjump(int x, int y, int[][] a) {
		if(x>=0 && x<n && y>=0 && y<n && a[x][y]==-1) return true;
		return false;
	}

	
}
