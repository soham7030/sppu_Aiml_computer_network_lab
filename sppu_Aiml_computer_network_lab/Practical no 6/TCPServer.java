import java.io.*;
import java.net.*;
import java.util.*;
public class TCPServer
{
	public static void main(String args[])
    	{
		try
       		{
			ServerSocket ss=new ServerSocket(8080);
	 		System.out.println("Waiting for client");
	 		Socket server=ss.accept();
			System.out.println("Server is connected");

	 		//send data from server to client
	 		Scanner sc=new Scanner(System.in);
			PrintWriter pw=new PrintWriter(server.getOutputStream());
			while(true)
            		{
				System.out.print("Enter data  ");
	 			String data=sc.nextLine();
	  			pw.println(data);
	 			pw.flush();
			}
       		}
       		catch(Exception e)
        	{
	 		System.out.println(e);		
		}
	}
}


