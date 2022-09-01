package jogoNarrativa;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		String opc;
		Boolean play = true;
		
		System.out.println("PLAY TIPPING Y OR N\n");

		do {

			System.out.println("\nYou are lost in a forrest in the afternoon, choose wisely.\n");
			System.out.println("Your options are: light a fire pit and survive the night or try to climb in a tree");
			System.out.print("Do you wish to light a fire pit? ");
			opc = scan.nextLine();

			if (opc.equalsIgnoreCase("Y")) {
				System.out.println(
						"\nYou lit a fire\nMosquitoes have been attracted and you are now full of bites.");
				String opc5;
				System.out.print("\nDo you wish to climb in a tree? ");
				opc5 = scan.nextLine();

				if (opc5.equalsIgnoreCase("Y")) {
					System.out.println("\nYou've climbed in a tree\nand saw in the horizon smoke from a cottage");
					System.out.print("\nDo you wish to go to the cottage?  ");
					String opc2;
					opc2 = scan.nextLine();

					if (opc2.equalsIgnoreCase("Y")) {
						System.out.print("\nYou see wolves in your path, in the other side a river, "
								+ "do you wish to try to swim? ");
						String opc3;
						opc3 = scan.nextLine();

						if (opc3.equalsIgnoreCase("Y")) {
							System.out.println(
									"\nYou've swimmed bravely to the cottage, "
									+ "where the residents heard your screams of help and saved you!");
							System.out.println("YOU SURVIVED! CONGRATULATIONS.");

						} else {
							System.out.println("\nYou've tried to walk through the wolves, was attacked and died.");
							System.out.println("GAME OVER");

						}
					} else {
						System.out.println("You've stayed in the tree, and died.");
						System.out.println("GAME OVER");

					}

				}

				else {
					System.out.println("\nYou've stayed in the tree, and died.");
					System.out.println("GAME OVER");

				}

			}

			else {
				System.out.println("\nYou've climbed in a tree\nand saw in the horizon smoke from a cottage");
				System.out.print("\nDo you wish to go to the cottage?  ");
				String opc2;
				opc2 = scan.nextLine();
				if (opc2.equalsIgnoreCase("Y")) {
					System.out.print("\nYou see wolves in your path, in the other side a river, "
							+ "do you wish to try to swim? ");
					String opc3;
					opc3 = scan.nextLine();

					if (opc3.equalsIgnoreCase("Y")) {
						System.out.println(
								"\nYou've swimmed bravely to the cottage, "
								+ "where the residents heard your screams of help and saved you!");
						System.out.println("YOU SURVIVED! CONGRATULATIONS.");

					} else {
						System.out.println("\nYou've tried to walk through the wolves, was attacked and died.");
						System.out.println("GAME OVER");

					}

				} else {
					System.out.println(
							"\nYou've stayed in the tree without a fire pit, but wolves are rouding you"
							+ ", you need to leave!");
					System.out.print("Do you wish to go to the cottage?  ");
					String opc6;
					opc6 = scan.nextLine();

					if (opc6.equalsIgnoreCase("Y")) {
						System.out
								.print("\nYou see wolves in your path, in the other side a river, "
										+ "do you wish to try to swim? ");
						String opc7;
						opc7 = scan.nextLine();

						if (opc7.equalsIgnoreCase("Y")) {
							System.out.println(
									"\nYou've swimmed bravely to the cottage, "
									+ "where the residents heard your screams of help and saved you!");
							System.out.println("YOU SURVIVED! CONGRATULATIONS.");

						} else {
							System.out.println("\nYou've tried to walk through the wolves, was attacked and died.");
							System.out.println("GAME OVER");

						}

					} else {
						System.out.println("\nYou've stayed in the tree, and died.");
						System.out.println("GAME OVER");

					}
				}

			}

			System.out.print("\n(TYPE Y OR N) \nDo you wish to play again?:  ");
			String op;
			op = scan.nextLine();
			if (op.equalsIgnoreCase("N")) {
				play = false;
				scan.close();
				System.out.print("\nTHANK YOU FOR TESTING MY FIRST PROJECT!");
				System.exit(0);
			} else {
				play = true;
			}

		} while (play == true);

	}

}
