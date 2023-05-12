package May12_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ66 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String[] twoWordsCommand = {"reset board", "board add", "board delete",
                "reboot backplane", "backplane abort"};
        String[] outputs = {"reset what", "board fault", "where to add",
                "no board at all", "impossible", "install first", "unknown command"};
        while ((input = br.readLine()) != null){
            String[] command = input.split(" ");
            if (command.length == 1){
                if ("reset".startsWith(command[0])){
                    System.out.println(outputs[0]);
                }else {
                    System.out.println(outputs[6]);
                }
                continue;
            }

            int num = 0, index = 0;

            for (int i = 0; i < twoWordsCommand.length; i++){
                String[] strings = twoWordsCommand[i].split(" ");
                if (strings[0].startsWith(command[0])){
                    if (strings[1].startsWith(command[1])) {
                        num++;
                        index = i;
                    }
                }
            }
            if (num == 1) System.out.println(outputs[index + 1]);
            else System.out.println(outputs[6]);

        }
    }
}
