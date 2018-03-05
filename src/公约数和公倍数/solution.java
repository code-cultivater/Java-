package 公约数和公倍数;

import java.util.Scanner;
import static java.lang.System.out;

public class solution {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n,m;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		m=scanner.nextInt();
		out.println("最大公约数"+zuiDaGongYueShu(n, m));
		out.println("最小公倍数"+zuiXiaoGongBeiShu(n, m));		
	}
	static int zuiDaGongYueShu(int n,int m){
		int maxOne=n>m?n:m;
		int minOne=n+m-maxOne;
		int tmp;
		while(maxOne%minOne!=0){
			tmp=maxOne;
			maxOne=minOne;
			minOne=tmp%maxOne;
			if (maxOne<minOne) {
				int tmp1=maxOne;
				maxOne=minOne;
				minOne=tmp;
			}
		}
		return minOne;
	}
	static int zuiXiaoGongBeiShu(int n,int m){
		return n*m/zuiDaGongYueShu(n, m);
	}

}
