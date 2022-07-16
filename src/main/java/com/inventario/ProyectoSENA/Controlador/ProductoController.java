package com.inventario.ProyectoSENA.Controlador;

import com.inventario.ProyectoSENA.Implementacion.ProductoImp;
import com.inventario.ProyectoSENA.Modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class ProductoController {

    @Autowired
    ProductoImp productoImp;

    @GetMapping("productos")
    public ResponseEntity<?> getProducto(){
        return ResponseEntity.ok(this.productoImp.getProducto());
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable int id){
        this.productoImp.eliminarProdcuto(id);
        return ResponseEntity.status(HttpStatus.OK)
                                        .body(id);
    }

    @PostMapping("guardar")
    public ResponseEntity<?> guardarProducto(@RequestBody Producto producto){
        this.productoImp.guardarProducto(producto);
        return ResponseEntity.status(HttpStatus.OK)
                                        .body(producto);
    }

    @PostMapping("actualizar")
    public ResponseEntity<?> actualizarProducto(@RequestBody Producto producto){
        this.productoImp.guardarProducto(producto);
        return ResponseEntity.status(HttpStatus.OK)
                                        .body(producto);
    }
}
