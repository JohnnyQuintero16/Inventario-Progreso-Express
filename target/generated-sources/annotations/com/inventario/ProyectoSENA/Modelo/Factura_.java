package com.inventario.ProyectoSENA.Modelo;

import com.inventario.ProyectoSENA.Modelo.ClienteFactura;
import com.inventario.ProyectoSENA.Modelo.DetalleProducto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-19T16:43:49")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, Integer> total;
    public static volatile CollectionAttribute<Factura, DetalleProducto> detalleProductoCollection;
    public static volatile SingularAttribute<Factura, Integer> descuento;
    public static volatile SingularAttribute<Factura, String> concepto;
    public static volatile CollectionAttribute<Factura, ClienteFactura> clienteFacturaCollection;
    public static volatile SingularAttribute<Factura, Integer> id;

}