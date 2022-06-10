import java.util.*;
public class Inflearn02_04 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] =1;
		answer[1] = 1;
		for(int i =2 ; i <n; i++) {
			answer[i] = answer[i-2]+answer[i-1];
			
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn02_04 T = new Inflearn02_04();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int x : T.solution(n)) System.out.print(x+"");
	}

}
