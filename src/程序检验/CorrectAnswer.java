package �������;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CorrectAnswer {
	 public static void main(String[] args){
	      System.out.println("������һ���ַ���");
	      Scanner scan = new Scanner(System.in);
	      String str = scan.nextLine();
	      scan.close();
	      count(str);
	    }
	    //ͳ��������ַ�
	    private static void count(String str){
	        ArrayList<String> list = new ArrayList<String>();
	        char[] array_Char = str.toCharArray();
	        for(char c:array_Char)
	          list.add(String.valueOf(c));//���ַ���Ϊ�ַ�����ӵ�list����
	        Collections.sort(list);//����
	        for(String s:list){
	            int begin = list.indexOf(s);
	            int end = list.lastIndexOf(s);
	            //��������ͳ���ַ���
	            if(list.get(end)==s)
	              System.out.println("�ַ���"+s+"����"+(end-begin+1)+"��");
	        }
	    }
}
