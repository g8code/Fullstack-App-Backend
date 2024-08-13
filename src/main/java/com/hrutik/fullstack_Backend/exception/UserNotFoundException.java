package com.hrutik.fullstack_Backend.exception;

import com.hrutik.fullstack_Backend.repository.UserRepository;

public class UserNotFoundException extends RuntimeException {
   public UserNotFoundException(Long id){
       super("Could not found the user with id!!"+id);
   }
}
