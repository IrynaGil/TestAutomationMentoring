package homework3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Написать метод который принимает в себя 2 даты в формате
 * yyyy-MM-dd'T'HH:mm:ss и возвращает разницу между ними в секундах
 * <p>
 * took example from: https://stackoverflow.com/questions/19112357/java-simpledateformatyyyy-mm-ddthhmmssz-gives-timezone-as-ist
 */
public class StringTask5 {
    private final String format = "yyyy-MM-dd'T'HH:mm:ss";

    public long secondsBetween(String strDate1, String strDate2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        LocalDateTime dateTime1 = LocalDateTime.parse(strDate1, formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(strDate2, formatter);

        Duration duration = Duration.between(dateTime1, dateTime2);

        return duration.getSeconds();
    }
}
