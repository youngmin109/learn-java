package lec0905;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class MyFirstClass {
	public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = "Hello";

		System.out.println(str1 == str2);

		System.out.println(str1.equals(str2));
		}
	}