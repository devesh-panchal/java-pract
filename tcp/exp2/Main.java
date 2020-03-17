import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

  public static void main(String[] args) {

    try {
      InetAddress me = InetAddress.getLocalHost();
      String dottedQuad = me.getHostAddress();
      System.out.println("My address is " + dottedQuad+"\n name="+me.getHostName());
    } catch (UnknownHostException e) {
      System.out.println("I'm sorry. I don't know my own address.");
    }

  }

}