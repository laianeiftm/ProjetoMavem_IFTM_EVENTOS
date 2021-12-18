package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Certificado;

public class CertificadoControle {
	private EntityManager em;

	public CertificadoControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos_bd");
		em = emf.createEntityManager();
	}

	public void inserir(Certificado obj) {

	   try {
           em.getTransaction().begin();
           em.persist(obj);
           em.getTransaction().commit();
        } catch (Exception ex) {
           ex.printStackTrace();
           em.getTransaction().rollback();
        }
	}

	public void alterar(Certificado obj) {
		 try {
	            em.getTransaction().begin();
	            em.merge(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

	}

	public void excluir(Certificado obj) {
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
	           Certificado obj = buscarPorId(id);
	            excluir(obj);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}

	public Certificado buscarPorId(Integer id) {
		return em.find(Certificado.class, id);
	}

	public List<Certificado> buscarTodos() { 
		String nomeClasse = Certificado.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}

}
