package 指数计算问题;

import java.util.Scanner;

public class solution {

	
	public static int getRubit(int n){
		if(n==1||n==2){
			return 1;
		}
		else {
			return getRubit(n-1)+getRubit(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("input a number:");
		Scanner sc=new Scanner(System.in);
		int month=Integer.parseInt( sc.next());
		System.out.println(""+getRubit(month));
	
	}	

}
