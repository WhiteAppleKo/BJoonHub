public class Main {
 
	public static void main(String[] args) {
		int arr[] = new int [10001];
		
		for (int i = 0; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				arr[n] = 1; //셀프넘버가 아니면 1을 저장
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10001; i++ ) {
			if(arr[i] != 1) //1이 아닐때 = 셀프 넘버 일때
				sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
	public static int d(int number) {
		int sum = number;
		while(number != 0){
			sum = sum + (number % 10);
			number = number/10;
		}
		return sum;
	}
}