package com.codegym.repository;

import com.codegym.model.blog;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<blog> findAll() {
        TypedQuery<blog> query = em.createQuery("select c from blog c", blog.class);
        return query.getResultList();
    }

    @Override
    public blog findById(Long id) {
        TypedQuery<blog> query = em.createQuery("select c from blog c where  c.id=:id", blog.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(blog model) {
        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        blog blog = findById(id);
        if(blog != null){
            em.remove(blog);
        }
    }
}
