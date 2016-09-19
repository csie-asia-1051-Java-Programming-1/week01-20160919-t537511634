package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;
public class hw03_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入6個數(可以小有數) :");
		float a = scn.nextInt();
		float b = scn.nextInt();
		float c = scn.nextInt();
		float d = scn.nextInt();
		float e = scn.nextInt();
		float f = scn.nextInt();
		float g = Math.min(a, b);
		float h = Math.min(b, g);
		float i = Math.min(c, h);
		float j = Math.min(d, i);
		float k = Math.min(e, j);
		float l = Math.min(f, k);
		System.out.println("每一個值都取四捨五入後輸出這 6 個數中的最小值為:"+ l);
	}

}
