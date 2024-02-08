package unasat.service;

import unasat.Entity.Brillen;

import java.util.ArrayList;
import java.util.List;
public interface Helper<T> {

        void display(ArrayList<T> itemlist);
        void insert(T item);
        Integer findMin(List<Integer> list);
        Integer findMax(List<Integer> list);
    }


