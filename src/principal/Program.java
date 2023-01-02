package principal;

import java.util.Date;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDAO;

public class Program {
    
    public static void main(String[] args) {
        
        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Bob", "bobo@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

    }

}
