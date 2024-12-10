package org.skypro2._1.Spring.service;

import org.skypro2._1.Spring.component.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }
    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return cart.addItem(ids);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }

    @Override
    public List<Integer> removeItems(List<Integer> ids) {
        return cart.removeItem(ids);
    }
}