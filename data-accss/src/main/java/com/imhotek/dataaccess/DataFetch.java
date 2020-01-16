package com.imhotek.dataaccess;

import com.imhotek.model.Model;

import java.util.List;

public interface DataFetch<T extends Model> {

    T find(long id);

    List<T> findAll();

}
