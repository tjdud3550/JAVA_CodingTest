import java.util.*;

public class Inflearn02_09 {
	
	public int[][] solution(int n, int [][] arr) {
		int answer=Integer.MIN_VALUE;
		int sum1, sum2;
		for(int i = 0; i<n;i++ ) {
			sum1=sum2=0;
			for(int j = 0; j<n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
				
			}
			answer=Math.max(answer,sum1);
			answer=Math.max(answer, sum2);
		}
		//�밢��
		sum1=sum2=0;
		for(int i = 0 ;i<n; i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
		}
		answer=Math.max(answer,sum1);
		answer=Math.max(answer, sum2);			
		return answer;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn02_09 T = new Inflearn02_09();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
			arr[i][j] = scanner.nextInt();
			}
		}
			
		System.out.print(T.solution(n, arr));
	}

}
