import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;


public class Client {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.0.119", 3333);
		
		OutputStream saida = socket.getOutputStream();
		ObjectOutput objectOutput = new ObjectOutputStream(saida);
		
		Pedido pedido = new Pedido();
		pedido.setCodigo(2L);
		pedido.setDescricao("Pasta de dente");
		pedido.setQuantidade(2);
		
		objectOutput.writeObject(pedido);
		
		InputStream entrada = socket.getInputStream();
		DataInputStream dataInput = new DataInputStream(entrada);
		System.out.println("Recebeu do servidor: " + dataInput.readUTF());
		
		socket.close();
		
	}
	
}
