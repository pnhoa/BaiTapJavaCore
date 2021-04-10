//5. Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n.
public class ListSoNguyenTo1 {
	public static boolean check(int a) {
		if (a < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		int i = 2;
		while (i < 10) {
			if (check(i) == true) {
				System.out.print(i + "\t");
			}
			i++;
		}

	}
}
