package com.imhotek.dataaccess;

import com.imhotek.model.Model;

public interface DataAccessObject<T extends Model> extends DataInsert, DataFetch, DataUpdate, DataDelete {


}
