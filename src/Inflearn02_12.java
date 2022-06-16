import java.util.*;
public class Inflearn02_12 {
	public int solution(int n, int m, int [][]arr) {
		int answer = 0;
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				int cnt=0;
				//������ �մ��ϴ��� ���� ���� ���� 
				for(int k = 0; k <m; k++) { //test���� 
					int pi = 0,pj = 0;
					for(int s = 0; s<n; s++) {
						if(arr[k][s] == i) pi =s; //����� �־��ش�. 
						if(arr[k][s] == j )pj = s;
						
					}
					if(pi<pj) cnt++; //���� ������ ? cnt ++ 
				}
				//�Ǵ� �� ���� ��� 
				if(cnt==m) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		
		Inflearn02_12 T = new Inflearn02_12 ();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][]arr = new int[m][n];
		for (int i =0;i<m;i++) {
			for(int j =0 ; j < n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.print(T.solution(n,m,arr));
	}

}
