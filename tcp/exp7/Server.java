import java.io.*;
import java.net.*;

 
public class Server
{
 

   private static Socket socket1;
 
   private static Socket socket2;

 
   public static void reveiveData(ServerSocket serverSocket,Socket socket) throws Exception
{
        
        DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
  
      String message = in.readUTF();
   
     System.out.println("Message Recieved From client : "+message+"\n");
    
    //System.out.println("Sending to Client "+client+"\n");
  
  }
   
 public static void sendData(Socket socket,int i,String message) throws Exception
{
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
   
     out.writeUTF(message);
  
      out.flush();
   
 }
  
  public static void main(String[] args)
 
   {
     
   try
    
    {
            ServerSocket serverSocket = new ServerSocket(25000);
   
         socket1 = serverSocket.accept();
    
        System.out.println("Connection Established with Client 1\n");
   
         while(true) 
{
            
    reveiveData(serverSocket,socket1);
      
      }
  
      }
     
   catch (Exception e)
   
     {e.printStackTrace();}
     
   finally
     
   {
       
     try
     
       {
            
    socket1.close();
   
             socket2.close();
  
          }
         
   catch(Exception e){}
  
      }
  
  }

}


