package org.hmily.pattern.graphic.FactoryMethodPattern.jdbcFactory;

import java.util.Properties;

public class MySQLConnectionFactoryImpl implements ConnectionFactory{


    @Override
    public Connection create(Properties info) {
        return new MySQLConnection(info);
    }
}
