package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program2 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
	
	
//	System.out.println("======TEST1: Department Insert =====");
	
//	Department department = new Department(null , "NovoDepartamento");
//	
//	
//	System.out.println("======TEST2: Department Insert =====");
//	departmentDao.insert(department);
	
//	System.out.println("======TEST2: Department Insert =====");
//	System.out.println("Insira o id a ser alterado \n");
//	int id = sc.nextInt();
//	sc.nextLine();
//	Department department2 = new Department(id , "NovoDoJose");
//	departmentDao.update(department2);
	
//	
//	System.out.println("======TEST3: Department SearchById =====");
//	System.out.println("Insira o id a ser Procurado \n");
//	
//	int id2 = sc.nextInt();
//	sc.nextLine();
//	System.out.println(departmentDao.findById(id2));
	
	
	
//	
//	System.out.println("======TEST4: Department Deleted =====");
//	System.out.println("Insira o id a ser Deletado \n");
//	
//	int id3 = sc.nextInt();
//	sc.nextLine();
//	departmentDao.deleteById(id3);
	
	System.out.println("======TEST4: Department Update =====");
	System.out.println("Insira o id a ser Atualizado \n");
	
	int id4 = sc.nextInt();
	sc.nextLine();
	Department dep = new Department(id4, "PLACASDEVIDEO");
	departmentDao.update(dep);
	
	
	System.out.println("======TEST5: Department Find All =====");
	System.out.println(departmentDao.findAll());
	
	
	
	
	}
}
