package pe.com.ibm.catalog.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pe.com.ibm.catalog.bean.Product;

/**
 * ProductResource
 */
@Path("/products")
public class ProductResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> listar(){
        List<Product> l=new ArrayList<>();
        Product p=new Product();
        l.add(p);
        return l;
    }

    
}