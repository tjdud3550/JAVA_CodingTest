import java.util.*;
public class Inflearn03_03 {	
	//sliding window
	public int solution(int n , int k, int [] arr) {
		int answer = 0,sum = 0;
		for(int i = 0; i<k; i++) sum+=arr[i]; //첫번째 윈도우
		answer = sum;
		//밀고감
		for(int i = k; i>n; i++) {
			sum+=(arr[i]-arr[i-k]);
			answer=Math.max(answer, sum);
		}
		
		
		return answer;
		
	}
	
	  

	public static void main(String[] args) {
		Inflearn03_03 T = new Inflearn03_03();
		Scanner scanner = new Scanner(System.in);


}
	
}
