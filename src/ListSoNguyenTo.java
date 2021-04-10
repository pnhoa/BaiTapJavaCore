//4. Liệt kê n số nguyên tố đầu tiên trong Java
public class ListSoNguyenTo {
	public static boolean  check(int a) {
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
		int n = 5;
		int count = 1;
		int i = 2; 
		while(count <= n) {
			if(check(i) == true) {
				count++;
				System.out.print(i + "\t");
			}
			i++;
		}

	}

}
