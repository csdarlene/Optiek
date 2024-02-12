package unasat.service;

import unasat.Entity.Brillen;

import java.util.ArrayList;
import java.util.List;
public interface BrillenService {

        void display(ArrayList<Brillen> itemlist);
        void insert(Brillen item);
        Integer findMin(List<Integer> list);
        Integer findMax(List<Integer> list);
    }


