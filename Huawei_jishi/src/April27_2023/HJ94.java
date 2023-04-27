package April27_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ94 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfCandidate = Integer.parseInt(br.readLine());
        String[] names = br.readLine().split(" ");
        int[] voteOfCandidate = new int[numOfCandidate];
        int numOfVotes = Integer.parseInt(br.readLine());
        String[] votes = br.readLine().split(" ");

        for (int i = 0; i < votes.length; i++) {
            for (int j = 0; j < numOfCandidate; j++) {
                if (names[j].equals(votes[i])){
                    voteOfCandidate[j]++;
                    numOfVotes--;
                    break;
                }
            }
        }

        //输出
        for (int i = 0; i < numOfCandidate; i++) {
            System.out.println(names[i] + " : " + voteOfCandidate[i]);
        }
        System.out.println("Invalid : " + numOfVotes);

    }
}
