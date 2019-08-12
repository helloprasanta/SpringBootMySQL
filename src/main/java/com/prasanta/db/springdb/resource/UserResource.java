package com.prasanta.db.springdb.resource;


import com.prasanta.db.springdb.model.Users;
import com.prasanta.db.springdb.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UserResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/add")
    public List<Users> insertUser(@RequestBody final Users users) {
        usersRepository.save(users);
        return usersRepository.findAll();
    }

    @PutMapping(value = "/update")
    public List<Users> updateUser() {
        return usersRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public List<Users> deleteUser(@PathVariable int id) {
        usersRepository.delete((int) id);
        return usersRepository.findAll();
    }


}
