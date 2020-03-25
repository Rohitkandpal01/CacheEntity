package com.example.QuadTable.Controller;

import com.example.QuadTable.Model.Employee;
import com.example.QuadTable.Model.Store;
import com.example.QuadTable.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Cacheable;
import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @PostMapping("/createStore")
    private Store createStore(@RequestBody Store store){
        return storeService.createStoreDetails(store);
    }

    @GetMapping("/getStore")
    public List<Store> findAll() {
        return storeService.findAll();
    }

    @DeleteMapping("/deleteEmployee")
    public void delete(@RequestParam("store_id")int store_id){
        storeService.delete(store_id);
    }


}
