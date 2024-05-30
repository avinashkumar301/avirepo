
public class Reverseword {
	public static void main(String[] args) {
		String str = "Java is a programming language";
		char[] strArr = str.toCharArray();
		for(int i=strArr.length;i>0;i--) {
			System.out.println(strArr[i]);
		}
	}

}
