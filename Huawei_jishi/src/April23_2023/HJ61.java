package April23_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ61 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strings = input.split(" ");

        int numOfApple = Integer.parseInt(strings[0]);
        int numOfPlate = Integer.parseInt(strings[1]);

        System.out.println(solution(numOfApple, numOfPlate));

    }

    public static int solution(int apple, int plate){
        if (apple == 0 || plate == 1) {
            return 1;
        }else if (apple < plate){
            return solution(apple, apple);
        }else{
            return solution(apple - plate, plate) + solution(apple, plate - 1);
        }
    }
}
