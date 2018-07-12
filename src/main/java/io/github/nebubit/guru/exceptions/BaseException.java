package io.github.nebubit.guru.exceptions;

public class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }

    public BaseException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BaseException(final String message) {
        super(message);
    }

    public BaseException(final Throwable cause) {
        super(cause);
    }
}