package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import dao.ClienteDAO;
import dao.IClienteDAO;
import domain.Cliente;


public class ClienteTest {

	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Pedro Oliveira");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);	
	
		
		List<Cliente> clienteBT = dao.buscarTodos(cliente.getCodigo());
		IClienteDAO bt = new ClienteDAO();
		
		Cliente clienteSA = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Pedro Oliveira");
		Integer countCad = bt.cadastrar(cliente);
		assertTrue(countCad == 1);
	
		
		
			ClienteDAO clienteDAO = new ClienteDAO();
			
			Cliente clienteAtt = new Cliente();
			cliente.setCodigo("01");
			cliente.setNome("Pedro Oliveira");
			Integer countCad2 = clienteDAO.cadastrar(cliente);
			assertTrue(countCad2 == 1);
			
			List<Cliente> clienteAt = clienteDAO.buscarTodos("01");
			assertNotNull(clienteBD);
			assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
			assertEquals(cliente.getNome(), clienteBD.getNome());
			
	
			
			List<Cliente> clienteBD1 = clienteDAO.buscarTodos("01");
			assertNotNull(clienteBD1);									
			equals(clienteBD.getId());
			equals(clienteBD.getCodigo());
			equals(clienteBD.getNome());
			
			
			}
		}
	

