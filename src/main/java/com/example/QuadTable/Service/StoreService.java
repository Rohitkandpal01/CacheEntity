package com.example.QuadTable.Service;

import com.example.QuadTable.Model.Store;
import com.example.QuadTable.Repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    @CacheEvict(value = "stores",allEntries = true)
    public Store createStoreDetails(Store store) {
        return storeRepository.save(store);
    }

    @CacheEvict(value = "stores",allEntries = true)
    public void delete(int store_id) {
        storeRepository.deleteById(store_id);
    }

    @Cacheable("stores")
    public List<Store> findAll() {
       return storeRepository.findAll();
    }
}
