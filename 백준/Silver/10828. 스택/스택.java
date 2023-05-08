import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	public static int[] stack;
	public static int size = 0;

	private static void push(int number) {
		stack[size] = number;
		size++;
	}

	private static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int num = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return num;
		}
	}

	private static int empty() {
		int bool;
		if (size == 0) {
			bool = 1;
		} else
			bool = 0;
		return bool;
	}

	private static int top() {
		int num;
		if (size == 0) {
			num = -1;
		} else
			num = stack[size - 1];
		return num;
	}

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		stack = new int[N];
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String key = st.nextToken();
			switch (key) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;

			case "pop":
				System.out.println(pop());
				break;

			case "size":
				System.out.println(size);
				break;

			case "empty":
				System.out.println(empty());
				break;

			case "top":
				System.out.println(top());
				break;
			}
		}
	}
}
