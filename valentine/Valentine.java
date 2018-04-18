/**
 *Tom Nguyen
 *
 */


import java.util.Scanner;

public class Valentine {

	public static int total=1;
	public static String name= "Trang"; // has to be characters equals to five. edit rose() if not.
	public static String name_2= "Tom";
	public static String guess;
	public static Scanner keyboard2 = new Scanner (System.in);

	public Valentine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		boolean exit = false;
		int q=0;
		total = 1;
		System.out.println(name+", would you like to be my valentines?");
		System.out.println("A: Yes");
		System.out.println("B: No");
		do{
			System.out.print("pick A or B: ");
			guess = keyboard.nextLine();
			System.out.println();
			if(correct(guess,"exit"))
				System.exit(0);
			if(correct(guess,"a")){
				yes();
				exit =true;
			}
			else if(correct(guess,"b")){
				//sad();
				no();
				System.out.println();
				exit= true;
			}
			else{
				System.out.println("Try Again");
			}
		}while(!exit);
		keyboard.close();
	}

	public static void valentineDay(){
		System.out.println(" +-+-+-+-+-+ +-+-+-+-+-+-+-+-+-+ +-+-+-+");
		System.out.println(" |H|a|p|p|y| |V|a|l|e|n|t|i|n|e| |D|A|Y|");
		System.out.println(" +-+-+-+-+-+ +-+-+-+-+-+-+-+-+-+ +-+-+-+");
	}
	
	public static void no(){
		System.out.println("awwwwwwww ,  man.");
		System.out.println("okay here is some chocolate, anyways:");
		System.out.println();
		valentineDay();
		chocolate();
	}

	public static void yes(){
		boolean leave = false;
		System.out.println("If you could pick one, what would you pick? ");
		System.out.println("A: A Rose?");
		System.out.println("B: or Two Birds?");
		do{
			System.out.print("pick: ");
			guess = keyboard2.nextLine();
			System.out.println();
			if(correct(guess,"exit"))
				System.exit(0);
			if(correct(guess,"a")){
				valentineDay();
				System.out.println();
				rose();
				System.out.println();
				System.out.println("type exit to quit"); //this one too remove it if you delete yes().
				yes(); //remove this to get out of the loop.
			//	leave=true;
			}
			if(correct(guess,"b")){
				valentineDay();
				System.out.println();
				bird();
				System.out.println();
				System.out.println("type exit to quit"); //this one too remove it if you delete yes().
				yes();
			//	leave=true;
			}
			
		}while(!leave);
		keyboard2.close();
	}

	public static void rose(){
		System.out.println("	    ..   8\"=,,88,   _.");
		System.out.println("	     8\"\"=\"\"8'  \"88a88'");
		System.out.println("	.. .;88m a8   ,8\"\" \"8");
		System.out.println("	 \"8\"'  \"88\"  A\"     8;");
		System.out.println("	   \"8,  \"8   8       \"8,");
		System.out.println("	    \"8   8,  8,       \"8");
		System.out.println("	     8,  \"8, \"8,    ___8,");
		System.out.println("	     \"8,  \"8, \"8mm\"\"\"\"\"\"8m.");
		System.out.println("	      \"8,am888i\"'   ,mm\"");
		System.out.println("	      ,8\"  _8\"  .m888\"");
		System.out.println("	     ,88P\"\"\"\"\"I888888");
		System.out.println("	     \"'         \"I888");
		System.out.println("	                  \"I8,");
		System.out.println("	                   \"I8");
		System.out.println("	                    \"I8_");
		System.out.println("	        ,mmeem.m\"\"i, I8\"\"  ,mmeem,'.");
		System.out.println("	       m\"\"    . \"8.8 I8  ,8\"   .  \"88");
		System.out.println("	      i8  . '  ,mi\"\"8I8 ,8 . '  ,8\" 88");
		System.out.println("	      88.' ,mm\"\"    \"8I88\"m,,mm'\"    8");
		System.out.println("	      \"8_m\"\"         \"I8   \"\"'");
		System.out.println("	       \"8             I8");
		System.out.println("	                      I8_");
		System.out.println("	                      I8\"\"");
		System.out.println("	                      I8");
		System.out.println("	                     _I8");
		System.out.println("	                    \"\"I8");
		System.out.println("	               "+name+"  I8  "+name_2);
	}
	
	public static void bird(){
		System.out.println("                ( \\/ )");
		System.out.println("         .---.   \\  /  .-\"-.");
		System.out.println("        /   6_6   \\/  / 4 4 \\");
		System.out.println("        \\_  (__\\      \\_ v _/");
		System.out.println("        //   \\       //   \\");
		System.out.println("       ((     ))     ((     ))");
		System.out.println("=======\"\"===\"\"========\"\"===\"\"=======");
		System.out.println("         |||            |||");
		System.out.println("          |              |");
		System.out.println("         "+name_2+"           "+name);

	}

	public static void sad(){
		System.out.println("Oh okay. Have a nice day.");
		for(int i=0; i<10; i++){
			System.out.println(" :(");
		}
		System.out.println("I hope you die!!!!");
		for(int i=0; i<10; i++){
			System.out.print(" DIE! ...");
		}
		System.out.println("\n Just Kidding\n");
		valentineDay();
	}
	
	public static void chocolate(){
		System.out.println(" ___  ___  ___  ___  ___.---------------.");
	    System.out.println(" .'\\__\\'\\__\\'\\__\\'\\__\\'\\__,`   .  ____ ___ \\");
	   	System.out.println(" |\\/ __\\/ __\\/ __\\/ __\\/ _:\\   |`.  \\  \\___ \\");
	    System.out.println(" \\\\'\\__\\'\\__\\'\\__\\'\\__\\'\\_`.__|\"\"`. \\  \\___ \\");
	    System.out.println(" \\\\/ __\\/ __\\/ __\\/ __\\/ __:                \\");
	    System.out.println(" \\\\'\\__\\'\\__\\'\\__\\ \\__\\'\\_;-----------------`");
	    System.out.println(" \\\\/   \\/   \\/   \\/   \\/ :                 |");
	    System.out.println(" \\|______________________;________________| ");
	}

	public static boolean correct(String answer, String guess){
		return answer.equalsIgnoreCase(guess);
	}

}
