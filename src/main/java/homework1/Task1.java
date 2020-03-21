package homework1;

public class Task1 {
    public static void main(String[] args) {
        seasonWeatherSimple("spring");
        seasonWeatherSimple("summer");
        seasonWeatherSimple("autumn");
        seasonWeatherSimple("winter");

        seasonWeatherComplex("spring");
        seasonWeatherComplex("summer");
        seasonWeatherComplex("autumn");
        seasonWeatherComplex("winter");
        seasonWeatherComplex("cool season");
    }

    public static void seasonWeatherSimple(String season) {
        if (season.equals("winter")) {
            System.out.println("It is cold");
        }
    }

    public static void seasonWeatherComplex(String season) {
        String describedWeatherWithIfStatements = weatherDescriptionIfStatements(season);
        System.out.println("if st: " + describedWeatherWithIfStatements);

        String describedWeatherWithSwitch = weatherDescriptionWithSwitch(season);
        System.out.println("switch: " + describedWeatherWithSwitch);

        System.out.println("");
    }

    public static String weatherDescriptionIfStatements(String season) {
        String res = "wrong input...";

        if ("winter".equalsIgnoreCase(season)) {
            res = "It is cold";
        } else  if ("spring".equalsIgnoreCase(season)) {
            res = "It is not that cold any more";
        } else if ("summer".equalsIgnoreCase(season)) {
            res = "It is hot!!!";
        } else if ("autumn".equalsIgnoreCase(season)) {
            res = "It is becoming colder...";
        }

        return res;
    }

    public static String weatherDescriptionWithSwitch(String season) {
        String res = "wrong input...";

        if (season == null) {
            return res;
        }

        switch (season.toLowerCase()) {
            case ("winter") :
                res = "It is cold";
                break;
            case ("spring") :
                res = "It is not that cold any more";
                break;
            case ("summer") :
                res = "It is hot!!!";
                break;
            case ("autumn") :
                res = "It is becoming colder...";
                break;
        }

        return res;
    }

}
