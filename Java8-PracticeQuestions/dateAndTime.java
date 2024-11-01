import java.time.LocalDateTime;
import java.time.format.*;
public class dateAndTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime:"+localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Date is:"+dateTimeFormatter.format(localDateTime));
    }
}
