package com.mars.start;

import com.mars.jdbc.load.InitJdbc;
import com.mars.start.base.BaseStartMars;
import com.mars.start.startmap.StartLoadList;

/**
 * 启动Mars框架
 * @author yuye
 *
 */
public class StartMars {
    /**
     * 启动Mars框架
     * @param clazz
     */
    public static void start(Class<?> clazz,String[] args){
        BaseStartMars.setStartList(StartLoadList.initStartList());

        if(args != null && args[0] != null){
            BaseStartMars.start(clazz,new InitJdbc(),args[0]);
        } else {
            BaseStartMars.start(clazz,new InitJdbc(),null);
        }
    }

    /**
     * 启动Mars框架
     * @param clazz
     */
    public static void start(Class<?> clazz){
        start(clazz,null);
    }
}
