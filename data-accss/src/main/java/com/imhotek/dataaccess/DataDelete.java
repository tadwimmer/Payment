package com.imhotek.dataaccess;

import com.imhotek.model.Model;

public interface DataDelete<T extends Model> {

    boolean dekete(T t);
}
