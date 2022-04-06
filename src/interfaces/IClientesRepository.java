package interfaces;

import entities.Cliente;

public interface IClientesRepository {

	void exportarDados(Cliente cliente) throws Exception;
	
}
