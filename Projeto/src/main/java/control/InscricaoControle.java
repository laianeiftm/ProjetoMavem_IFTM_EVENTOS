package control;

import java.util.List;

import model.Categoria;
import model.Inscricao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class InscricaoControle {
	private EntityManager em; 

	public InscricaoControle () {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos_bd");
		em = emf.createEntityManager();
	}
	public void inserir(Inscricao obj) {
		   try {
	            em.getTransaction().begin();
	            em.persist(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

	}

	public void alterar(Inscricao obj) {
		 try {
	            em.getTransaction().begin();
	            em.merge(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

	}

	public void excluir(Inscricao obj) {
		try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

	}

	public void excluirPorId(Integer id) {
		   try {
	            Inscricao obj = buscarPorId(id);
	            excluir(obj);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}

	public Inscricao buscarPorId(Integer id) { 
		return em.find(Inscricao.class, id);
	}

	public List<Inscricao> buscarTodos() { 
		String nomeClasse = Inscricao.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}

}
	



