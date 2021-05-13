package ar.edu.unju.fi.tp5.service;

import java.util.List;

import ar.edu.unju.fi.tp5.model.Compra;

/**
 * @author Team Fernet
 *
 */
public interface ICompraService {

	public void guardarCompra(Compra compra);

	public Compra obtenerUltimaCompra();

	public List<Compra> obtenerCompras();

}
