/**
 * 
 */
package ar.edu.unju.fi.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.tp5.model.Producto;
import ar.edu.unju.fi.tp5.service.IProductoService;

/**
 * 
 * @author Team Fernet
 *
 */
@Controller
public class ProductoController {

	@Autowired
	private Producto producto;

	@Autowired
	private IProductoService productoService;

	/**
	 * 
	 * @return La página del formulario para el alta de nuevo Producto
	 */
	@GetMapping("/producto")
	public String getPage(Model model) {
		model.addAttribute(producto);
		return "nuevo";
	}

	/**
	 * 
	 * @return La página resultado.html que muestra la lista de productos agregados
	 */
	@PostMapping("/producto/guardar")
	public String getResultado(@ModelAttribute("producto") Producto producto, Model model) {
		productoService.guardar(producto);
		model.addAttribute("listado", productoService.obtenerLista());
		return "resultado";
	}

	/**
	 * 
	 * @return La página que muestra el último Producto agregado
	 */
	@GetMapping("/producto/ultimo")
	public String getUltimoProducto(Model map) {
		map.addAttribute("producto", productoService.obtenerUltimo());
		return "ultimoproducto";
	}

}
