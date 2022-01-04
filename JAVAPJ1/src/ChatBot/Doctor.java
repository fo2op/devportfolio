package ChatBot;

//import class bufferedReader from package java.io
import java.io.*;

public class Doctor {
	
	/**
	 * What brings you in today? Why are you here?
		What hurts? The part of your body.
		What are your symptoms? Describe the problem.
		How long has this been going on? ...
		Has the pain been getting better or worse? ...
		Do you smoke? ...
		Do you have a family history of this? ...
		Do you take any medicines or supplements?
		What health concerns do you have? ...
		What are you most worried could be wrong? ...
		What's life been like for you during the pandemic? ...
		How did you and your partner meet? ...
		Can you tell me more?
		"What medications do you take?"
		"What other medications do you take?" ... 
		"What else?" ... "What else?!" ...
		"What medications are you supposed to be taking, but aren't?" ... 
		"What else?" ... "What else?!" ...
	 */
	
	/*bufferedreader vs scanner
	 * import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;
	public class JavaTester {
   		public static void main(String args[]) throws NumberFormatException, IOException {
      BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an number:");
      int a = Integer.parseInt(bufferReader.readLine());
      System.out.printf("You entered: " + a);
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nEnter an number:");
      a = scanner.nextInt();
      System.out.printf("You entered: " + a);
   }
}*/
	 

	
	
	public static void main(String[] args)throws Exception {
		//patient Name.
		String patName="";
		
	
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: "+ "\r\n-->");
		patName=br.readLine();
		System.out.println("Welcome "+ patName);
		
		

	}

}
