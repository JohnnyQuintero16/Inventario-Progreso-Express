package com.inventario.ProyectoSENA.Modelo;

import com.inventario.ProyectoSENA.Modelo.Factura;
import com.inventario.ProyectoSENA.Modelo.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-19T16:43:49")
@StaticMetamodel(DetalleProducto.class)
public class DetalleProducto_ { 

    public static volatile SingularAttribute<DetalleProducto, Integer> costo;
    public static volatile SingularAttribute<DetalleProducto, Factura> idFactura;
    public static volatile SingularAttribute<DetalleProducto, Integer> id;
    public static volatile SingularAttribute<DetalleProducto, Integer> cantidad;
    public static volatile SingularAttribute<DetalleProducto, Producto> idProducto;

}