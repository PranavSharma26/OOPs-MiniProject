import java.util.Random;
class Player {
    int Heart = 5;
    int Score;
}

class Singleplayer extends Player{

    int P1Points;

    public int calculateScore(int Heart) {
        return Heart * 10;
    }

    public String selectRandomMovie(String[] movies) {
        Random random = new Random();
        int randomIndex = random.nextInt(movies.length);
        return movies[randomIndex];
    }

    String[] randomMovies = {
        "Dilwale Dulhania Le Jayenge", "Sholay", "Kabhi Khushi Kabhie Gham", "Lagaan", "DDLJ",
        "Kuch Kuch Hota Hai", "Dil Chahta Hai", "Golmaal", "3 Idiots", "My Name Is Khan",
        "Kaho Naa... Pyaar Hai", "Mera Naam Joker", "Zindagi Na Milegi Dobara", "Queen", "PK",
        "Dhoom", "Kabhi Alvida Naa Kehna", "Kal Ho Naa Ho", "Ae Dil Hai Mushkil", "Chennai Express",
        "Kuch Kuch Hota Hai", "Andhadhun", "Rang De Basanti", "Dil Se..", "Kabhi Khushi Kabhie Gham",
        "Chak De! India", "Wake Up Sid", "Mughal-E-Azam", "Rab Ne Bana Di Jodi", "Devdas", "Dilwale",
        "Koi Mil Gaya", "Gadar: Ek Prem Katha", "Kabir Singh", "Dil To Pagal Hai", "Raja Hindustani",
        "Don", "Karan Arjun", "Jab We Met", "Dil", "Dil To Pagal Hai", "Kabhi Khushi Kabhie Gham",
        "Tere Naam", "Kuch Kuch Hota Hai", "Mohabbatein", "Kabhi Khushi Kabhie Gham", "Sholay",
        "Kal Ho Naa Ho", "Jodhaa Akbar", "Lagaan", "Chak De! India", "Lagaan", "3 Idiots", "Lagaan", "PK",
        "Veer-Zaara", "Dilwale", "Don", "Kabhi Alvida Naa Kehna", "Chennai Express", "Ra.One", "Singham",
        "Padmaavat", "Queen", "Ae Dil Hai Mushkil", "Kabhi Khushi Kabhie Gham", "Kuch Kuch Hota Hai",
        "Chennai Express", "My Name Is Khan", "Kal Ho Naa Ho", "Zindagi Na Milegi Dobara", "Rock On!!",
        "Kabhi Alvida Naa Kehna", "Queen", "PK"
    };
    
}

class Multiplayer extends Player {
    int P1Points;
    int P2Points;

    public int calculateScore(int Heart) {
        return Heart * 10;
    }
}

public class Players {
    public static void main(String[] args) {



    }
}