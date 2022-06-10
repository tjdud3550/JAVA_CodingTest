
import java.util.*;
public class Inflearn02_07 {
	public int soultion(int n, int [] arr) {
		int answer = 0, cnt = 0;
		for(int i = 0; i<n; i++) {
			if(arr[i]==1) {
				cnt++;
				answer += cnt;
				
			}
			else cnt = 0;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inflearn02_07 T = new Inflearn02_07();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print(T.soultion(n, arr));
	}

}
