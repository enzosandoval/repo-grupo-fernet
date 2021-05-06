/**
 * 
 */
package ar.edu.unju.fi.tp5.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp5.model.Producto;
import ar.edu.unju.fi.tp5.service.IProductoService;

/**
 * @author Team Fernet
 *
 */
@Service
public class ProductoServiceImp implements IProductoService {

	// Constante LOGGER para realizar las trazas de la aplicación
	private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);

	// Lista de productos
	private List<Producto> lista = new ArrayList<Producto>();

	@Override
	public void guardar(Producto producto) {
		LOGGER.info("SERVICE: ProductoService");
		LOGGER.info("METHOD: guardar() -> Tamaño lista: " + lista.size());
		lista.add(producto);
		LOGGER.info("RESULT: Producto agregado con éxito -> Tamaño lista: " + lista.size());
	}

	@Override
	public Producto obtenerUltimo() {
		LOGGER.info("SERVICE: ProductoService");
		LOGGER.info("METHOD: obtenerUltimo()");
		Producto producto = null;
		if (lista.size() > 0) {
			LOGGER.info("RESULT: Ultimo producto: " + lista.get(lista.size() - 1));
			producto = lista.get(lista.size() - 1);
		}
		return producto;
	}

	/**
	 * 
	 * @return La lista de productos
	 */
	public List<Producto> obtenerLista() {
		LOGGER.info("SERVICE: ProductoService");
		LOGGER.info("METHOD: obtenerLista()");
		LOGGER.info("RESULT: List: " + lista.size());
		return lista;
	}

}
