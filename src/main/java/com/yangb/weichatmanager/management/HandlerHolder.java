package com.yangb.weichatmanager.management;

/**
 * weichatmanager
 * create by YangBin on 2018/11/20
 * Copyright © 2017 YangBin. All rights reserved.
 */
public class HandlerHolder {

    /**
     * 事件处理器
     */
    private EventHandler eventHandler;

    private MsgHandler msgHandler;

    private static HandlerHolder holder;

    private HandlerHolder() {
    }

    public static HandlerHolder getInstance(){
        if(holder == null) {
            synchronized (HandlerHolder.class) {
                if (holder == null) {
                    holder = new HandlerHolder();
                }
            }
        }
        return holder;
    }

    /**
     * 注册事件处理器
     * @param handler
     */
    public void registEventHandler(EventHandler handler){
        this.eventHandler = handler;
    }

    /**
     * 注册消息处理器
     * @param handler
     */
    public void registMsgHandler(MsgHandler handler){
        this.msgHandler = handler;
    }

    /**
     * 是否存在事件处理器
     * @return
     */
    public boolean hasEventHandler(){
        return this.eventHandler != null;
    }

    /**
     * 是否存在消息处理器
     * @return
     */
    public boolean hasMsgHandler(){
        return this.msgHandler != null;
    }


    public EventHandler getEventHandler(){
        return this.eventHandler;
    }

    public MsgHandler getMsgHandler() {
        return msgHandler;
    }
}
