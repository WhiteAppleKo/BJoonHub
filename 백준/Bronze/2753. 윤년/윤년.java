import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		System.out.println((Y%100==0) ? ((Y%400==0) ? 1 : 0) : ((Y%4==0) ? 1 : 0));
	}

}