import java.util.*;

public class StonePaperScissor_Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<>();
        a.add("Stone");
        a.add("Paper");
        a.add("Scissor");

        char ch='y';

        while(ch=='y') {
            Random random = new Random();
            int randomIndex = random.nextInt(a.size());
            String randomChoice = a.get(randomIndex);

            System.out.print("Enter (1.Stone, 2.Paper, 3.Scissor): ");
            int userChoice = sc.nextInt();

            System.out.println("My choice: " + randomChoice);

            if (userChoice-1==randomIndex) {
                System.out.println("It's a Draw!");
            } else if (userChoice==2 && randomChoice.equals("Stone") || userChoice==3 && randomChoice.equals("Paper") || userChoice==1 && randomChoice.equals("Scissor")) {
                System.out.println("You win!");
            } else if (userChoice==1 && randomChoice.equals("Paper") || userChoice==2 && randomChoice.equals("Scissor") || userChoice==3 && randomChoice.equals("Stone")) {
                System.out.println("I win!");
            } else System.out.println("Invalid input!");

            System.out.println("===== Do you want to continue =====");
            System.out.print("Enter to continue (y/n): ");
            ch=sc.next().charAt(0);
        }

        sc.close();
    }
}