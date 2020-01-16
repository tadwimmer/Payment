package com.imhotek.dataaccess;

import com.imhotek.model.Model;

public interface DataInsert<T extends Model> {

    boolean create(T t);

}
