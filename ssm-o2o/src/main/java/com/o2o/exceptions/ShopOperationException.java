package com.o2o.exceptions;


// 处理 关于shop操作 一切异常 的类
public class ShopOperationException extends RuntimeException{

    //msg：错误的信息
    public ShopOperationException(String msg){
        //调用父类的构造函数
        super(msg);
    }

}
