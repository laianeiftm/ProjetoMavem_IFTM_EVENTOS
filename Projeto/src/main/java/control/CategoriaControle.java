package control;

import java.util.List;
import model.Categoria;
import model.Inscricao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class CategoriaControle {
	private EntityManager em;

	public CategoriaControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos_bd");
		em = emf.createEntityManager();
	}

}

	public void inserir(Categoria obj) {
		   try {
	            em.getTransaction().begin();
	            em.persist(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

	}

	public void alterar(Categoria obj) {
		   try {
	            em.getTransaction().begin();
	            em.merge(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

	}

	public void excluir(Categoria obj) {
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
	           Categoria obj = buscarPorId(id);
	            excluir(obj);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }
	}

	public Categoria buscarPorId(Integer id) {
		return em.find(Categoria.class, id);
	}

	public List<Categoria> buscarTodos() {
		String nomeClasse = Categoria.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}
}
