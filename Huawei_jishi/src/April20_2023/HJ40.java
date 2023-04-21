package April20_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ40 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int numOfAlphaBetic = 0, numOfSpace = 0, numOfDigit = 0, numOfOthers = 0;
        for (char ch : input.toCharArray()){
            if (Character.isAlphabetic(ch)){
                numOfAlphaBetic++;
            }else if (Character.isDigit(ch)){
                numOfDigit++;
            }else if (' ' == ch){
                numOfSpace++;
            }else{
                numOfOthers++;
            }
        }

        System.out.println(numOfAlphaBetic);
        System.out.println(numOfSpace);
        System.out.println(numOfDigit);
        System.out.println(numOfOthers);
    }
}
