//2. Viết method để đếm số từ trong một chuỗi.(Mỗi từ cách nhau bằng dấu cách);
public class CountWords {
	public static int check(String name) {
		int count=0;
		name = name.trim();
		char[] arr = name.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ' ') {
				count++;
			}
		}
		if(count == 0) {
			return 0;
		}
		return count + 1;
	}
	public static int check1(String name) {
		int count = 0;
		String[] arr =name.split(" ");
		for(int i =0; i < arr.length; i++) {
			if(arr[i].length() > 0) {
				count++;
			}
		}
		
		return count;
	}
	public static int check2Teacher(String str) {
		int result = 0;
		str = str.trim();
		while(str.indexOf("  ") != -1) {
			str = str.replaceAll("  ", " ");
		}
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				result += 1;
			}
		}
		return result +1 ;
	}
	public static void main(String[] args) {
		String name = "  Pham Nhu Hoa  ";
		System.out.println(check(name));
		System.out.println(check1(name));
		System.out.println(check2Teacher(name));

	}

}
