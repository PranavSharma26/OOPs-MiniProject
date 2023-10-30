interface PrintMessages {

    
    public  void printStarting();

    public  void printModeInfo();

    public  void printModeChoosing();

    public  void printThankYou();

}

class printMessage implements PrintMessages {

    public void printStarting() {
        System.out.println("Welcome to Hangmania \n \n");
    }

    public void printModeInfo() {
        System.out.println("(Press 1 for singleplayer   ....   Press 2 for Multiplayer) \n \n");
    }

    public void printModeChoosing() {
        System.out.print("Select the Mode: ");
    }

    public void printThankYou() {
        System.out.println("-- THANK YOU FOR PLAYING --\n");
    }

}

public class Msg {
    public static void main(String[] args) {

    }
}
