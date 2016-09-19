package hw;
/*
 * Topic:假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元 (例如: n = 3 則需要 2bits)  (log(n)/log(2)
 * Date: 2016/09/19
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;
public class hw01_105021029 {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println(" 輸入一個數字n:");
		int n = scn.nextInt();
		double a =Math.ceil(Math.log(n)/Math.log(2));
		System.out.println(" 假設我們要用二進制來表示 n種狀態");
		System.out.println(" 記錄這 n種狀態需要"+ a +"位元");
		
	
		
		
	}

}
