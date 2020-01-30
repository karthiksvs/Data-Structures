package Shortestpath;
import java.util.*;
import java.io.*;
import java.util.PriorityQueue;
 
public class tprog {
 
	static int inf = 1000000;
 
	public static void main(String[] args) throws Exception {
 
		Scan scn = new Scan();
		Print printer = new Print();
 
		int n = scn.scanInt();
		int m = scn.scanInt();
 
		HashMap<String, Integer> idxMap = new HashMap<>();
 
		for (int i = 0; i < n; i++) {
			String str = scn.scanString();
			idxMap.put(str, i);
		}
 
		int[][] graph = new int[n][n];
 
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph.length; j++) {
				graph[i][j] = inf;
			}
		}
 
		for (int i = 0; i < m; i++) {
			String src = scn.scanString();
			String dest = scn.scanString();
			int dist = scn.scanInt();
 
			int si = idxMap.get(src);
			int di = idxMap.get(dest);
 
			graph[si][di] = dist;
			graph[di][si] = dist;
		}
 
		floydWarshall(graph);
 
		int q = scn.scanInt();
		while (q-- > 0) {
			String src = scn.scanString();
			String dest = scn.scanString();
			int si = idxMap.get(src);
			int di = idxMap.get(dest);
 
			printer.printLine(graph[si][di] + "");
		}
 
		printer.close();
 
	}
 
	public static void floydWarshall(int[][] graph) {
		int n = graph.length;
 
		for (int k = 0; k < n; k++) {
 
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
 
					if (graph[i][k] + graph[k][j] < graph[i][j])
						graph[i][j] = graph[i][k] + graph[k][j];
				}
			}
		}
 
	}
 
	public static int[] dijkstras(ArrayList<Node>[] graph, int vtx) {
 
		int[] dfv = new int[graph.length];
		Arrays.fill(dfv, Integer.MAX_VALUE);
		dfv[vtx] = 0;
		PriorityQueue<Node> pq = new PriorityQueue<>();
 
		pq.add(new Node(vtx, 0));
 
		while (!pq.isEmpty()) {
 
			Node rm = pq.remove();
 
			ArrayList<Node> nbrs = graph[rm.id];
 
			for (Node nbr : nbrs) {
 
				int oc = dfv[nbr.id];
				int nc = nbr.dist + dfv[rm.id];
 
				if (nc < oc) {
					dfv[nbr.id] = nc;
					pq.add(new Node(nbr.id, nc));
				}
			}
		}
 
		return dfv;
	}
 
	public static class Node implements Comparable<Node> {
		int id;
		int dist;
 
		public Node(int id, int dist) {
			this.id = id;
			this.dist = dist;
		}
 
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.dist - o.dist;
		}
	}
 
	static class Scan {
		private InputStream in;
		private byte[] buf = new byte[1024 * 1024];
		private int index;
		private int total;
 
		public Scan() {
			in = System.in;
			// try {
			// in = new FileInputStream(new File("/home/ujjwal/test/test"));
			// } catch (Exception ex) {
			//
			// }
		}
 
		public int scan() throws IOException {
			if (total < 0)
				throw new InputMismatchException();
			if (index >= total) {
				index = 0;
				total = in.read(buf);
				if (total <= 0)
					return -1;
			}
			return buf[index++];
		}
 
		public int scanInt() throws IOException {
			int integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}
 
		public long scanLong() throws IOException {
			long integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}
 
		public double scanDouble() throws IOException {
			double doub = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doub *= 10;
					doub += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doub += (n - '0') * temp;
						n = scan();
					} else
						throw new InputMismatchException();
				}
			}
			return doub * neg;
		}
 
		public String scanString() throws IOException {
			StringBuilder sb = new StringBuilder();
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			while (!isWhiteSpace(n)) {
				sb.append((char) n);
				n = scan();
			}
			return sb.toString();
		}
 
		private boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}
	}
 
	static class Print {
		private final BufferedWriter bw;
 
		public Print() {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}
 
		public void print(String str) throws IOException {
			bw.append(str);
		}
 
		public void printLine(String str) throws IOException {
			print(str);
			bw.append("\n");
		}
 
		public void close() throws IOException {
			bw.close();
		}
	}
 
}