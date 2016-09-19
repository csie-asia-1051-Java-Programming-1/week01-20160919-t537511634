package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a，程式 計算 a 平方根並輸出 (請使用 Math.sqrt(a) 工具)
 * Date: 2016/09/19
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;
public class ex04_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner scn = new Scanner(System.in);
		System.out.println("請輸入數字 a:");
		int a = scn.nextInt();		
		double c = Math.sqrt(a);
		System.out.println("a的平方根是:" + c);
	}

}
