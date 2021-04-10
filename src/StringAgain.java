//3. Viết method để kiểm tra xem 1 mảng chứa các String có phải là mảng lặp lại hay không
//(Mảng lặp lại là mảng mà trong đó tồn tại ít nhất 1 phần tự xuất hiện ít nhất 2 lần).
public class StringAgain {
	public static boolean check(String[] nameList) {
		for(int i = 0; i < nameList.length - 1; i++) {
			for(int j = i + 1;j < nameList.length; j++) {
				if(nameList[i].compareTo(nameList[j]) == 0) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String[] nameList = {"Hoa", "Binh", "Hoa", "Binh"};
		System.out.println(check(nameList));
		

	}

}
