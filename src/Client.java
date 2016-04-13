import java.util.logging.Logger;
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

    private static Logger log = Logger.getLogger(Client.class.getName());

    // store musics

    public static void main(String[] args) throws IOException {

        String command;
        String[] tokens;
        String line;
        Scanner userInput = new Scanner(System.in);

        DatagramSocket socket = new DatagramSocket();

        while(true){

            line = userInput.nextLine();
            tokens = line.split("\\s+");
            command = tokens[0];



            if (command.equals("exit")){
                break;
            }

            if (command.equals("register")){
                register(socket, tokens[1]);
            }



            //wr.println(command);
            //System.out.println(rd.readLine());


        }


    }


    public void register(DatagramSocket socket, String id) throws IOException {

        log.info("Client wants to register.");
        byte[] buf = new byte[256];

        InetAddress address = InetAddress.getByName(TODO);
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
        socket.send(packet);

    }


    public void probeRequest(){
        log.info("Client is doing a probe request.");

    }

    public void probeResponse(){
        log.info("Client is responding to a probeRequest from another client.");
        //return timestamp

    }

    public void consultRequest(){
        log.info("Client is requesting to consult with the server.");


    }

    public void consultResponse(){
        log.info("Client is responding to a consulting request from the server.");

    }

    public void requestData(){
        log.info("Client is requesting data to another client.");

    }

    public void sendData(){
        log.info("Client is sending data to another client.");

    }

}
