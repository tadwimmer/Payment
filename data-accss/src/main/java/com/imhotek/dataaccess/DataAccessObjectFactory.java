package com.imhotek.dataaccess;

public class DataAccessObjectFactory {

    private static DataAccessObjectFactory instance;

    public static DataAccessObjectFactory getInstance() {
        return instance;
    }

    private DataAccessObjectFactory() {

    }
}
