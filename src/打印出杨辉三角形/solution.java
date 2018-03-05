package 打印出杨辉三角形;

import java.util.ArrayList;

public class solution {
	public static void main(String[] args){
		printYanghuiSanjiao(10);
	}
	static void printYanghuiSanjiao(int n){
		ArrayList<ArrayList<Integer>> yanhuiSanjiao=new ArrayList<ArrayList<Integer>>(n);
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> arrayList=new ArrayList<Integer>(i+1);
			for (int j = 0; j < i+1; j++) {
				if (j==0||j==i) {
					arrayList.add(1);
				}
				else {
					arrayList.add(yanhuiSanjiao.get(i-1).get(j-1)+yanhuiSanjiao.get(i-1).get(j));
				}
			}
			yanhuiSanjiao.add(arrayList);
		}
		for (int i = 0; i < yanhuiSanjiao.size(); i++) {
			for (int j = 0; j < yanhuiSanjiao.get(i).size(); j++) {
				System.out.print(yanhuiSanjiao.get(i).get(j));
				if (j<yanhuiSanjiao.get(i).size()-1) {
					System.out.print('\t');
				}
			}
			System.out.print("\n");
		}
	}
}

































































