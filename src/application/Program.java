package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
	
	SellerDao sellerDao = DaoFactory.createSellerDao();	
	
	
	System.out.println("======TEST1: Seller findBy =====");
	Seller seller = sellerDao.findById(3);
	System.out.println(seller);
	
	System.out.println("\n ==== Test 2: seller findByDepartment =====");
	Department departm = new Department(2, null);
	List<Seller> list = sellerDao.findByDepartment(departm);
	
	for(Seller obj : list) {
		System.out.println(obj);
	}
	
	System.out.println("\n ==== Test 3: seller findByAll =====");
	list = sellerDao.findAll();
	for(Seller obj : list) {
		System.out.println(obj);
	}
	
	}

}
