package com.inventario.ProyectoSENA.Modelo;

import com.inventario.ProyectoSENA.Modelo.Factura;
import com.inventario.ProyectoSENA.Modelo.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-19T16:43:49")
@StaticMetamodel(ClienteFactura.class)
public class ClienteFactura_ { 

    public static volatile SingularAttribute<ClienteFactura, Usuario> idCliente;
    public static volatile SingularAttribute<ClienteFactura, Factura> idFactura;
    public static volatile SingularAttribute<ClienteFactura, Integer> id;

}