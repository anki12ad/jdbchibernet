package hibernateCRUDoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateValues {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		CreateTable createTable=entityManager.find(CreateTable.class, 1);
		createTable.setName("Raju");
		createTable.setPhone(345679454656l);
		entityTransaction.begin();
		entityManager.merge(createTable);
		entityTransaction.commit();
		System.out.println(" the values  are update succesfully");

	}
}
