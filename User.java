interface UserInfo{
    public void printInst(int n);
}

class Info implements UserInfo{
    
    String Player1, Player2;
    
    public void printInst(int n){
        System.out.print("Enter Player"+n+" Name: ");
    }
    
}

public class User {
    public static void main(String[] args) {

    }
}
