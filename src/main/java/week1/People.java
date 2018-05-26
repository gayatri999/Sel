package week1;

public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]marks= {93,24,55,67,89,13,17,66,78,81};
		//int i=0;
		for(int subject:marks)
	{
			if(subject >= 35)
			{
				System.out.println("subject passed");
			}
			else
			{
				System.out.println("Subject failed");
			}
			//i++;
	}

	
	}

}
