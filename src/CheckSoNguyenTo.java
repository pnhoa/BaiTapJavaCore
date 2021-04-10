
// 1.Viết method để kiểm tra 1 số có phải là số nguyên tố hay không.
public class CheckSoNguyenTo {
	public static boolean check(int a) {
		if(a < 2) {
			return false;
		}
		else
		{
			for(int i = 2; i <= Math.sqrt(a); i++) {
				if(a % i == 0) {
					return false;
					
				}
			}
			return true;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(check(13));

	}

}
