package week3day2;


import java.util.HashMap;
import java.util.Scanner;

public class HashMapAbc
{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String line;
        int value;
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        System.out.println("Enter a String :");
        line = sc.nextLine();
        line.length();
        System.out.println("The length of string is:" +line.length());
        for (int i1=0; i1<line.length(); i1++){
            if(map.containsKey(line.charAt(i1))){
                value = map.get(line.charAt(i1));
                value ++;
                map.put(line.charAt(i1),value);
            }else{
                map.put(line.charAt(i1),1);
            }
        }
        for ( Character key : map.keySet()){
            System.out.println("Character : '"+key+"' Count :"+map.get(key));
        }
    }
}


