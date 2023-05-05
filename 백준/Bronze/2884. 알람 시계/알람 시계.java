import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if(H == 0 && M < 45)
			H = 24;
		M = M + (H * 60) - 45;
		H = M / 60;
		M = M % 60;
		System.out.println(H+" "+M);
	}

}