package practiced;

import java.util.*;

public class Assi3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of vertices : ");
		int v = sc.nextInt();
		int mat[][] = new int[v][v];
		System.out.println("Enter the elel=ments of matrix :");
		for(int i=0; i<v; i++) {
			for(int j=0; j<v; j++) {
				System.out.println("matrix"+"["+i+1+"]"+"["+j+1+"]:");
				mat[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Initial matrix : ");
		for(int i=0; i<v; i++) {
			System.out.println();
			for(int j=0; j<v; j++) {
				System.out.print(mat[i][j]+" ");
				
			}
		}
		System.out.println();
		mat = FloydWarshelAlgo(mat,v);
		
		System.out.println("Final matrix : ");
		for(int i=0; i<v; i++) {
			System.out.println();
			for(int j=0; j<v; j++) {
				System.out.print(mat[i][j]+" ");
				
			}
		}
	}

	private static int[][] FloydWarshelAlgo(int[][] mat, int v) {
		for(int k=0; k<v; k++) {
			for(int i=0; i<v; i++) {
				for(int j=0; j<v; j++) {
					if(mat[i][j]>mat[i][k]+mat[k][j]) {
						mat[i][j]=mat[i][k]+mat[k][j];
					}
				}
			}
		}
		
		return mat;
	}
}
