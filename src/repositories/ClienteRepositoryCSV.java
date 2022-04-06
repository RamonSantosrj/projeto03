package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Cliente;
import interfaces.IClientesRepository;

public class ClienteRepositoryCSV implements IClientesRepository {

	@Override
	public void exportarDados(Cliente cliente) throws Exception {

		PrintWriter print = new PrintWriter(new FileWriter("C:\\Users\\ramon\\Desktop\\backup\\Aula Coti Informatica - java web\\clientes.csv", true));

			String texto = cliente.getId() + ";" + cliente.getNome() + ";" + cliente.getEmail() + ";" + cliente.getCpf()
				+ ";" + cliente.getEndereco().getId() + ";" + cliente.getEndereco().getLogradouro() + ";"
				+ cliente.getEndereco().getNumero() + ";" + cliente.getEndereco().getComplemento() + ";"
				+ cliente.getEndereco().getBairro() + ";" + cliente.getEndereco().getCidade() + ";"
				+ cliente.getEndereco().getEstado() + ";" + cliente.getEndereco().getCep() + "\n";

			print.write(texto);
		print.flush();
		print.close();

	}
}
