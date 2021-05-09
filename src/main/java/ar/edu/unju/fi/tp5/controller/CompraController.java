/**
 * 
 */
package ar.edu.unju.fi.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ar.edu.unju.fi.tp5.service.ICompraService;
import ar.edu.unju.fi.tp5.service.IProductoService;

/**
 * @author Asus
 *
 */

@Controller
public class CompraController {

	@Autowired
	private ICompraService serviceCompra;
	
	@Autowired
	private IProductoService serviceProducto;
	
	
	public String listarProductos (){
		model.addAttribute("listaproducto", serviceCompra.obtenerLista());
		return "clientes";
	}
	
	
	
	mostrarProductoSeleccionado (){
		
	}
	
	mostrarCompras (){
		
	}
	
}
