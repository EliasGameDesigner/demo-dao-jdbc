package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
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
	
	System.out.println("\n ==== Test 4: Seller Insert =====");
	Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, departm); 
	
	sellerDao.insert(newSeller);
	System.out.println("Inserted!, New id = " + newSeller.getId());
	
	
	System.out.println("\n ==== Test 5: Update Seller =====");
	seller = sellerDao.findById(1);
	seller.setName("Martha Waine");
	sellerDao.update(seller);
	
	System.out.println("\n ==== Test 5: Deleted Seller =====");
	System.out.println("Insira um Id A ser Deletado");
	int id = sc.nextInt();
	sellerDao.deleteById(id);
	
	
	
	}
}
