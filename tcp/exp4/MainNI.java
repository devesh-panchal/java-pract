import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class MainNI {
  public static void main(String[] args) throws Exception {
    Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
    while (en.hasMoreElements()) {
      NetworkInterface ni = en.nextElement();
      printParameter(ni);
    }
  }

  public static void printParameter(NetworkInterface ni) throws SocketException {
   
    System.out.println(" Hardware address = " + ni.getHardwareAddress());
    System.out.println(" MTU = " + ni.getMTU());

   
    
  }
}

   
    
  