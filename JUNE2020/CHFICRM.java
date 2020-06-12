import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CHFICRM {

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		outerloop: for (int j = 0; j < T; j++) {

			int N = Integer.parseInt(br.readLine());
			int arr[] = new int[N];
			String array_read = br.readLine();
			String[] a = array_read.split("\\s+");
			int numOfF = 0, numOfT = 0;
			for (int i = 0; i < N; i++) {

				arr[i] = Integer.parseInt(a[i]);
				if (arr[i] == 5) {
					numOfF++;
				} else if (arr[i] == 10) {
					if (numOfF >= 1) {
						numOfF--;
						numOfT++;
					} else {
						System.out.println("NO");
						continue outerloop;

					}
				} else if (arr[i] == 15) {
					if (numOfT >= 1) {
						numOfT--;

					} else if (numOfT == 0 && numOfF >= 2) {
						numOfF -= 2;
					} else {
						System.out.println("NO");
						continue outerloop;

					}
				}
			}
			System.out.println("YES");
		}

	}

}
