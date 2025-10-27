package oops;
import java.util.*;

class AgeInvalidException extends Exception {
	AgeInvalidException(String message) {
		super(message);
	}
}
class MarksInvalidException extends Exception {
	MarksInvalidException(String message) {
		super(message);
	}
}

public class ResultManegment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		int[] marks=new int[3];
		for(int i=0;i<3;i++) {
			marks[i]=sc.nextInt();
		}
		try {
			if(name==null) {
				throw new NullPointerException("Name is Missing");
		}
		}catch(NullPointerException e) {
			System.out.println("Error "+e.getMessage());	
		}
		try {
			if(age<18) {
				throw new AgeInvalidException("age must be 18 or above");
		}
		}catch(AgeInvalidException e) {
			System.out.println("Error "+e.getMessage());	
		}
		try {
			for (int mark : marks) {
				if (mark < 0 || mark > 100) {
					throw new MarksInvalidException("Marks must be between 0 and 100!");
            }
        }
		}catch(MarksInvalidException e) {
			System.out.println("Error "+e.getMessage());
		}
		
		try {
		System.out.println(marks[3]);
		throw new ArrayIndexOutOfBoundsException ("Access out of range");		
	}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error "+e.getMessage());
		}
		
		
		}
	}


		
		
		
			
	

	

