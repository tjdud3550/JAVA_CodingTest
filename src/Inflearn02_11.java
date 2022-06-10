import java.util.*;
public class Inflearn02_11 {
	public int solution(int n, int [][] arr) {
		int answer = 0,max = 0;
		for(int i=1; i<=n; i++){
			int cnt=0;
			for(int j=1; j<=n; j++){
				for(int k=1; k<=5; k++){
					if(arr[i][k]==arr[j][k]){
						cnt++;
						break;
					}
				}
			}
			if(cnt>max){
				max=cnt;
				answer=i;
			}
		}
		return answer;
	}
	

	public static void main(String[] args) {
		Inflearn02_11 T = new Inflearn02_11();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [][] arr = new int[n+1][6];		
		for(int i=0; i<n; i++) { //명수
			for(int j = 1; j<=5; j++) { //명수 
				arr[i][j] = scanner.nextInt();
			}
			
		}
		
		
		
		System.out.println(T.solution(n,arr));
	}

}
