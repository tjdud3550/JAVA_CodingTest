import java.util.*;
public class Inflearn02_10 {
	int [] dx = {-1,0,1,0};
	int [] dy = {0,1,0,-1};
	public int solution(int n,int[][]arr) {
		int answer = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				//���� ���� Ž��
				boolean flag = true;
				for(int k =0; k<4; k++) {
					int nx = i+dx[k]; //�� ��ǥ �װ�
					int ny = j+dy[k]; //����ǥ �װ�
					//��& ��谪 ���� �߰�..
					if(nx>=0 && nx<n&& ny>=0 && ny<n&&arr[nx][ny]>=arr[i][j] ) {
						flag = false;
						break;
					}
				}
				if(flag) answer++; //answer���� ����ؾ�������..
			}
			}
		return answer;
	
	}

	public static void main(String[] args){
		Inflearn02_10 T = new Inflearn02_10();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}

