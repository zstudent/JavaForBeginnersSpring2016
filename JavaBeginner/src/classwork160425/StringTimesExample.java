package classwork160425;

public class StringTimesExample {

	public static void main(String[] args) {

		System.out.println(stringTimes(null, 3));

	}

	public static String stringTimes(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str;
		}
		return result;
	}

}
