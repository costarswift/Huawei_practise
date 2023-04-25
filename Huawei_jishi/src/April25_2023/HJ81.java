package April25_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ81 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String shortString = br.readLine();
        String longString = br.readLine();

        System.out.println(shortString.matches("[" + longString + "]+"));

    }

}
