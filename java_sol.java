import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t=in.nextInt();
		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			int[] a = new int[2*n];
			Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
			for(int i=0; i<2*n; ++i) {
				a[i]=in.nextInt();
				mp.put(a[i], 0);
			}
			int cnt=0, mx=0;
			for(int i=0; i<2*n; ++i) {
				if(mp.get(a[i])==0) {
					cnt++;
					mp.put(a[i], mp.get(a[i])+1);
				} else {
					cnt--;
					if(mp.get(a[i])>0)
						mp.put(a[i], mp.get(a[i])-1);
					else
						mp.put(a[i], mp.get(a[i])-1);
				}
				mx=Math.max(mx, cnt);
			}
			out.println(mx);
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
