import java.util.Random;
import java.util.Scanner;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        printMessage msg = new printMessage();
        Info inf = new Info();
        Blanks bl = new Blanks();

        int Mode;
        int Turn;
        int MaxTurn = 2;

        msg.printStarting(); // To print Welcome
        msg.printModeInfo(); // To print info about modes

        do {

            msg.printModeChoosing();
            Mode = sc.nextInt();

        } while (Mode != 1 && Mode != 2);

        if (Mode == 1) { // For Singleplayer

            Singleplayer s1 = new Singleplayer();

            inf.printInst(1);
            inf.Player1 = sc.next();
            s1.P1Points=0;


            Random random = new Random();
            String randomMovie = s1.selectRandomMovie(s1.randomMovies);
            StringBuilder BlankMovie = new StringBuilder(randomMovie);

            System.out.print("\n");

                bl.setBlank(randomMovie, BlankMovie);

                System.out.println(BlankMovie);

                System.out.println("\n");

                s1.P1Points=bl.Check(randomMovie, 5, BlankMovie);
            
        }

        else if (Mode == 2) { // For Multiplayer

            Multiplayer m1 = new Multiplayer();

            inf.printInst(1);
            inf.Player1 = sc.next();
            inf.printInst(2);
            inf.Player2 = sc.next();
            m1.P1Points=0;
            m1.P2Points=0;

            System.out.print("\n");

            for (Turn = 1; Turn <= MaxTurn; Turn++) {

                if (Turn % 2 == 1)
                    System.out.println(inf.Player1 + ": ");
                else
                    System.out.println(inf.Player2 + ": ");

                char[] movieName = console.readPassword("Enter the Movie: "); // For Entering Movie Name
                String Movie = new String(movieName);
                StringBuilder BlankMovie = new StringBuilder(Movie);

                System.out.print("\n");

                bl.setBlank(Movie, BlankMovie);

                System.out.println(BlankMovie);

                System.out.println("\n");

                if (Turn % 2 == 1){
                    System.out.println(inf.Player2 + ": ");      
                    m1.P2Points=bl.Check(Movie, 5, BlankMovie);
                }
                else{
                    System.out.println(inf.Player1 + ": ");
                    m1.P1Points=bl.Check(Movie, 5, BlankMovie);

                }     

            }
                if(m1.P1Points>m1.P2Points){
                    System.out.println(inf.Player1+" wins\n");
                }
                else if(m1.P1Points<m1.P2Points){
                    System.out.println(inf.Player2+" wins\n");
                }
                else{
                    System.out.println("Draw\n");
                }
                
        }

        msg.printThankYou();        

        sc.close();
    } // PSVM ends
} // MAIN ends