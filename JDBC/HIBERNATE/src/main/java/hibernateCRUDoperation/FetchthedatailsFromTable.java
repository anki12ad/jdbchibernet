package hibernateCRUDoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchthedatailsFromTable {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		CreateTable createTable=entityManager.find(CreateTable.class, 4);
		System.out.println(createTable.getName());
		System.out.println(createTable.getPhone());
}
}
