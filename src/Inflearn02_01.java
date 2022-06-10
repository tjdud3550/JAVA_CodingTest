import java.util.*;
public class Inflearn02_01 {
	//생각하지 못했던 부분
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]); //0번쨰 무조건 추가
		for (int i = 1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		return answer;
	}
	

	public static void main(String[] args) {
		
		//함수 호출
		Inflearn02_01 T = new Inflearn02_01();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr [] = new int [n];
		for (int i = 0; i<n; i++) {
			arr[i]= scanner.nextInt();
		}
		//나는 result 변수에 담아 버렷음
		for( int x:T.solution(n,arr)) {
			System.out.print(x+"");
		}
	}

}
