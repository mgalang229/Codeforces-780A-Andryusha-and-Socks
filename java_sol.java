import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int [2 * n];
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < 2 * n; i++) {
			a[i] = in.nextInt();
			mp.put(a[i], 0);
		}
		int cnt = 0;
		int mx = 0;
		for (int i = 0; i < 2 * n; i++) {
			if (mp.get(a[i]) == 0) {
				cnt++;
				mp.put(a[i], mp.get(a[i]) + 1);
			} else {
				cnt--;
				if (mp.get(a[i]) > 0) {
					mp.put(a[i], mp.get(a[i]) - 1);
				} else {
					mp.put(a[i], 0);
				}
			}
			mx = Math.max(mx, cnt);
		}
		System.out.println(mx);
	}
}
