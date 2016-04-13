import java.util.Scanner;

/**
 * Created by quatro on 4/12/16.
 */
public class ClientInterface {

    public static void main(String[] args) {

        String command;
        Scanner userInput = new Scanner(System.in);

        command = userInput.nextLine();
        while(!command.equals("exit")){
            wr.println(command);
            System.out.println(rd.readLine());
            command = userInput.nextLine();
        }


    }
}
