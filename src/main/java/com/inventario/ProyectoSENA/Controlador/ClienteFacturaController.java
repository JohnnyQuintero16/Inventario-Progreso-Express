/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.ProyectoSENA.Controlador;

import com.inventario.ProyectoSENA.Implementacion.ClienteFacturaImp;
import static com.inventario.ProyectoSENA.Modelo.ClienteFactura_.idCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author johnny
 */
@RestController
@RequestMapping("/cliente")
public class ClienteFacturaController {
    
    @Autowired
    ClienteFacturaImp clienteFacturaImp;
    
    @GetMapping("facturasadmin")
    public ResponseEntity<?> getClientesFacturas(){
        return ResponseEntity.ok(this.clienteFacturaImp.getClientesFacturas());
    }
    
    @PostMapping("factura/{idCliente}")
    public ResponseEntity<?> getClientefactura(@PathVariable Integer idCliente){
        return ResponseEntity.ok(this.clienteFacturaImp.buscarClienteFactura(idCliente));
    }
}
