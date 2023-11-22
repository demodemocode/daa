package practiced;

public class Assi4 {

	static int V = 9;
	
	public static void main(String[] args) {
		int graph[][]
	            = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
	                            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
	                            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
	                            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
	                            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
	                            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
	                            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
	                            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
	                            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
	                            
       dijkstra(graph, 0);
	}

	private static void dijkstra(int[][] graph, int src) {
		int dist[]= new int[V];
		boolean visited[]= new boolean[V];
		
		for(int i=0; i<V; i++) {
			dist[i]= Integer.MAX_VALUE;
			visited[i]=false;	
		}
		
		for(int i=0; i<V-1; i++) {
			
			dist[src]=0;
			
			int u= minDistance(dist, visited);
			
			visited[u]=true;
			
			for(int v=0; v<V; v++) {
				if(!visited[v]&& graph[u][v]!=0 && dist[u] + graph[u][v] < dist[v] && dist[u]!= Integer.MAX_VALUE  ) {
					dist[v]= dist[u]+graph[u][v];
				}
			}
		}
		
		for(int i: dist) {
			int j=0;
			System.out.println("Distance of veretex "+ j + "form verex "+src+" is : "+i);
		}
		
	}

	private static int minDistance(int[] dist, boolean[] visited) {
		int mindistance =Integer.MAX_VALUE;
		int index=-1;
		for(int i=0; i<V; i++) {
			if(!visited[i] && dist[i]<mindistance) {
				index=i;
				mindistance = dist[i];
			}
		}
		return index;
	}
}
