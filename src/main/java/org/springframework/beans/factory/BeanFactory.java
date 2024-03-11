package org.springframework.beans.factory;

import org.springframework.beans.BeanException;

import java.util.HashMap;
import java.util.Map;

public interface BeanFactory {

    /**
     * 获取bean
     *
     * @param name
     * @return
     */
    public Object getBean(String name) throws BeanException;
}
