package org.skypro2._1.Spring.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addItem(List<Integer> idList) {
        items.addAll(idList);
        return idList;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }


    public List<Integer> removeItem(List<Integer> idList) {
        items.removeIf(idList::contains);
        return items;
    }
}