package io.github.nebubit.guru.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends BaseException {
    public UserNotFoundException(Long userId) {
        super("could not find user '" + userId + "'.");
    }
}