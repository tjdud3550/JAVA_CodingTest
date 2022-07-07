import java.util.*;

public class Inflearn06_06 {
	public ArrayList<Integer>solution(int n,int [] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		int[]tmp = arr.clone();
		Arrays.sort(tmp);
		for(int i =0; i<n; i++) {
			if(arr[i]!=tmp[i]) answer.add(i+1);
		}
		
	}

	public static void main(String[] args) {
		Inflearn06_06 T = new Inflearn06_06();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x :T.solution(n, arr)) System.out.print(x+"");
		

	}

}
