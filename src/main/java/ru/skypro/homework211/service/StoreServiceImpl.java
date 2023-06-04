package ru.skypro.homework211.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class StoreServiceImpl implements StoreService {

    private final Cart cart;
    public StoreServiceImpl(Cart cart){
        this.cart = cart;
    }
    @Override
    public Set<Integer> add(List<Integer> ids) {
        return cart.add(ids);
    }

    @Override
    public Set<Integer> get() {
        return cart.get();
    }
}
