package ˮ�ɻ���;

public class solution {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int lowboundary=100;
		int highboundqary=1000;
		int cnt=0;
		for(int i=lowboundary;i<highboundqary+1;i++){
			if (isShuixianhuashu(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	static boolean isShuixianhuashu(int n){
		String str=""+n;
		int cnt=0;
		for (int i = 0; i < str.length(); i++) {
			cnt+=Math.pow(Integer.valueOf(""+str.charAt(i)),3);
		}
		if(cnt==n){
			return true;
		}
		return false;
	}

}
