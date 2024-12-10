package org.skypro2._1.Spring.service;

import java.util.List;

public interface CartService {

    List<Integer> addItems(List<Integer> ids);

    List<Integer> getItems();

    List<Integer> removeItems(List<Integer> ids);
}