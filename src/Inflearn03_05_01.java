import java.util.Scanner;

public class Inflearn03_05_01 {
	
	public int solution(int n) {
		//cnt 연속된 자연수의 갯수
		
		int answer = 0, cnt =1;
		n--;
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0) answer++;
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		Inflearn03_05_01 T = new Inflearn03_05_01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(T.solution(n));
	}

}
