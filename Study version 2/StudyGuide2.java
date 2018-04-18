import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class StudyGuide2 {

	/* constant */
	private static String fileName = "";	
	private static String folderName = System.getProperty("user.dir")+"\\Files";
//	private static String folderName = "C:\\Users\\tom\\Desktop\\projects\\fun\\Study\\Study version 2\\Files";
	private static int ArraySize=100;
	private static int counter=0;
	private static Boolean answerRight=false;
	private static int answerToTheQuestion=0;
	private static String[] answers = new String[ArraySize];
	private static String[] questions = new String[ArraySize];
	private static String[] fileList = new String[ArraySize];
	private static int[] noRepeat; 
	private static int repeatCounter=0;
	private static int questionCounter=1;
	private static int randomNumber;

	public StudyGuide2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		Scanner keyboard = new Scanner (System.in);
		FileReader fileReader = null;
		boolean fileIsGood=false;
		do{


			File folder = new File(folderName);
			File[] listOfFiles = folder.listFiles();
			int f=0;	//filename counter
			String getfilename;
			System.out.println("Pick a file: ");
			for (File file : listOfFiles) {
				if (file.isFile()){
					getfilename=file.getName();
					fileList[f++]=getfilename;
					System.out.println(f + ". "+getfilename);
				}
			}


			System.out.print("Enter a file name or number: ");
			
			if(keyboard.hasNextInt()){
				fileName=fileList[keyboard.nextInt()-1];	// an array of file is stored. the input-1 because the array starts at 0.
				keyboard = new Scanner (System.in);	//If you don't do this an extra enter is placed into stdin.
			}else
				fileName = keyboard.nextLine();

			try {
				fileReader = new FileReader(folderName+"\\"+fileName);
				fileIsGood=true;	
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				fileIsGood=false;
				System.out.println("Invalid file. Try agin.\n\n\n");
				//e.printStackTrace();
			}
		}while(!fileIsGood);
		System.out.println("Picked file: "+fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		clearSpace(4);
		int questionNumber=0;
		int findnumber;
		dataReadIn(bufferedReader);
		noRepeat = new int[counter];
		do{
			
//			questions(questionNumber);
//			solutions(questionNumber);
//			guess(keyboard,questionNumber++);			
			randomQuestions();
			findnumber=findanswer();
			solutions(findnumber);
			guess(keyboard,findnumber);
			questionNumber++;
			if(!answerRight){
				questionNumber--;
				repeatCounter--;
			}
			else
				questionCounter++;
		}while(questionNumber<counter);

		keyboard.close();
	}

	public static void guess(Scanner input, int correct){
		String guess;
		int answer=0;
		clearSpace(3);
		System.out.print("Guess: ");
		guess=input.nextLine();
		Boolean getOut=false;
		do{
			if(guess.equalsIgnoreCase("a") || guess.equalsIgnoreCase("1")){
				answer=1;
				getOut=true;
			}
			else if(guess.equalsIgnoreCase("b") || guess.equalsIgnoreCase("2")){
				answer=2;
				getOut=true;
			}
			else if(guess.equalsIgnoreCase("c") || guess.equalsIgnoreCase("3")){
				answer=3;
				getOut=true;
			}
			else if(guess.equalsIgnoreCase("d") || guess.equalsIgnoreCase("4")){
				answer=4;
				getOut=true;
			}
			else{
				System.out.print("Pick either a,1,b,2,c,3,d, or 4: ");
				guess=input.nextLine();
				getOut=false;
			}
		}while(!getOut);
		if(answer==answerToTheQuestion){
			answerRight=true;
			clearSpace(20);
		}else{
			System.out.println("You got it wrong.\n");
			answerRight=false;
		}
	}

	public static void dataReadIn(BufferedReader bufferedReader){
		String line = null;

		try{

			while((line = bufferedReader.readLine()) != null){
				questions[counter] = line;
				line = bufferedReader.readLine();
				answers[counter++] = line;
			}
		}catch(FileNotFoundException ex) {
			System.out.println("error");
		}catch(IOException ex){
			System.out.println("Error2");
		} 
	}
	public static void randomQuestions(){
		Random rand = new Random(); 
		
		boolean stay =true;
		do{
			randomNumber = rand.nextInt(counter);
			if(cantRepeat(randomNumber))
				stay=false;
			else
				stay=true;
		}while(stay);
		questions(randomNumber);
	}
	public static int findanswer(){
		for(int i=0; i<repeatCounter;i++)
			if(noRepeat[i]==randomNumber)
				return noRepeat[i];
		return -1;
	}
	public static void questions(int position ){
		System.out.println(questionCounter + "/" + counter +") "+questions[position]);
	}
	public static boolean cantRepeat(int inputNumber){
		if(repeatCounter==0){
			noRepeat[repeatCounter++]=inputNumber;
			return true;
		}
		for(int i=0; i<repeatCounter;i++){
			if(noRepeat[i]==inputNumber)
				return false;
		}

		noRepeat[repeatCounter++]=inputNumber;
		return true;
	}
	public static void clearSpace(int lines){
		for(int i=0;i<lines;i++)
			System.out.println();
	}

	public static void solutions(int position){
		String[] choices =new String[4];
		Random rand = new Random(); 
		int value,diff1=counter+1,diff2=diff1,diff3=diff1,diff4=diff1;
		boolean answerIsHere=false,passTest=false;
		do{
			for(int i=0; i<4; i++){
				value = rand.nextInt(counter);
				choices[i]= answers[value];
				if(i==0)
					diff1=value;
				if(i==1){
					diff2=value;
					if(diff1==diff2)
						i--;
				}
				else if(i==2){
					diff3=value;
					if(diff3==diff1 || diff3==diff2)
						i--;
				}
				else if(i==3){	//This can be turned into a recursive. fix this for fun.
					diff4=value;
					if(diff4==diff1 || diff4==diff2 || diff4==diff3){
						passTest=false;
						i--;
					}
					else
						passTest=true;
				}
				if(value==position && !answerIsHere && passTest){
					answerToTheQuestion=i+1;
					answerIsHere=true;
				}
			}

		}while(!answerIsHere);
		//		int value = rand.nextInt(counter); //	This will give value from 0 to 49.

		//		For 1 to 50: rand.nextInt((max - min) + 1) + min; //1 to counter
		System.out.println("A. " + choices[0]);
		System.out.println("B. " + choices[1]);
		System.out.println("C. " + choices[2]);
		System.out.println("D. " + choices[3]);
	}
}