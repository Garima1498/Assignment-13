import java.util.*;
import java.io.*;

class Que1{
	public static void main(String args[]){
		Set<String> str=new HashSet<>();
		str.add("Garima");
		str.add("Harshita");
		System.out.print("Set1 :");
		System.out.println(str);
		Set<String> str1=new HashSet<>();
		str1.add("Heena");
		str1.add("Nidhi");
		str1.add("Garima");
		str1.add("Aarti");
		System.out.print("Set2: ");
		System.out.println(str1);
		str1.retainAll(str);
		System.out.print("common in both sets:");
		System.out.println(str1);
	}
}