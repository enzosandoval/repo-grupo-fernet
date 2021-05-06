/**
 * 
 */
package ar.edu.unju.fi.tp5.service;

import java.util.List;

import ar.edu.unju.fi.tp5.model.Cliente;

/**
 * @author Team Fernet
 *
 */
public interface IClienteService {

	public void generarLista();

	public void guardar(Cliente cliente);

	public List<Cliente> obtenerLista();
}
