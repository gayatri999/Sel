package week3day2;

public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt ="Test leaf";
		char ch='t';
		int count=0;
		char[]charArray=txt.toCharArray();
	for(char c:charArray) //(or)//if(c=='t'||'T')
	{
		if(c==ch) {
			count++;
		}
	}
	}
}
		