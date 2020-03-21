package homework1;

public class Task1 {
    public static void main(String[] args) {
        seasonWeather1("spring");
        seasonWeather1("summer");
        seasonWeather1("autumn");
        seasonWeather1("winter");

        seasonWeather2("spring");
        seasonWeather2("summer");
        seasonWeather2("autumn");
        seasonWeather2("winter");
    }
    public static void seasonWeather1(String season) {
        if (season == "winter"){
            System.out.println("It is cold");
        }
    }

    public static void seasonWeather2(String season) {
        if (season == "winter"){
            System.out.println("It is cold");
        }
        else if(season == "spring"){
            System.out.println("It is not that cold any more");
        }
        else if(season == "summer"){
            System.out.println("It is hot!!!");
        }
        else if(season == "autumn"){
            System.out.println("It is becoming colder...");
        }
    }
}
