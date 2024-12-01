package ua.cn.stu.service;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import stu.cn.ua.domain.Product;

@WebService
public interface ProductService {
    @WebMethod
    @WebResult(name = "Product")
    List<Product> getAllProducts();
    @WebMethod
    @WebResult(name = "Product")
    public Product addProduct(@WebParam(name = "Product") Product product);
    @WebMethod
    @WebResult(name = "Product")
    public Product updateProduct(@WebParam(name = "Product") Product product);
    @WebMethod
    @WebResult(name = "Product")
    public void deleteProduct(@WebParam(name = "ProductId") Long productId);
}