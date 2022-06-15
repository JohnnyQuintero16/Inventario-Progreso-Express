package com.inventario.ProyectoSENA.Modelo;

import com.inventario.ProyectoSENA.Modelo.Categoria;
import com.inventario.ProyectoSENA.Modelo.DetalleProducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-15T14:51:25")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> imgUrl;
    public static volatile SingularAttribute<Producto, String> marca;
    public static volatile SingularAttribute<Producto, String> estado;
    public static volatile CollectionAttribute<Producto, DetalleProducto> detalleProductoCollection;
    public static volatile SingularAttribute<Producto, Integer> precioCompra;
    public static volatile SingularAttribute<Producto, Categoria> categoria;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile SingularAttribute<Producto, Integer> precioVenta;
    public static volatile SingularAttribute<Producto, String> nombre;

}