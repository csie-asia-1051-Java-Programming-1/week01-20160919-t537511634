package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a，程式 計算 a 次方並輸出 (請使用 Math.pow(a) 工具)
 * Date: 2016/09/19
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;
public class ex03_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入數字 a:");
		int a = scn.nextInt();
		System.out.println("請輸入數字 b:");
		int b = scn.nextInt();
		double c = Math.pow(a, b);
		System.out.println("a的b次方是:" + c);
	}

}
