package com.tortoiselala.common.exception;

/**
 * 统一的参数异常
 * 该异常包含了常见的参数异常类型，包括参数缺失，参数不合法等
 * 该异常继承于CommonRuntimeException一般情况下由统一异常处理回调捕获并转换
 * @author tortoiselala
 */
public class IllegalArgumentException extends CommonRuntimeException{
    public IllegalArgumentException() {
    }

    public IllegalArgumentException(String message) {
        super(message);
    }

    public IllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalArgumentException(Throwable cause) {
        super(cause);
    }

    public IllegalArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * 空参数异常
     * @return IllegalArgumentException实例
     */
    public static IllegalArgumentException empty () {
       return empty(null);
    }

    /**
     * 空参数异常
     * @param description 参数描述
     * @return IllegalArgumentException实例
     */
    public static IllegalArgumentException empty (String description) {
        description = null == description ? "参数" : description;
        return new IllegalArgumentException(String.format("%s为空", description));
    }

    /**
     * 参数不是合法范围
     * @return IllegalArgumentException实例
     */
    public static IllegalArgumentException outOfRange () {
        return outOfRange(null);
    }

    /**
     * 参数不是合法范围
     * @param description 参数描述
     * @return IllegalArgumentException实例
     */
    public static IllegalArgumentException outOfRange (String description) {
        description = null == description ? "参数" : description;
        return new IllegalArgumentException(String.format("%s不是合法范围", description));
    }
}
