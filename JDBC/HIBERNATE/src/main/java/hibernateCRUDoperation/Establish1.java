package hibernateCRUDoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Establish1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Studentsss studentsss=new Studentsss();
		studentsss.setId(1);
		studentsss.setName("Pinnu");
		studentsss.setPhone(5672345645l);
		
		entityTransaction.begin();
		entityManager.persist(studentsss);
		entityTransaction.commit();
		System.out.println("the table created");
	}
}
