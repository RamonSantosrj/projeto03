package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Cliente;
import interfaces.IClientesRepository;

public class ClienteRepositoryTXT implements IClientesRepository {

	@Override
	public void exportarDados(Cliente cliente) throws Exception {
	
		PrintWriter print = new PrintWriter(new FileWriter("C:\\Users\\ramon\\Desktop\\backup\\Aula Coti Informatica - java web\\clientes.txt",true));
		
		print.write("\n" + cliente.toString());
		print.write("oi");
		print.flush();
		print.close();
	}

	
	
}
