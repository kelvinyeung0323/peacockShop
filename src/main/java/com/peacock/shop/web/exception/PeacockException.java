package com.peacock.shop.web.exception;

/**
 * Created by Kelvin Yeung on 2018/7/10.
 */
public class PeacockException extends RuntimeException {

    public PeacockException() {
        super();
    }

    public PeacockException(String message) {
        super(message);
    }

    public PeacockException(String message, Throwable cause) {
        super(message, cause);
    }

    public PeacockException(Throwable cause) {
        super(cause);
    }

    protected PeacockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
