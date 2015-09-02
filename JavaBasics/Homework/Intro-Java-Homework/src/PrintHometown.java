import java.time.LocalDateTime;

public class PrintHometown {
    public static void main(String[] args) {
        System.out.println("Sofia");

        LocalDateTime newDate = LocalDateTime.now();
        System.out.println(newDate.getYear());
    }
}
