package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager
    private EntityManager entityManager;
    // inject entity manager using constructor manager
    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    //implement save method
    @Override
    @Transactional
    public void save(Student theStudent){
      entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

        // create query
        // TypedQuery is a JPA interface (in jakarta.persistence) used to create and run database queries.
        // TypedQuery<Student> => A query object that will return a list of Student objects when executed.”
        //This is JPQL (Java Persistence Query Language), not plain SQL. "FROM Student" means =>
        // “Select all records from the Student entity.”
        // Student.class means => “The result of this query should be mapped into Student objects.”

      //  TypedQuery<Student> theQuery = entityManager.createQuery("From Student",Student.class);


        // This means “select all Student entities” (not the student table).
        //The JPA provider (like Hibernate) then converts this JPQL into the actual SQL for your database.

        //TypedQuery<Student> theQuery = entityManager.createQuery("From Student order by lastName asc", Student.class);

        TypedQuery<Student> theQuery = entityManager.createQuery("From Student ", Student.class);


        // return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName){

        // JPQL Parameters are prefixed with a colon :
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery
                ("From Student WHERE lastName=:theData",Student.class);

        // set query parameters
        theQuery.setParameter("theData",theLastName);

        // return query results
        return theQuery.getResultList();
    }
}
