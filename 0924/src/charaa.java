import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class charaa {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] T = br.readLine().toCharArray();
		char[] P = br.readLine().toCharArray();
		
		int tLength = T.length, pLength=P.length;
		int[] fail = new int[pLength];
		
		for (int i = 1, j=0; i < pLength; i++) {
			
			while(j>0 && P[i]!=P[j])j=fail[j-1];
			
			if(P[i]==P[j]) fail[i]=++j;
		}
		
		int cnt=0;
		
//		i:텍스트포인터, j:패턴포인터
//		i는 계속 증가하는 형태
		for (int i = 0, j=0; i < tLength; i++) {
			
			while(j>0 && T[i]!=P[j]) j=fail[j-1];
			
			if(T[i]==P[j]) {
				if(j==pLength-1) { //패턴의 끝까지 일치
					cnt++;
					j=fail[j];
				}else {
					j++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
