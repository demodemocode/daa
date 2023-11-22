package practiced;

import java.util.*;

public class Assi6 {

	public static class Node implements Comparable<Node>{
		
		int cost;
		int level;
		int assigned[];
		boolean [] visited;
		
		Node(int cost, int level, int assigned[], boolean visited[]){
			this.cost = cost;
			this.level = level;
			this.assigned= assigned.clone();
			this.visited = visited.clone();
		}
		

		public int compareTo(Node n) {
			return this.cost - n.cost;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix :");
		int n =sc.nextInt();
		
		int mat[][] = new int[n][n];
		System.out.println("Enter the matrix :");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		int mincost = findMinCost(mat);
	}

	private static int findMinCost(int[][] mat) {
		int n= mat.length;
		int assigned[] = new int[n];
		
		boolean visited[] = new boolean[n];
		
		Arrays.fill(assigned, -1);
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(new Node(0,-1, assigned, visited));
		
		while(!pq.isEmpty()) {
			Node min = pq.poll();
			int i = min.level+1;
			
			if(i == n ) {
				printassignment(min, mat);
				return min.cost;
			}
			
			for(int j=0; j<n; j++) {
				if(!min.visited[j]) {
					int newassigned[] = min.assigned.clone();
					boolean newvisited[] = min.visited.clone();
					newassigned[i]= j;
					newvisited[j]= true;
					Node child = new Node(min.cost + mat[i][j], i, newassigned, newvisited);
					pq.add(child);
				}
			}
		}
		return -1;
	}

	private static void printassignment(Node min, int[][] mat) {
		for(int i = 0; i<min.assigned.length; i++) {
			int club = min.assigned[i];
			int cost = mat[i][club];
			System.out.println("student 1 is assined to club " + club + " with cost of "+ cost);
		}
		
	}
}


