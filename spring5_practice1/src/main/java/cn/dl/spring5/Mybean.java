package cn.dl.spring5;

import org.springframework.beans.factory.FactoryBean;

public class Mybean implements FactoryBean<Dept> {
    @Override
    public Dept getObject() throws Exception {
        Dept dept = new Dept();
        dept.setDname("factory bean");
        return dept;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
