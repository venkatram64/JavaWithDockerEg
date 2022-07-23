package com.venkat.web.service;

import com.venkat.web.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;
import java.util.List;

public class EmpService implements Serializable {
    private static Logger logger = LogManager.getLogger(EmpService.class);
    /*@PersistenceUnit(name="myPU")
    private EntityManagerFactory emf;
*/
    public void createEmp(Employee emp){
        logger.info("createEmp method is called...");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
    }

    public List<Employee> getEmployees(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        List<Employee> employees = em.createQuery("select e from Employee e", Employee.class)
                .getResultList();
        return employees;
    }
}
