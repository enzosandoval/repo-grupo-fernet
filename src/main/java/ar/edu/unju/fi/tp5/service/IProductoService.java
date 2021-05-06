/**
 * 
 */
package ar.edu.unju.fi.tp5.service;

import java.util.List;

import ar.edu.unju.fi.tp5.model.Producto;

/**
 * @author Team Fernet
 *
 */
public interface IProductoService {

	public void guardar(Producto producto);

	public Producto obtenerUltimo();

	public List<Producto> obtenerLista();

}
