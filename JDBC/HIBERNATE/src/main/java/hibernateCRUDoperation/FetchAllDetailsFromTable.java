package hibernateCRUDoperation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

 class FetchAllDetailsFromTable {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query= entityManager.createQuery("select ct from CreateTable ct",CreateTable.class);
		List<CreateTable>lst=query.getResultList();
	
		for(CreateTable ct:lst){
			System.out.println("id :"+ct.getId()+" "+"name :"+ct.getName()+" "+"phone :"+ct.getPhone());
		}
		
}
}
