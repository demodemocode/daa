package practiced;

import java.util.*;

import DAALAb.Job1;

public class Assi2 {

	char id;
	int deadline,profit;
	public Assi2(char id, int deadline, int profit) {
		this.id = id;
		this.deadline = deadline;
		this.profit =profit;
	}
	
	public static void jobSheduler(ArrayList<Assi2> arr, int t) {
		int n = arr.size();
		Collections.sort(arr, (a,b)->b.profit-a.profit);
		
		boolean[] result = new boolean[t];
		
		Assi2 [] sequence = new Assi2[t];
		
		for(int i=0; i<n ; i++) {
			for(int j=Math.min(t-1,  arr.get(i).deadline-1);j>=0; j--) {
				if(result[j]==false) {
					result[j]=true;
					sequence[j]= arr.get(i);
					break;
				}
			}
		}
		
		for(Assi2 j:sequence) {
			System.out.println(j.id);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Assi2> job = new ArrayList<Assi2>();
		
		job.add(new Assi2('a', 4, 100));
		job.add(new Assi2('b', 2, 19));
		job.add(new Assi2('c', 1, 27));
		job.add(new Assi2('d', 1, 25));
		job.add(new Assi2('e', 2, 15));
		
        jobSheduler(job, 3);

	}
}
