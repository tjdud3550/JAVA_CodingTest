import java.util.*;
public class Inflearn03_04 {

	public static void main(String[] args) {
		Inflearn03_04 T = new Inflearn03_04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //N���� �� 
		int m = sc.nextInt(); //Ư�� ���� M
		int count = 0; //M�� ��찡 ��� �ִ��� ���� ���� 
		int sum = 0;
		int answer = 0, lt = 0;
		int [] arr = new int[n];
		
		for (int i = 0; i <= n; i++) {
			arr[i] = sc.nextInt(); //���� ���� 1 2 1 3 1 1 2
		}
		
		//two pointer �̿��ؼ� �� ���ϱ� (���� for��) �̯Q
		for (int rt = 0; rt < n ; rt++) {
			sum += arr[rt];
			if (sum == m) count++;
			while(sum>=m) {
				sum -= arr[lt++];
				if(sum == m) count++;
				
			}			
		}

		
		
		System.out.print(count);
		sc.close();
	}

}
