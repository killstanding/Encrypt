package com.jerry.service;

import com.jerry.handler.Init;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.io.IOException;

/**
 * Created by Jerry on 15/12/15.
 * 监听器初始化基础数据
 */
public class InitListener implements HttpSessionListener,
        HttpSessionAttributeListener {
    private static final Logger logger = LoggerFactory
            .getLogger(InitListener.class);

    // 在session中添加对象时触发此操作
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
    // 删除session中添加对象时触发此操作
    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
    // 修改session中添加对象时触发此操作
    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    // 新建一个session时触发此操作
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        try {
            Init.getInstance();
        } catch (IOException e) {
            logger.error("Init fail", e);
            e.printStackTrace();
        }
    }
    // 销毁一个session时触发此操作
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {


    }
}
