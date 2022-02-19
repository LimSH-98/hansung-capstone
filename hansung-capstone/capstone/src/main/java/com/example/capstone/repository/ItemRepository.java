package com.example.capstone.repository;

import com.example.capstone.domain.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class ItemRepository {
    private EntityManager em;


    public void save(Item item){
        if(item.getId() == null){
            em.persist(item);
        }else{
            em.merge(item);
        }
    }
    /**
    public ItemEntity findOne(Long id){
        return em.find(ItemEntity.class, id);
    }

    public List<ItemEntity> findAll(){
        return em.createQuery("select i from item i", ItemEntity.class)
                .getResultList();
    }
    **/
}
