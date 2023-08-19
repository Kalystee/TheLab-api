package com.kalystee.thelab.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Collection<User> getAll(){
        return userRepository.findAll();
    }

//    public Optional<User> getByUsernameAndPassword(String username,)


}
