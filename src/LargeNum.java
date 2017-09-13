/**
 * 
 */
import java.util.Scanner;
/**
 * @author scannella
 *
 */
public class LargeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("Enter your 2 numbers");
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int sum = add(a, b);
		
		System.out.println(sum);
	}
	
	public static int add(int a, int b) {
		int sum = 1;
		int aLength = digits(a);
		int bLength = digits(b);
		int[] aArray = new int[aLength];
		int[] bArray = new int[bLength];
		
		for(int i = aLength; i > 0; i--) {
			aArray[i]
		}
		
		
		return sum;
	}
	
	public static int digits(int num) {
		int digits = 0;
		while (num >= 1) {
			num /= 10;
			digits++;
		}
		
		return digits;
	}
	
}
