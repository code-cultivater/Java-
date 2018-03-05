
package 分解质因数;

import java.util.ArrayList;
import java.util.Scanner;

public class solution {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int num=Integer.parseInt(scanner.next());
		ArrayList<Integer> yinshus=new ArrayList<Integer>();
		yinshus.add(2);
		fengjie(num, yinshus);
		String printOutString=""+num+"=";
		for(int i=1;i<yinshus.size()-1;i++){
			printOutString+=(""+yinshus.get(i)+"*");
		}
		printOutString+=yinshus.get(yinshus.size()-1);
		System.out.println(printOutString);
		
		
	}
	static void fengjie(int n,ArrayList<Integer>arrayList){
		if (isZhishu(n)) {
			arrayList.add(n);
			return;
		}
		for(int i=arrayList.get(arrayList.size()-1);Math.pow(i, 2)<n+1;i++){
			if (n%i==0) {
				arrayList.add(i);
				fengjie(n/i, arrayList);
				break;
			}
		}
	}
	static boolean isZhishu(int n){
		if (n==1) {
			return false;
		}
		for(int i=2;Math.pow(i, 2)<n+1;i++){
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
}
