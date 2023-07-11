package hibernateCRUDoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	CreateTable createTable=new CreateTable();
	createTable.setId(3);
	createTable.setName("Rakku");
	createTable.setPhone(345679765456l);
	entityTransaction.begin();
	entityManager.merge(createTable);
	entityTransaction.commit();
	System.out.println("update succesfully");

}
}
