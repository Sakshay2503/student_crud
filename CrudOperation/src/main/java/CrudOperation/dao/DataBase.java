package CrudOperation.dao;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import CrudOperation.dto.Details;

public class DataBase {
	
	
	public EntityManager getEntityManager()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("akshay");
		EntityManager em=emf.createEntityManager();
		return em;
	}
	
	
	public Details add(Details details)
	{
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(details);
		et.commit();
		Details details2=em.find(Details.class,details.getId());
		return details2;
		
	}
	
	public List<Details> getAll()
	{
		EntityManager em=getEntityManager();
		Query query=em.createQuery("select details from Details details");
		List<Details> list=query.getResultList();
		for (Details details : list) 
		{
		
			System.out.println(details.getName());
			System.out.println(details.getAddress());
			System.out.println(details.getPhone());
		}
		return list;
	}
	
	public void update(Details details)
	{
		
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(details);
		et.commit();
		
	}
	
	public Details findById(int id) {
		
		EntityManager manager=getEntityManager();
		EntityTransaction et=manager.getTransaction();
		//Details details=new Details();
		//details=manager.find(Details.class, id);
		Query query=manager.createNativeQuery("Select * from details where id="+id, Details.class);
		et.begin();
			Details details2=(Details) query.getSingleResult();
		et.commit();
		System.out.println("------>>>"+details2.toString());
		return details2;
	}
	
	public void delete(int id)
	{
		EntityManager em=getEntityManager();
		EntityTransaction transaction=em.getTransaction();
		Query query=em.createNativeQuery("Delete from details where id="+id);
		transaction.begin();
		query.executeUpdate();
		transaction.commit();
		
	}

}
