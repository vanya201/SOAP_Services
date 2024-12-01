package ua.cn.stu.service;

import stu.cn.ua.dao.HibernateDAOFactory;
import stu.cn.ua.domain.Product;

import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "ua.cn.stu.service.ProductService",
        serviceName = "productservice")
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getAllProducts() {
        return HibernateDAOFactory.getInstance().getProductDAO().getAllEntities();
    }
    @Override
    public Product addProduct(Product product) {
        HibernateDAOFactory.getInstance().getProductDAO().createEntity(product);
        return product;
    }
    @Override
    public Product updateProduct(Product product) {
        HibernateDAOFactory.getInstance().getProductDAO().updateEntity(product);
        return product;
    }
    @Override
    public void deleteProduct(Long productId) {
        HibernateDAOFactory.getInstance().getProductDAO()
                .deleteEntityById(productId);
    }
}
