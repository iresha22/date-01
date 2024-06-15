import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        //oggetto offsetDateTime
        OffsetDateTime birthday = OffsetDateTime.parse("2002-05-03T12:30:00Z");
        //stampare offsetDateTime
        System.out.println(birthday);

        // full date format
        String birthdayFullFormat = birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        // stampare Full format
        System.out.println(birthdayFullFormat);

        // medium date format
        String birthdayMediumFormat = birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(birthdayMediumFormat);

        // short format
        String birthdayShortFormat = birthday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(birthdayShortFormat);
    }
}
