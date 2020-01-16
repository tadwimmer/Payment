package com.imhotek.dataaccess;

import com.imhotek.model.Model;

public interface DataUpdate<T extends Model> {

    boolean update(T t);
}
