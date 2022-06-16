import java.util.*;



public class test01 {
	
	public ArrayList<Integer> solution(int n, int []arr) {
		
		int max = 0, cnt = 0;
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 1; i <=n; i++) {
			max = 0;
			for(int j = i+1; j<=n-1; j++) {
			if(arr[i]<arr[i+1]) {
				cnt ++;
				max = arr[i];
				
			}
			}
			answer.add(cnt);
		}
		
			return answer;
		
	}

	public static void main(String[] args) {
		test01 T = new test01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n+1]	;
		for (int i = 1 ; i<=n; i++) {
			arr[i] = sc.nextInt(); //점수 입력하기
			
		}
		
		
		System.out.print(T.solution(n, arr));
	}

}
