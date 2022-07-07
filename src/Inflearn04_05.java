import java.util.*;

//set 중복제거 Treeset 정렬과 중복제거 가능~!

public class Inflearn04_05 {
	public int solution(int n , int k, int[]arr) {
		int answer=-1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());	
		
		//3중 for문
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				for(int l=j+1; l<n; l++){
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		
		int cnt=0;
		//Tset.remove(143);
		//System.out.println(Tset.size());
		
		for(int x : Tset){
			//System.out.println(x);
			//System.out.println("first : "+ Tset.first());
			//System.out.println("last : "+ Tset.last());

			cnt++;
			if(cnt==k) return x;
		}		

				
		
	return answer;
	
	}
	

	public static void main(String[] args) {
		Inflearn04_05 T = new Inflearn04_05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int [ ] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(T.solution(n, k, arr));

	}
}
