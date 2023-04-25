package April25_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HJ73 {
    /*public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
        Date date = sdf.parse(input);
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] data = str.split(" ");
            int year = Integer.parseInt(data[0]);
            int mouth = Integer.parseInt(data[1]);
            int day = Integer.parseInt(data[2]);

            int[] arr = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

            if (year % 400 == 0 && mouth > 2) {
                System.out.println(arr[mouth - 1] + day + 1);
            } else if (year % 100 != 0 && year % 4 == 0 && mouth > 2) {
                System.out.println(arr[mouth - 1] + day + 1);
            } else {
                System.out.println(arr[mouth - 1] + day);
            }


        }
    }
}
