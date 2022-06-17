import java.util.*;
public class Inflearn04_03 {
	public ArrayList<Integer> solution(int n, int k, int [] arr) {
		//답을 정수 배열로 출력
		ArrayList<Integer> answer = new ArrayList<>(); 
		
		HashMap<Integer,Integer >HM = new HashMap<>();
		for(int i = 0; i < k-1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
			
		}
		//이중 포인터 알고리즘
		int lt = 0 ;
		for(int rt=k-1; rt<n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
			if(HM.get(arr[lt])==0)
				HM.remove(arr[lt]);
				lt++;
			
		}
		
		return answer;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn04_03 T = new Inflearn04_03();
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int k = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int x: T.solution(n, k, arr)) System.out.print(x+" ");
		

	}

}
