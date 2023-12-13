package dao;

import java.util.List;

import domain.Cliente;

public interface IClienteDAO {

	public Integer cadastrar (Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;
	
	public List<Cliente> buscarTodos (String codigo) throws Exception;
	
	public Integer Atualizar (Cliente Cliente) throws Exception;
}
