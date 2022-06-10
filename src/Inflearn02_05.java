 import java.util.*;
public class Inflearn02_05 {
	public int solution(int n) {
		int answer = 0;
		int [] array = new int[n+1];
		for(int i =2; i<= n; i++) {
			if(array[i] == 0) answer ++;
		
			for(int j = i; j <= n; j = j+i) array[j] = 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn02_05 T = new Inflearn02_05();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(T.solution(n));
	}

}
