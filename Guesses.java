import java.util.Scanner;

class Guess {
    Scanner sc = new Scanner(System.in);
    Multiplayer m2 = new Multiplayer();

    public int Check(String Movie, int Heart, StringBuilder BlankMovie) {

        while (Heart != 0) {
            System.out.print("Guess a Letter: ");
            String Ans = sc.next();
            String PlayerAns;

            int flag = 0;

            for (int i = 0; i < Movie.length(); i++) {
                if (Ans.charAt(0) == Movie.charAt(i)) {
                    BlankMovie.setCharAt(i, Ans.charAt( 0));
                    flag = 1;

                } else if (Ans.charAt(0) - 32 == Movie.charAt(i)) {
                    BlankMovie.setCharAt(i, Character.toUpperCase(Ans.charAt(0)));
                    flag = 1;
                }
            }
            if (flag == 1) {

                System.out.println(BlankMovie + "                       " + Heart + " Hearts left \n"); // 6 Tabs space
                PlayerAns = BlankMovie.toString();
                if (Movie.equals(PlayerAns)) {
                    int Points = m2.calculateScore(Heart);
                    System.out.println(Points + " points\n");
                    break;
                }
            }

            else {
                Heart--;
                System.out.println("WRONG!                      " + Heart + " Hearts left \n");
            }

            if (Heart == 0) {
                System.out.println(Movie);
            }
        }
        return m2.calculateScore(Heart);
    }

}

class Blanks extends Guess {

    public void setBlank(String Movie, StringBuilder BlankMovie) {
        for (int i = 0; i < Movie.length(); i++) {
            if (Movie.charAt(i) == ' ') {
                BlankMovie.setCharAt(i, ' ');
            } else
                BlankMovie.setCharAt(i, '-');

        }
    }

}

public class Guesses {
    public static void main(String[] args) {

    }
}
