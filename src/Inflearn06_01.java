import java.util.*;
public class Inflearn06_01 {
	public int[] solution(int n, int[]arr){
		for(int i=0; i<n-1; i++){
			int idx=i;
			for(int j=i+1; j<n; j++){
				if(arr[j]<arr[idx]) idx=j;
			}
			int tmp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=tmp;
		}
		return arr;
	}

	public static void main(String[] args) {
		Inflearn06_01 T = new Inflearn06_01();
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) arr[i] = sc.nextInt();
		for(int x:T.solution(n,arr)) System.out.println(x+"");
	} 

}
