package LW_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE,dd MMMM,yyyy");
        System.out.println(simpleDateFormat.format(today));
    }
}
