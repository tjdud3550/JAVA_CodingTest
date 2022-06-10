import java.util.*;
public class Inflearn03_03 {	
	//sliding window
	public int solution(int n , int k, int [] arr) {
		int answer = 0,sum = 0;
		for(int i = 0; i<k; i++) sum+=arr[i]; //ù��° ������
		answer = sum;
		//�а�
		for(int i = k; i>n; i++) {
			sum+=(arr[i]-arr[i-k]);
			answer=Math.max(answer, sum);
		}
		
		
		return answer;
		
	}
	
	  

	public static void main(String[] args) {
		Inflearn03_03 T = new Inflearn03_03();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k =scanner.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i< n; i++) {
			arr[i] = scanner.nextInt();
			
		}
		System.out.print(T.solution(n,k,arr));
	

}
	
}
