import java.net.*;

class server {
	public static void main(String[] args) {
		ServerSocket server = new ServerSocket(3000);
		//starting server
		try{
			
		Socket s = server.accept();
		
		//no clinet request, connected
		System.out.println("Connected");
		}
		catch(Exception e){
			
		}
	}
}