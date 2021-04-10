//6. Viết method với đầu vào là:

//- 1 biến String là các thứ trong tuần {Monday,Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday,...}

//- 1 biến int {2,3,4,5,6,7,8,9,10,...}

//Kiểm tra xem biến int có liên kết thứ ngày trong tuần với biến String hay không?

public class ConvertNumberAndWord {
	public static boolean check(String dayOfWeek, int number) {
		switch(number) {
		case 2:
			if(dayOfWeek.compareToIgnoreCase("Monday") == 0) {
				return true;
			}
			break;
		case 3:
			if(dayOfWeek.compareToIgnoreCase("Tuesday") == 0) {
				return true;
			}
			break;
		case 4:
			if(dayOfWeek.compareToIgnoreCase("Wednesday") == 0) {
				return true;
			}
			break;
		case 5:
			if(dayOfWeek.compareToIgnoreCase("Thursday") == 0) {
				return true;
			}
			break;
		case 6:
			if(dayOfWeek.compareToIgnoreCase("Friday") == 0) {
				return true;
			}
			break;
		case 7:
			if(dayOfWeek.compareToIgnoreCase("Saturday") == 0) {
				return true;
			}
			break;
		case 8:
			if(dayOfWeek.compareToIgnoreCase("Sunday") == 0) {
				return true;
			}
			break;
		
		}
		return false;
	}
	public static void main(String[] args) {
		String dayOfWeek = "Sunday";
		int number = 8;
		System.out.println(check(dayOfWeek,number));
		

	}

}
