package com.kalystee.thelab.user;

import lombok.Builder;

public record UserDto (String name){
    @Builder
    public UserDto{}
}
