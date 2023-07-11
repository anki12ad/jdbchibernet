package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Pancard;

public class AccesspanObject {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void insert(Pancard pancard){
		entityTransaction.begin();
		entityManager.persist(pancard);
		entityTransaction.commit();
		System.out.println("The values are updated");
	}
	public void update(int id,String name,long phone){
		Pancard pancard=entityManager.find(Pancard.class, id);
		pancard.setName(name);
		pancard.setPhone(phone);
		entityTransaction.begin();
		entityManager.merge(pancard);
		entityTransaction.commit();
		System.out.println("the values are updated");
		
	}
	public void fetch(int id){
		Pancard pancard=entityManager.find(Pancard.class, id);
		System.out.println("id:"+pancard.getId()+" "+"name:"+pancard.getName()+" "+"phone:"+pancard.getPhone());
	}
	public void delete(int id){
		Pancard pancard=entityManager.find(Pancard.class, id);
		entityTransaction.begin();
		entityManager.remove(pancard);
		entityTransaction.commit();
		System.out.println("the values are deleted");
	}
}
