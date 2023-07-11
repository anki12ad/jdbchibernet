 package bidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		User user=new User();
		user.setId(1);
		user.setName("Abhi");
		user.setPhone(23456754);
		
		User user1=new User();
		user1.setId(2);
		user1.setName("Abhilash");
		user1.setPhone(23456754);
		
		User user2=new User();
		user2.setId(3);
		user2.setName("Dhruva");
		user2.setPhone(23456754);
		
		Facebook facebook=new Facebook();
		facebook.setVersion("v1");
		facebook.setServer_name("Fa..22_34");
		facebook.setApp_id(1);
		
		//mapping unidirection with bidirection
		user.setFacebook(facebook);
		user1.setFacebook(facebook);
		user2.setFacebook(facebook);
		
		List<User> l=new ArrayList<User>();
		l.add(user);
		l.add(user1);
		l.add(user2);
		
		//onetomany
		facebook.setUser(l);
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityManager.persist(user1);
		entityManager.persist(user2) ;
		entityManager.persist(facebook);
		entityTransaction.commit();
		System.out.println("Bidirection is done");
		
		
		
		
		
	}
}
