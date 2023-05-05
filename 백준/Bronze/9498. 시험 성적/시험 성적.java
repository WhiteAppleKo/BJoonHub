import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		System.out.println((90<=A) ? "A" : ((80<=A) ? "B" : ((70<=A) ? "C" : ((60<=A) ? "D" : "F"))));
	}

}