package ָ����Χ����������;

public class solution {
	public static boolean isSushu(int n) {
		for (int i = 2; Math.pow(i, 2.0) < n + 1; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int lowboundary = 101;
		int highboundary = 200;
		int cnt=0;
		for (int i = lowboundary; i < highboundary + 1; i++) {
			if (isSushu(i)) {
				cnt++;
			}
		}	
		System.out.println(cnt);
	}

}
