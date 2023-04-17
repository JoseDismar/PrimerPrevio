package co.ufps.primerprevio.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import co.ufps.primerprevio.modelo.Paciente;
import co.ufps.primerprevio.util.JpaUtil;

public class PacienteDao {
	
    public void insertPaciente() {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Paciente nuevoPaciente = new Paciente(1,"12222","Jose", "Carvajalino", "josecarvajalinogmail.com", 'M', "12/02/2022", 58, 160);
        entityManager.persist(nuevoPaciente);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


}
