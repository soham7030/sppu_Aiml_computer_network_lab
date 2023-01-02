import java.io.*;
import java.net.*;
public class TCPClient
{
    public static void main(String args[])
	{
		try
		{
		  	Socket client =new Socket("localhost",8080);
		  	System.out.println("Client is connected");

	 		//read data from server
	 		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			while(true)
			{
		  		String data=br.readLine();
	 			System.out.println("Data from server:  "+data);
		    	}
		} 
        	catch(Exception e)
        	{
	  		System.out.println(e);
	 	}
	}
}

