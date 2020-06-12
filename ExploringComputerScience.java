import java.util.Scanner;
public class ExploringComputerScience {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// This Program helps the user to learn more how computer science is being used to solve problems on different levels

		// Welcome message
		System.out.println("Hello!! Welcome to your learning session about how computer science is being used to solve problems on different levels");
		System.out.println("Please enter your name: ");
		//User input name
		String userInputName= input.next();
		System.out.println("Ok "+ userInputName + " let's begin!" );
		System.out.println();
		
		// User choose topic
		System.out.println("Type in your topic of choice: Personal, Community, National, Global");
		String userChoice= input.next();
		
		//change to lowercase
		userChoice = userChoice.toLowerCase();
		// output appropriate info based on users choice
		if (userChoice.equals("personal")) {
			System.out.println();
			System.out.println("Here is the problem: Prescriptions and medicine not being available for each unique person.");
			System.out.println();
			System.out.println("Computer science solution: Genomics and personalized medicine (The ability to sequence DNA");
			System.out.println("provides researchers with the ability to “read” the genetic blueprint that directs all the activities");
			System.out.println("of a living organism.) are an excellent example of how computer science-driven technologies are");
			System.out.println("accelerating healthcare progress. The genome sequencing process that powers this frontier of");
			System.out.println("medicine used to cost tens of millions of dollars to complete, but machine-learning techniques");
			System.out.println("and improved computing power such as artificial intelligence could drop costs substantially.");
			System.out.println();
			System.out.println("Career fields: Healthcare, computer science, computer engineering.");
			System.out.println();
		}
		else if (userChoice.equals("community")) {
			System.out.println();
			System.out.println("Here is the problem: Those communities who are often overlooked (different ethnic groups, women, indigenous");
			System.out.println("groups, etc) do not feel empowered.");
			System.out.println();
			System.out.println("Computer science solution: Computer science can be an equalizer in other ways. Though");
			System.out.println("technology as an industry has an under-representation of women and racial minorities, computer");
			System.out.println("science can be used as a tool for societal rebalance when it comes to gender identity, background,");
			System.out.println("ethnicity and beyond. Code is code—and if you’ve created something genuinely useful, your");
			System.out.println("background isn’t going to hold you back. The App Store has the same requirements for al");
			System.out.println("developers. It is a positive step for society that computers are blind to everything but the code.");
			System.out.println();
			System.out.println("Career fields: Computer science");
			System.out.println();
		}
		
		else if (userChoice.equals("national")) {
			System.out.println();
			System.out.println("Here is the problem: In some areas of the country, catastrophes were not predicted");
			System.out.println();
			System.out.println("Computer science solution: We can predict everything from an incoming tsunami to the outbreak");
			System.out.println("pattern of a pathogen. In that way, some of the most life-saving work that happens in our world");
			System.out.println("relies on computer scientists. Computer science is even in action when predicting the trajectory");
			System.out.println("of dangerous comets near our planet.");
			System.out.println();
			System.out.println("Career fields: Computer science, meteorology, weather experts, natural disaster experts");
		}
		
		else if (userChoice.equals("global")) {
			System.out.println();
			System.out.println("Here is the problem: All around the world, in the past, families were unable to communicate");
			System.out.println();
			System.out.println("Computer science solution: Social media, video calling and chatting apps—even the applications");
			System.out.println("that allow you to share documents and photos with someone else long-distance. These capacities");
			System.out.println("have completely revolutionized the workforce.");
			System.out.println();
			System.out.println("Career fields: Computer science");
		}
		System.out.println("Would you like to explore another topic of choice?");
		String userChoice2= input.next();
		userChoice2 = userChoice2.toLowerCase();
		while (userChoice2.equals("yes")) {
			// User choose topic
			System.out.println("Type in your topic of choice: Personal, Community, National, Global");
			String userChoice3= input.next();
			//change to lowercase
			userChoice3 = userChoice3.toLowerCase();
			// if user knows about negative effects on the environment and human health output appropriate info
			if (userChoice3.equals("personal")) {
				System.out.println();
				System.out.println("Here is the problem: Prescriptions and medicine not being available for each unique person.");
				System.out.println();
				System.out.println("Computer science solution: Genomics and personalized medicine (The ability to sequence DNA");
				System.out.println("provides researchers with the ability to “read” the genetic blueprint that directs all the activities");
				System.out.println("of a living organism.) are an excellent example of how computer science-driven technologies are");
				System.out.println("accelerating healthcare progress. The genome sequencing process that powers this frontier of");
				System.out.println("medicine used to cost tens of millions of dollars to complete, but machine-learning techniques");
				System.out.println("and improved computing power such as artificial intelligence could drop costs substantially.");
				System.out.println("Career fields: Healthcare, computer science, computer engineering.");
				System.out.println();
				System.out.println();
			}
				
			else if (userChoice3.equals("community")) {
				System.out.println();
				System.out.println("Here is the problem: Those communities who are often overlooked (different ethnic groups, women, indigenous");
				System.out.println("groups, etc) do not feel empowered.");
				System.out.println();
				System.out.println("Computer science solution: Computer science can be an equalizer in other ways. Though");
				System.out.println("technology as an industry has an under-representation of women and racial minorities, computer");
				System.out.println("science can be used as a tool for societal rebalance when it comes to gender identity, background,");
				System.out.println("ethnicity and beyond. Code is code—and if you’ve created something genuinely useful, your");
				System.out.println("background isn’t going to hold you back. The App Store has the same requirements for al");
				System.out.println("developers. It is a positive step for society that computers are blind to everything but the code.");
				System.out.println();
				System.out.println("Career fields: Computer science");
				System.out.println();
			}
			else if (userChoice3.equals("national")) {
				System.out.println();
				System.out.println("Here is the problem: In some areas of the country, catastrophes were not predicted");
				System.out.println();
				System.out.println("Computer science solution: We can predict everything from an incoming tsunami to the outbreak");
				System.out.println("pattern of a pathogen. In that way, some of the most life-saving work that happens in our world");
				System.out.println("relies on computer scientists. Computer science is even in action when predicting the trajectory");
				System.out.println("of dangerous comets near our planet.");
				System.out.println();
				System.out.println("Career fields: Computer science, meteorology, weather experts, natural disaster experts");
			}

			else if (userChoice3.equals("global")) {
				System.out.println();
				System.out.println("Here is the problem: All around the world, in the past, families were unable to communicate");
				System.out.println();
				System.out.println("Computer science solution: Social media, video calling and chatting apps—even the applications");
				System.out.println("that allow you to share documents and photos with someone else long-distance. These capacities");
				System.out.println("have completely revolutionized the workforce.");
				System.out.println();
				System.out.println("Career fields: Computer science");
			}

				System.out.println("Would you like to explore another topic of choice?");
				String userChoice4= input.next();
				userChoice4 = userChoice4.toLowerCase();
				if (userChoice4.equals("yes")) {
					userChoice4=userChoice2;
				}
				if (userChoice4.equals("no")) {
					break;
				}

				
			}
			
		}
			}
	
			
		



	


		
		
	
