package bidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverBi {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		FollowersBi F1=new FollowersBi();
		F1.setProfile_name("Deeps_Deepu");
		F1.setName("deepu");
		F1.setPost(3);
		F1.setHighlights("nice");
		
		FollowersBi F2=new FollowersBi();
		F2.setProfile_name("Illuminate");
		F2.setName("Lochu");
		F2.setPost(22);
		F2.setHighlights("nice");
		
		FollowersBi F3=new FollowersBi();
		F3.setProfile_name("CrazyBoy");
		F3.setName("Vinay");
		F3.setPost(32);
		F3.setHighlights("nice");
		
		FollowersBi F4=new FollowersBi();
		F4.setProfile_name("Nithin_Nithu");
		F4.setName("nithin");
		F4.setPost(6);
		F4.setHighlights("nice");
		
		FollowersBi F5=new FollowersBi();
		F5.setProfile_name("Sanjuevent");
		F5.setName("Chandu");
		F5.setPost(10);
		F5.setHighlights("nice");
		
		FollowingBi C1=new FollowingBi();
		C1.setProfile_name("Karthik_MP");
		C1.setPost(11);
		C1.setCommends("Nice");
		
		FollowingBi C2=new FollowingBi();
		C2.setProfile_name("Vinay_MP");
		C2.setPost(12);
		C2.setCommends("Good");
		
		FollowingBi C3=new FollowingBi();
		C3.setProfile_name("Srivas_Boys");
		C3.setPost(13);
		C3.setCommends("Fabul...");
		
		FollowingBi C4=new FollowingBi();
		C4.setProfile_name("RoyalBoy");
		C4.setPost(14);
		C4.setCommends("L...");
		
		List<FollowingBi> L1=new ArrayList<FollowingBi>();
		L1.add(C1);
		L1.add(C2);
		L1.add(C3);
		L1.add(C4);
		
		List<FollowingBi> L2=new ArrayList<FollowingBi>();
		L2.add(C1);
		L2.add(C2);
		L2.add(C4);
		
		List<FollowingBi> L3=new ArrayList<FollowingBi>();
		L3.add(C1);
		L3.add(C4);
		
		List<FollowingBi> L4=new ArrayList<FollowingBi>();
		L4.add(C2);
		L4.add(C3);
		L4.add(C4);
		
		List<FollowersBi> A1=new ArrayList<FollowersBi>();
		A1.add(F1);
		A1.add(F3);
		A1.add(F5);
		A1.add(F4);
		
		List<FollowersBi> A2=new ArrayList<FollowersBi>();
		A2.add(F1);
		A2.add(F4);
		A2.add(F5);
		
		List<FollowersBi> A3=new ArrayList<FollowersBi>();
		A3.add(F1);
		A3.add(F3);
		A3.add(F2);
		
		List<FollowersBi> A4=new ArrayList<FollowersBi>();
		A4.add(F1);
		A4.add(F3);
		A4.add(F5);
		A4.add(F3);
		A4.add(F2);
		
		List<FollowersBi> A5=new ArrayList<FollowersBi>();
		A5.add(F1);
		A5.add(F3);
		A5.add(F5);
		A5.add(F2);
		
		
		//Mapping
		
		F1.setFollowingBi(L1);
		F2.setFollowingBi(L2);
		F3.setFollowingBi(L3);
		F4.setFollowingBi(L4);
		
		C1.setFollowersBi(A1);
		C2.setFollowersBi(A2);
		C3.setFollowersBi(A3);
		C4.setFollowersBi(A4);
	
		entityTransaction.begin();
		entityManager.persist(F1);
		entityManager.persist(F2);
		entityManager.persist(F3);
		entityManager.persist(F4);
		entityManager.persist(F5);
		entityManager.persist(C1);
		entityManager.persist(C2);
		entityManager.persist(C3);
		entityManager.persist(C4);
		entityTransaction.commit();
		
		System.out.println("Bidirection is done");
		
	}
}
