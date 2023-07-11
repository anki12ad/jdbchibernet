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
		
		
		Followers C1=new Followers();
		C1.setName("deepz");
		C1.setProfile_name("Deepz_Dimpu");
		C1.setPost(10);
		
		C1.setHighlights("Long drive");
		
		Followers C2=new Followers();
		C2.setName("Deelip");
		C2.setProfile_name("Dichha");
		C2.setPost(11);
		C2.setHighlights("Outing");
		
		Followers C3=new Followers();
		C3.setName("Nesara");
		C3.setProfile_name("Shilling tone");
		C3.setPost(7);
		C3.setHighlights("Swimming");
		
		Followers C4=new Followers();
		C4.setName("Vinay");
		C4.setProfile_name("Crazy_vini");
		C4.setPost(30);
		C4.setHighlights("Cricket");
		
		Followers C5=new Followers();
		C5.setName("Nithin");
		C5.setProfile_name("Nithin Nithu");
		C5.setPost(31);
		C5.setHighlights("Bike Riding");
		
		Following A1=new Following();
		A1.setProfile_name("Illuminate");
		A1.setPost(22);
		A1.setCommends("Nice");
		
		Following A2=new Following();
		A2.setProfile_name("ll_shinning_tone");
		A2.setPost(22);
		A2.setCommends("Nice");

		Following A3=new Following();
		A3.setProfile_name("Bhooms");
		A3.setPost(12);
		A3.setCommends("Fabules");

		Following A4=new Following();
		A4.setProfile_name("Crazy1");
		A4.setPost(23);
		A4.setCommends("Nice");
		
		List<Following> L1=new ArrayList<Following>();
		L1.add(A1);
		L1.add(A2);
		L1.add(A4);
		
		List<Following> L2=new ArrayList<Following>();
		L2.add(A1);
		L2.add(A3);
		L2.add(A4);
		
		List<Following> L3=new ArrayList<Following>();
		L3.add(A1);
		L3.add(A4);
		
		
		List<Following> L4=new ArrayList<Following>();
		L4.add(A1);
		L4.add(A2);
		L4.add(A3);
		L4.add(A4);
		
		List<Following> L5=new ArrayList<Following>();
		L5.add(A1);
		L5.add(A2);
		L5.add(A4);
		
		C1.setFollowing(L1);
		C2.setFollowing(L2);
		C3.setFollowing(L3);
		C4.setFollowing(L4);
		C5.setFollowing(L5);
		
		entityTransaction.begin();
		entityManager.persist(C1);
		entityManager.persist(C2);
		entityManager.persist(C3);
		entityManager.persist(C4);
		entityManager.persist(C5);
		entityManager.persist(A1);
		entityManager.persist(A2);
		entityManager.persist(A3);
		entityManager.persist(A4);
		entityTransaction.commit();
		
		System.out.println("Unidirection is done");
	}
}
