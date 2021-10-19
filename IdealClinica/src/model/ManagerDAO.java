package model;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class ManagerDAO {

	    EntityManagerFactory factory;
	    EntityManager em;

	    public ManagerDAO() {
	        if (factory == null){
	            factory = Persistence.createEntityManagerFactory("IdealClinica");
	        }
	        if(em == null) {
	            em = factory.createEntityManager();
	        }
	    }
	}