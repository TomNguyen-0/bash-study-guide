import java.util.Scanner;

public class StudyGuide {

	public static int total=1;

	public StudyGuide() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String answer,guess;
		int q=0;
		total = 1;
		do{
			answer = question(q);
			System.out.print("Guess: ");
			guess = keyboard.nextLine();
			if(correct(answer,"exit"))
				System.out.println("Quiz is over: type (exit)");
			if(correct(answer,guess)){
				System.out.println("Correct, next! :) Good Job\n");
				q++;
			}
			else if(correct(guess,"exit")){
				System.exit(0);
			}
			else{
				System.out.println("Wrong, again. :(\n");
				total--;
			}
		}while(q<total);
		keyboard.close();
	}

	public static boolean correct(String answer, String guess){
		return answer.equalsIgnoreCase(guess);
	}

	public static String question(int i){
		switch(i){
		case 0 : //9/9 question 1. checked.
			System.out.println("1. Which geographic area of the Western Hemisphere was home to the earliest advanced civilizations in the New World?");
			System.out.println("A: Mesoamerica");
			System.out.println("B: Andean Mountains of Peru");
			System.out.println("C: Mississippi River plains of North America");
			System.out.println("D: The Pacific North-West");
			total ++;
			return "A";
		case 1 : //checked
			System.out.println("2. The earliest society of Amerindians believed to have advanced to a complex state of civilization were:");
			System.out.println("A	the Cahokia");
			System.out.println("B	the Toltecs");
			System.out.println("C	the Mayans");
			System.out.println("D	the Olmecs");
			total ++;
			return "D";
		case 2: //checked
			System.out.println("3. Which of the following is true of the Mayan civilization?");
			System.out.println("A	It is one of the few civilizations with no known religious beliefs");
			System.out.println("B	Its people created an elaborate writing system");
			System.out.println("C	It was composed of city-states that remained at peace with each other for over five hundred years");
			System.out.println("D	It had a highly advanced system of compulsory education for all Maya children");
			total ++;
			return "B";
		case 3: //checked
			System.out.println("4. Spanish colonization relied on the encomienda system, which refers to");
			System.out.println("A	The tribute paid to the Spanish Crown by explorers and colonizers");
			System.out.println("B	The granting of Indian villages to conquistadors as a reward for their services");
			System.out.println("C	The importation of African slaves into the colonies");
			System.out.println("D	The development of plantation agriculture");
			total ++;
			return "B";
		case 4:
			System.out.println("5. Before Europeans arrived in the Americas, Native peoples:");
			System.out.println("A	were patrilineal in social structure");
			System.out.println("B	peacefully coexisted with each other");
			System.out.println("C	were so widely spread across the continent that different groups rarely encountered each other");
			System.out.println("D	fought each other for various reasons");
			total ++;
			return "D";
		case 5:
			System.out.println("6. Which of the following was the first European Country to venture out into the Atlantic Ocean and sail down the West Coast of Africa?");
			System.out.println("A	Spain");
			System.out.println("B	Italy");
			System.out.println("C	Portugal");
			System.out.println("D	England");
			total ++;
			return "A";
		case 6: //last (7/7) question from 9/9 //checked
			System.out.println("7. How many voyages to the New World did Columbus make?");
			System.out.println("A. 1");
			System.out.println("B. 2");
			System.out.println("C. 3");
			System.out.println("D. 4");
			total ++;
			return "D";
		case 7: // 9/14 question 1
			System.out.println(i+1 + ". Which of the following had the largest fleet of ships and sailors in the world, more than the combined numbers of the other 3 combined? " );
			System.out.println("A	New Spain");
			System.out.println("B	New France");
			System.out.println("C	New Netherlands");
			System.out.println("D	New England");
			total ++;
			return "C";
		case 8: //last (2/2) questions from 9/14
			System.out.println(i+1 + ". "+"Which of the following New World nations had the most tolerant co-existence with Native-American tribes?");
			System.out.println("A	New Spain");
			System.out.println("B	New France");
			System.out.println("C	New Netherlands");
			System.out.println("D	New England");
			total ++;
			return "B";
		case 9:
			System.out.println(i+1 + ". "+"Which of the following Themes in History do you think best contextualizes English colonization of the New World in the 17th century?");
			System.out.println("A	The Big Cs - conquest, colonization, conversion, commerce");
			System.out.println("B	Geographic Determinism");
			System.out.println("C	Religion and its impact on history");
			System.out.println("D	Greed and Power - Who has it, how did they get it, what do they do with it?");
			System.out.println("E	Power of Personality");
			total ++;
			return "A"; //TODO
		case 10:
			System.out.println(i+1 + ". "+"Which of the following developments WAS NOT characteristic of the English colonies between 1640 and 1720?"
					+ "\nA	The expansion of slavery."
					+ "\nB	The expansion of religious toleration in every colony."
					+ "\nC	Escalating conflicts with Indians and other European colonies in North America."
					+ "\nD	Changes in the colonies\' political and economic relationships with England.");
			total ++;
			return "B";
		case 11:
			System.out.println(i+1 + ". "+"Which of the following WAS NOT an important result from Bacon's Rebellion of 1676 in Jamestown?"
					+"\nA	A treaty was signed in 1677 opening new lands in Virginia to English settlement."
					+"\nB	It was the first rebellion in the American colonies against an upper ruling class by common colonists"
					+"\nC	It resulted in harsher Indian policies by subsequent Governors in order to appease the colonists"
					+"\nD	Fewer Europeans wanted to move to Virginia in the wake of the bloody rebellion.");
			total ++;
			return "A";
		case 12:
			System.out.println(i+1 + ". "+"In the late seventeenth century, the economic prosperity of the Chesapeake region relied upon the cultivation of:"
					+ "\nA	sugar"+"\nB	tobacco\nC	rice\nD	indigo");
			total ++;
			return "C";
		case 13:
			System.out.println(i+1 + ". "
					+"As slavery became an integral part of the economy of South Carolina, so did:"
					+"\nA	tobacco\nB	sugar\nC	rice\nD	wheat");
			total ++;
			return "C";
		case 14: //6 questions out of six 9/23
			System.out.println(i+1 + ". "+"The creation of the Royal Dominion of New England in 1686 resulted in:");
			System.out.println("A	A peace pact between Indians and European-Americans of New England.");
			System.out.println("B	A strengthening of the trade agreements between the New England colonies.");
			System.out.println("C	The quartering of English soldiers in the homes of New Englanders.");
			System.out.println("D	The almost total loss of representative government for New England colonists.");
			total ++;
			return "B";		
		case 15: //1 question out of three 9/26
			System.out.println(i+1 + ". "+"Which of the following is credited with replacing English King James II with the monarchy of William and Mary, the first Constitutional Monarchy in history?");
			System.out.println("A	The Magna Carta");
			System.out.println("B	The War of the Roses");
			System.out.println("C	The Glorious Revolution");
			System.out.println("D	The British Commonwealth");
			total ++;
			return "C";
		case 16:
			System.out.println(i+1 + ". "+"Until his death, this explorer belived he had reached the East Indies");
			System.out.println("A Christopher Columbus");
			System.out.println("B John Cabot");
			System.out.println("C Henry Hudson");
			total ++;
			return "A";
		case 17:
			System.out.println(i+1 + ". "+"This man is actually creditedw ith bringing formal knowledge of North America to Europe.");
			System.out.println("A Christopher Columbus");
			System.out.println("B John Cabot");
			System.out.println("C Henry Hudson");
			total ++;
			return "B";
		case 18:
			System.out.println(i+1 + ". "+"This explorer sailed under the patronage of the Dutch West India Company");
			System.out.println("A Christopher Columbus");
			System.out.println("B John Cabot");
			System.out.println("C Henry Hudson");
			total ++;
			return "C";	
		case 19:
			System.out.println(i+1 + ". "+"This explorer sailed west in search of gold, spieces, and pearls");
			System.out.println("A Christopher Columbus");
			System.out.println("B John Cabot");
			System.out.println("C Sebastian Cabot");
			total ++;
			return "A";
		case 20:
			System.out.println(i+1 + ". "+"This explorer, just like his father, sailed uner English patronage in search of the Northwest Passage.");
			System.out.println("A Christopher Columbus");
			System.out.println("B John Cabot");
			System.out.println("C Sebastian Cabot");
			total ++;
			return "C";
		case 21:
			System.out.println(i+1 + ". "+"This explorer sailed under English patronage and conducted an exploration of modern Newfoundland.");
			System.out.println("A Christopher Columbus");
			System.out.println("B John Cabot");
			System.out.println("C Sebastian Cabot");
			total ++;
			return "B";	//end of activity chapter 1 section 1
		case 22: //chapter 2 section 2
			System.out.println(i+1 + ". "+"Europeans moved to establish mainland trading posts to better control the fur trade");
			System.out.println("A true");
			System.out.println("B false");
			total ++;
			return "A";
		case 23:
			System.out.println(i+1 + ". "+"Europeans became interested in teh fur trade while scouting land for permanent settlements.");
			System.out.println("A true");
			System.out.println("B false");
			total ++;
			return "B";
		case 24:
			System.out.println(i+1 + ". "+"Native Americans were painfully aware that overtrapping beavers could lead to soil erosion.");
			System.out.println("A true");
			System.out.println("B false");
			total ++;
			return "B";
		case 25:
			System.out.println(i+1 + ". "+"Some native groups served the fur trade to the detriment of their own economic independence");
			System.out.println("A true");
			System.out.println("B false");
			total ++;
			return "A";
		case 26:
			System.out.println(i+1 + ". "+"The first Englishman authorized to colonize North America was ___ who sent 118 colonists to what is now North Carolina in 1587.");
			System.out.println("A  John Cabot");
			System.out.println("B  Sir Walter Raleigh");
			System.out.println("C  Richard Hakluyt");
			total ++;
			return "B";
		case 27:
			System.out.println(i+1 + ". "+"Living among tens of thousands of native peoples, the English colonists relied on ___ to help them obtain food.");
			System.out.println("A  fur traders");
			System.out.println("B  Spanish priests");
			System.out.println("C  nearby villagers");
			total ++;
			return "C";	
		case 28:
			System.out.println(i+1 + ". "+"When resupply ships, previously delayed by England's war with Spain, finally arrived at Roanoke, there was virtually no sign of"
					+ "of the colonists, and historians now believe that ___ a might have led the settlers to abandon the colony.");
			System.out.println("A  severe drought");
			System.out.println("B  disease epidemic");
			System.out.println("C  vicious war with the Croatoans");
			total ++;
			return "A";
		case 29:
			System.out.println(i+1 + ". "+"Fish were one of the first North American natural resources to capture the attention of Europeans.");
			System.out.println("A  true");
			System.out.println("B  false");
			total ++;
			return "A";
		case 30:
			System.out.println(i+1 + ". "+"Fishermen were the first European fur traders.");
			System.out.println("A  true");
			System.out.println("B  false");
			total ++;
			return "A";	
		case 31:
			System.out.println(i+1 + ". "+"North American commerce centered around Newfoundland never matched the burgeoning economy of exchange around the"
					+ "Gulf of Mexico");
			System.out.println("A  true");
			System.out.println("B  false");
			total ++;
			return "B";
		case 32:
			System.out.println(i+1 + ". "+"Indian traders hoped to gain superiority over the Europeans with whom they were engaged.");
			System.out.println("A  true");
			System.out.println("B  false");
			total ++;
			return "B";
		case 33:
			System.out.println(i+1 + ". "+"The earliest European efforts at colony planting in North America failed, in large part, because the Europeans  _____.");
			System.out.println("A  needlessly antagonized their neighbors");
			System.out.println("B  could not adapt to a new climate");
			System.out.println("C  were more interested in making money than in building a community");
			total ++;
			return "A";	
		case 34:
			System.out.println(i+1 + ". "+"Harriot stressed that North America was _____.");
			System.out.println("A   settled by a well-armed native population");
			System.out.println("B   full of possibilities for wealth");
			System.out.println("C   a poor prospect for permanent settlement");
			total ++;
			return "B";
		case 35:
			System.out.println(i+1 + ". "+"Harriot's predictions are somewhat ironic, given that the colony he was advertising for ______.");
			System.out.println("A   contained none of the gold that settlers were promised.");
			System.out.println("B   disappeared completely.");
			System.out.println("C   was destroyed by angry indigenous people");
			total ++;
			return "B";
		case 36:
			System.out.println(i+1 + ". "+"Most of the European Traders capturing the fur trade were men.");
			System.out.println("A  true");
			System.out.println("B  false");
			total ++;
			return "A";
		case 37:
			System.out.println(i+1 + ". "+"The abundant fishing in North American waters attracted a diverse range of Europeans.");
			System.out.println("A  true");
			System.out.println("B  false");
			total ++;
			return "A";
		case 38:
			System.out.println(i+1 + ". "+"Native Americans resented European involvement in the fur trade.");
			System.out.println("A  true");
			System.out.println("B  false");
			total ++;
			return "B";
		case 39:
			System.out.println(i+1 + ". "+"Fishing was popular for Euroeans because it produced an expensive luxury commodity.");
			System.out.println("A  true");
			System.out.println("B  false");
			total ++;
			return "B";
		case 40:
			System.out.println(i+1 + ". "+"England's defeat of the Spanish Armada was the culmination of a conflict that began when ______.");
			System.out.println("A   English 'sea dogs' raided Spanish treasure fleets");
			System.out.println("B   Spanish conquistadors impressed English sailors");
			System.out.println("C   Elizabeth I executed Mary, Queen of Scots, adevout Catholic");
			total ++;
			return "A";	
		case 41:
			System.out.println(i+1 + ". "+"Conflict with Spain motivated the English to consider _______.");
			System.out.println("A   building a new war fleet on credit");
			System.out.println("B   planting colonies in the New World");
			System.out.println("C  forcibly taking over the fur trade");
			total ++;
			return "B";
		case 42:
			System.out.println(i+1 + ". "+"The first English colonial planners hoped to _______.");
			System.out.println("A   ally with other European powers to crowd the Spanish off of the continent");
			System.out.println("B   imitate the Spanish model of domination and exploitation");
			System.out.println("C   settle amicably among the Indians");
			total ++;
			return "B";	//end of chapter 1 section 2
		case 43: //chapter 1 section 3 questions 1
			System.out.println(i+1 + ". "+"Matrilineal Society");
			System.out.println("A  America");
			System.out.println("B  Europe");
			System.out.println("C  Africa");
			System.out.println("D  All of the above");
			total ++;
			return "A";
		case 44: //1-3-1
			System.out.println(i+1 + ". "+"Primarily practiced the Muslim religion");
			System.out.println("A  America");
			System.out.println("B  Europe");
			System.out.println("C  Africa");
			System.out.println("D  All of the above");
			total ++;
			return "C";
		case 45: //1-3-1
			System.out.println(i+1 + ". "+"Contained some cultures that followed an agricultural lifestyle");
			System.out.println("A  America");
			System.out.println("B  Europe");
			System.out.println("C  Africa");
			System.out.println("D  All of the above");
			total ++;
			return "D";
		case 46: //1-3-1
			System.out.println(i+1 + ". "+"Primarily practiced Christianity");
			System.out.println("A  America");
			System.out.println("B  Europe");
			System.out.println("C  Africa");
			System.out.println("D  All of the above");
			total ++;
			return "B";
		case 47: //1-3-2
			System.out.println(i+1 + ". "+"The quality of life for the native populations in each world region changed after Columbus came to America");
			System.out.println("A  True");
			System.out.println("B  False");
			total ++;
			return "A";
		case 48: //1-3-3
			System.out.println(i+1 + ". "+"Potatoes");
			System.out.println("A   American Import");
			System.out.println("B   American Export");
			total ++;
			return "B";
		case 49:  //1-3-3
			System.out.println(i+1 + ". "+"Cattle");
			System.out.println("A   American Import");
			System.out.println("B   American Export");
			total ++;
			return "A";
		case 50:  //1-3-3	
			System.out.println(i+1 + ". "+"Smallpox");
			System.out.println("A   American Import");
			System.out.println("B   American Export");
			total ++;
			return "A";
		case 51: //1-3-3
			System.out.println(i+1 + ". "+"Squash");
			System.out.println("A   American Import");
			System.out.println("B   American Export");
			total ++;
			return "B";
		case 52: //1-3-2
			System.out.println(i+1 + ". "+"The health of the native populations in each world region stayed the same after Columbus came to America.");
			System.out.println("A  True");
			System.out.println("B  False");
			total ++;
			return "B";
		case 53: //1-3-3
			System.out.println(i+1 + ". "+"Cassava");
			System.out.println("A   American Import");
			System.out.println("B   American Export");
			total ++;
			return "B";
		case 54:  //1-3-3
			System.out.println(i+1 + ". "+"Tobacco");
			System.out.println("A   American Import");
			System.out.println("B   American Export");
			total ++;
			return "B";
		case 55:  //1-3-3	
			System.out.println(i+1 + ". "+"Malaria");
			System.out.println("A   American Import");
			System.out.println("B   American Export");
			total ++;
			return "A";
		case 56: //1-3-3
			System.out.println(i+1 + ". "+"Sugar");
			System.out.println("A   American Import");
			System.out.println("B   American Export");
			total ++;
			return "A";
		case 57: //chapter 1 section 3 questions 1
			System.out.println(i+1 + ". "+"Some cultures practiced human sacrifice for religious purposes");
			System.out.println("A  America");
			System.out.println("B  Europe");
			System.out.println("C  Africa");
			System.out.println("D  All of the above");
			total ++;
			return "A";
		case 58: //1-3-1
			System.out.println(i+1 + ". "+"Lost one-third of its population to the Black Death");
			System.out.println("A  America");
			System.out.println("B  Europe");
			System.out.println("C  Africa");
			System.out.println("D  All of the above");
			total ++;
			return "B";
		case 59: //1-3-1
			System.out.println(i+1 + ". "+"Slavery accepted in custom or law");
			System.out.println("A  America");
			System.out.println("B  Europe");
			System.out.println("C  Africa");
			System.out.println("D  All of the above");
			total ++;
			return "D";
		case 60: //1-3-1
			System.out.println(i+1 + ". "+"Contained the Rice and Grain Coasts");
			System.out.println("A  America");
			System.out.println("B  Europe");
			System.out.println("C  Africa");
			System.out.println("D  All of the above");
			total++;
			return "C";
//		case :
//			System.out.println(i+1 + ". "+"");
//			System.out.println("");
//			System.out.println("");
//			System.out.println("");
//			System.out.println("");
//			total ++;
//			return "";

			
			 //missing date 9/7
		default:
			return "exit";
			//TODO missing 9/7 questions
		}
	}
}
