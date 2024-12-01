package ua.cn.stu.service;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import stu.cn.ua.domain.Seller;

@WebService
public interface SellerService {
    @WebMethod
    @WebResult(name = "Seller")
    List<Seller> getAllSellers();
    @WebMethod
    @WebResult(name = "Seller")
    public Seller addSeller(@WebParam(name = "Seller") Seller seller);
    @WebMethod
    @WebResult(name = "Seller")
    public Seller updateSeller(@WebParam(name = "Seller") Seller seller);
    @WebMethod
    @WebResult(name = "Seller")
    public void deleteSeller(@WebParam(name = "Seller") Long sellerId);
}