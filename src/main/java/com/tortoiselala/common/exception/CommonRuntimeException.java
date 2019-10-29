package com.tortoiselala.common.exception;

/**
 * 该类为所有的项目中自定义非受查异常的父类。
 *
 * 该类的所有子类异常将由统一异常处理回调处理。
 * @author tortoiselala
 */
public class CommonRuntimeException extends RuntimeException {
    public CommonRuntimeException() {
        super();
    }

    public CommonRuntimeException(String message) {
        super(message);
    }

    public CommonRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommonRuntimeException(Throwable cause) {
        super(cause);
    }

    protected CommonRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
