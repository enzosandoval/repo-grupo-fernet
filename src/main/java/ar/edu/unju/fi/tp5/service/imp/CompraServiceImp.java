package ar.edu.unju.fi.tp5.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp5.model.Compra;
import ar.edu.unju.fi.tp5.service.ICompraService;
import ar.edu.unju.fi.tp5.util.ListaCompras;

/**
 * @author Team Fernet
 *
 */

@Service
public class CompraServiceImp implements ICompraService {

	private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class); 
	
	private List<Compra>listaCompras = ListaCompras.listaCompras;
	
	@Override
	public void guardarCompra(Compra compra) {
		listaCompras.add(compra);
		LOGGER.info("METHOD: agregarProducto - Se agrego un objeto producto en la lista");
	    LOGGER.info("RESULT: Producto agregado con éxito -> Tamaño lista: " + listaCompras.size());
	}
	
	
	@Override
	public Compra obtenerUltimaCompra() {
		LOGGER.info("METHOD: obtenerUltimo()");
		Compra compra = null;
		if (listaCompras.size() > 0) {
			LOGGER.info("RESULT: Ultimo producto: " + listaCompras.get(listaCompras.size() - 1));	
		 compra = listaCompras.get(listaCompras.size()-1);   
		 
		}
		return compra;
	}

	@Override
	public List<Compra> obtenerLista() {
		LOGGER.info("METHOD: obtenerLista()");
		return listaCompras;
	}

}
