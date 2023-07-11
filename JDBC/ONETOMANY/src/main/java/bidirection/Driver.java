package bidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bidirection.Whatsapp1;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Whatsapp1 whatsapp1=new Whatsapp1();
		whatsapp1.setPhone(245645767l);
		whatsapp1.setName("deepz");
		whatsapp1.setEmail_Id("deepzanki@gmail.com");
		
		Contacts1 contacts8=new Contacts1();
		contacts8.setEmail_Id("Loch@gmail");
		contacts8.setName("lochu");
		contacts8.setPhone(3458956789l);
		
		Contacts1 contacts9=new Contacts1();
		contacts9.setEmail_Id("bhooms@gmail");
		contacts9.setName("bhoomika");
		contacts9.setPhone(345555789l);
		
		Contacts1 contacts10=new Contacts1();
		contacts10.setEmail_Id("moni@gmail");
		contacts10.setName("monisha");
		contacts10.setPhone(3458234489l);
		
		List<Contacts1> l=new ArrayList<Contacts1>();
		l.add(contacts8);
		l.add(contacts9);
		l.add(contacts10);
		
		//mappiny oneToMany
		whatsapp1.setContacts1s(l);
		
		//mapping ManyToOne
		contacts8.setWhatsapp1(whatsapp1);
		contacts9.setWhatsapp1(whatsapp1);
		contacts10.setWhatsapp1(whatsapp1);
		
		entityTransaction.begin();
		entityManager.persist(whatsapp1);
		entityManager.persist(contacts8);
		entityManager.persist(contacts9);
		entityManager.persist(contacts10);
		entityTransaction.commit();
		
		System.out.println("Bidirection is done");
		
}
}
