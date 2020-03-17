import java.io.*;
import java.net.*;
import java.util.*;

class Client
{
 
  
  private static Socket socket;
 
  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
   public static void sendData() throws Exception{
  
          DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
  
          System.out.println("Enter The Data");
 
           String Message = reader.readLine();     

            System.out.println("Message = "+Message);
    
        out.writeUTF(Message);  
   
         out.flush();
            sendData();
 
   }
   
 public static void receiveData() throws Exception{
    
        DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    
        String a= in.readUTF();  
   
         System.out.println("Message received from the server :"+ a );

            sendData();

    }
   
 public static void main(String args[])
  
  {
        try
    
    {
            String host = "localhost";
   
         int port = 25000;
         
   InetAddress address = InetAddress.getByName(host);
     
       System.out.println("Establishing Connection");
    
        socket = new Socket(address, port);
 
           System.out.println("Connection Established");
   
         sendData();
   
     }
        catch (Exception exception)
{exception.printStackTrace();
}

        finally
      
  { 
   
         try{ 
socket.close();

}
   
         catch(Exception e)

{
e.printStackTrace();

}
   

 }

}

}
