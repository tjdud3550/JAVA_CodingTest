import java.util.*;


public class Inflearn02_02 {
	public int solution(int n, int[] arr) {
		int answer = 1; //����� �� ó�� ������ �����ϴϱ�
		int max =arr[0];
		for(int i = 1; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max = arr[i];
			}
		}
		
		return answer; //�� ��ȯ 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn02_02 T = new Inflearn02_02();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			
		}
		
		System.out.print(T.solution(n,arr));
	}

}
