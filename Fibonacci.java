/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Praktikan
 */
import java.util.Scanner;
public class Fibonacci{
	public static void main(String[]ars){
	Scanner show = new Scanner(System.in);
	System.out.print("Input : ");
	int n = show.nextInt();
	long fib[] = new long[n];
		
	fib[0] = 0;
	fib[1] = 1;
		
	for(int i = 2; i < n; i++){
		fib[i] = fib[i-1] + fib[i-2];
	}
		
	for(int i = 0; i < n; i++){
		System.out.print(fib[i] + " ");
	}
		
	System.out.print("Terima Kasih");
}
}

