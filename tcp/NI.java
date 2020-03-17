import java.io.*;
import java.net.*;
import java.util.*;
import static java.lang.System.out;
import java.net.NetworkInterface;

public class NI
{	public static void main(String [] args) throws IOException
	{
InetAddress ip=InetAdress.getByName("local host");
NetworkInterface ni = new NetworkInterface(ip);
System.out.println("is up:"+ni.isUp());
	System.out.println("Name:"+ni.getDisplayName());
	System.out.println("is loop back:"+ni.isLoopback());
	System.out.println("MTU:"+ni.getMTU());
	System.out.println("Hardware Address:"+ni.getHardwareAddress());
	System.out.println("Multicast:"+ni.supportsMulticast());
	System.out.println("is virtual:"+ni.isVirtual());
	System.out.println("Subinterface:"+ni.getSubInterfaces());
	}
	public static void display(String a)
	{
	System.out.println(a);
	}
}