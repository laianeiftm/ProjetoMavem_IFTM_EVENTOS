package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Categoria;
import model.Profissional;

public class ProfissionalControle {
	private EntityManager em;

	public ProfissionalControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos_bd");
		em = emf.createEntityManager();
	}

	public void inserir(Profissional obj) {

	   try {
           em.getTransaction().begin();
           em.persist(obj);
           em.getTransaction().commit();
        } catch (Exception ex) {
           ex.printStackTrace();
           em.getTransaction().rollback();
        }
	}

	public void alterar(Profissional obj) {
		 try {
	            em.getTransaction().begin();
	            em.merge(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

	}

	public void excluir(Profissional obj) {
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
	           Profissional obj = buscarPorId(id);
	            excluir(obj);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}

	public Profissional buscarPorId(Integer id) {
		return em.find(Profissional.class, id);
	}

	public List<Profissional> buscarTodos() { 
		String nomeClasse = Profissional.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}

}
