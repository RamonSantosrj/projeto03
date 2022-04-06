package principal;

import javax.swing.JOptionPane;

import entities.Cliente;
import entities.Endereco;
import interfaces.IClientesRepository;
import repositories.ClienteRepositoryCSV;
import repositories.ClienteRepositoryTXT;

public class program {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		cliente.setId(1);
		cliente.setNome("Ramon");
		cliente.setEmail("ramon@hotmail.com");
		cliente.setCpf("123.123.123-00");
		
		//instanciar o endereço relacionado ao cliente 
		cliente.setEndereco(new Endereco());
		cliente.getEndereco().setId(1);
		cliente.getEndereco().setLogradouro("Av nazare");
		cliente.getEndereco().setNumero("1031");
		cliente.getEndereco().setComplemento("ao lado do bar");
		cliente.getEndereco().setBairro("Ricador de albuquerque");
		cliente.getEndereco().setCidade("Rio de Janeiro");
		cliente.getEndereco().setEstado("RJ");
		cliente.getEndereco().setCep("200040-007");
	
//	System.out.println("\tDADOS DO CLIENTE:");
//	System.out.println(cliente.toString());
//	
//	
	
	try {
		String opcao = JOptionPane.showInputDialog("Informe [TXT] ou [CSV]:");
		
		IClientesRepository clientesRepository = null;
		
		switch(opcao) {
		
		case "TXT":
			clientesRepository = new ClienteRepositoryTXT();
			break;
			
		case "CSV":
			clientesRepository = new ClienteRepositoryCSV();
			break;
		
		default: 
			throw new Exception("Opção invalida!");
		}
		
		clientesRepository.exportarDados(cliente);
	} catch (Exception e) {
		System.out.println("Erro:" + e.getMessage());
	}
	
	}
}
