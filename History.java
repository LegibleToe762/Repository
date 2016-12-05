import java.util.Scanner;

public class History{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		String familyAllowances = "Family Allowances";
		String NHS = "NHS introduces free health care";
		String thePill = "The Pill is dispensed";
		String acts = "Abortion Act and Family Planning Act";
		String divorceReform = "Divorce Reform Act";
		String acts2 = "Matrimonial Property Act and Equal Pay Act";
		String sexDiscrimination = "Sex Discrimination Act";
		
		
		boolean keepGoing = false;
		
		while(keepGoing != true){
			
			int value = (int) (Math.random() * 7);
			
			if(value == 0){
				
				System.out.println(familyAllowances);
				
				int input = userInput.nextInt();
				
				if(input == 1945){
					
					System.out.println("Correct!\n");
					
				}else{System.out.println("Incorrect\n");}
			}
			
			if(value == 1){
				
				System.out.println(NHS);
				
				int input = userInput.nextInt();
				
				if(input == 1948){
					
					System.out.println("Correct!\n");
					
				}else{System.out.println("Incorrect\n");}
			}
			
			if(value == 2){
				
				System.out.println(thePill);
				
				int input = userInput.nextInt();
				
				if(input == 1962){
					
					System.out.println("Correct!\n");
					
				}else{System.out.println("Incorrect\n");}
			}
			
			if(value == 3){
				
				System.out.println(acts);
				
				int input = userInput.nextInt();
				
				if(input == 1967){
					
					System.out.println("Correct!\n");
					
				}else{System.out.println("Incorrect\n");}
			}
			
			if(value == 4){
				
				System.out.println(divorceReform);
				
				int input = userInput.nextInt();
				
				if(input == 1969){
					
					System.out.println("Correct!\n");
					
				}else{System.out.println("Incorrect\n");}
			}
			
			if(value == 5){
				
				System.out.println(acts2);
				
				int input = userInput.nextInt();
				
				if(input == 1970){
					
					System.out.println("Correct!\n");
					
				}else{System.out.println("Incorrect\n");}
			}
			
			if(value == 6){
				
				System.out.println(sexDiscrimination);
				
				int input = userInput.nextInt();
				
				if(input == 1975){
					
					System.out.println("Correct!\n");
					
				}else{System.out.println("Incorrect\n");}
			}
		}
	}
}
