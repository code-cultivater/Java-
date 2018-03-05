package 统计字符串中类型个数;

import java.util.Scanner;

public class solution {
	public static void main(String[] args){
		String sentence=new Scanner(System.in).nextLine();
		int cntForNum=0;
		int cntForAlpha=0;
		int cntForSpace=0;
		int cntForOther=0;
		for (int i = 0; i < sentence.length(); i++) {
			if (Character.isAlphabetic(sentence.charAt(i))) {
				cntForAlpha++;
			}
			else if (Character.isDigit(sentence.charAt(i))) {
				cntForNum++;
			}
			else if (Character.isWhitespace(sentence.charAt(i))) {
				cntForSpace++;
			}
			else {
				cntForOther++;
			}
		}
		System.out.println("num\talpha\tspace\tother\n"+cntForNum+'\t'+cntForAlpha+'\t'+cntForSpace+'\t'+cntForOther);
	}
}
