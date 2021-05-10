/**
 * 
 */
package ar.edu.unju.fi.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.fi.tp5.model.Compra;
import ar.edu.unju.fi.tp5.model.Producto;
//import ar.edu.unju.fi.tp5.service.ICompraService;
import ar.edu.unju.fi.tp5.service.IProductoService;

/**
 * @author Asus
 *
 */

@Controller
public class CompraController {

	@Autowired
	private Compra compra;

	@Autowired
	private Producto producto;

//	@Autowired
//	private ICompraService compraService;

	@Autowired
	private IProductoService productoService;

	/**
	 * 
	 * @param id
	 * @param model
	 * @return Formulario de compra
	 */
	@GetMapping("/compra")
	public String getCompra(@RequestParam(value = "id", required = true) int id, Model model) {
		producto = productoService.buscarProducto(id);
		System.out.println(producto.toString());
		compra.setProducto(producto);
		model.addAttribute("producto", producto);
		model.addAttribute("compra", compra);
		return "compra";
	}

}
