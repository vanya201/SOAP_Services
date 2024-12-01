package ua.cn.stu.service;

import stu.cn.ua.dao.HibernateDAOFactory;
import stu.cn.ua.domain.Seller;

import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "ua.cn.stu.service.SellerService",
        serviceName = "sellerservice")
public class SellerServiceImpl implements SellerService {
    @Override
    public List<Seller> getAllSellers() {
        return HibernateDAOFactory.getInstance().getSellerDAO().getAllEntities();
    }
    @Override
    public Seller addSeller(Seller seller) {
        HibernateDAOFactory.getInstance().getSellerDAO().createEntity(seller);
        return seller;
    }
    @Override
    public Seller updateSeller(Seller seller) {
        HibernateDAOFactory.getInstance().getSellerDAO().updateEntity(seller);
        return seller;
    }
    @Override
    public void deleteSeller(Long sellerId) {
        HibernateDAOFactory.getInstance().getSellerDAO()
                .deleteEntityById(sellerId);
    }
}
