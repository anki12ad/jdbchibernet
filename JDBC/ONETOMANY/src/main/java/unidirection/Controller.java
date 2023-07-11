package unidirection;

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
	
	Whatsapp whatsapp=new Whatsapp();
	whatsapp.setPhone(245645767l);
	whatsapp.setUser_name("deepz");
	whatsapp.setEmail_Id("deepzanki@gmail.com");
	
	Contacts contacts1=new Contacts();
	contacts1.setEmail_Id("Lochu@gmail.com");
	contacts1.setName("Lochu");
	contacts1.setNickname("chikku");
	contacts1.setPhone(2345678987l);
	
	Contacts contacts2=new Contacts();
	contacts2.setEmail_Id("Bhoms@gmail.com");
	contacts2.setName("Bhoomika");
	contacts2.setNickname("bhooms");
	contacts2.setPhone(23456789345l);
	
	Contacts contacts3=new Contacts();
	contacts3.setEmail_Id("Pinnu@gmail.com");
	contacts3.setName("Bhavana");
	contacts3.setNickname("pinnu");
	contacts3.setPhone(234567823457l);
	
	List<Contacts> listcontacts=new ArrayList<Contacts>();
	listcontacts.add(contacts1);
	listcontacts.add(contacts2);
	listcontacts.add(contacts3);
	
	//mapping
	whatsapp.setContacts(listcontacts);
	
	entityTransaction.begin();
	entityManager.persist(whatsapp);
	entityManager.persist(contacts1);
	entityManager.persist(contacts2);
	entityManager.persist(contacts3);
	entityTransaction.commit();
	
	System.out.println("unidirection of onetomany is done");
}
}
