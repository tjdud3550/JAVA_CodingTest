import java.util.*;

public class Inflearn02_06 {
	public boolean isPrime(int num) {
		if(num == 1) return false;
		for(int i = 2; i <num,; i++) {
			if(num%2 ==0) return false;
		}
		return true;
	}
	public ArrayList<Integer> solution(int n ,int[]arr){
		ArrayList<Integer> answer = new ArrayList;
		for(int i = 0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp%10;
				res =res*10+t;
				tmp = tmp/10;
				
			}
			if(isPrime(res)) answer.add(res);
		}
		return answer; //소수 배열 넣어서 출력할것
		
	}

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] =scanner.nextInt();
		}
		for(int x : T.solution(n,arr)) {
			System.out.print(x+"");
		}
		// TODO Auto-generated method stub

	}

}
