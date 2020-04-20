package com.xcs.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author xcs
 * @create 2020-04-18 9:54
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
