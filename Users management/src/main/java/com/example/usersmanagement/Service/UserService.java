package com.example.usersmanagement.Service;

import com.example.usersmanagement.Api.ApiException;
import com.example.usersmanagement.Model.User;
import com.example.usersmanagement.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    //Get all the Users
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    //• Add new User
    public void addUser(User user) {
        userRepository.save(user);
    }

    //• Delete User
    public void deleteUser(Integer id) {
        User user = userRepository.findUserByID(id);
        if (user == null)
            throw new ApiException("User not found");
        userRepository.delete(user);

    }

    //• Update User
    public void updateUser(Integer id, User user1) {
        User user = userRepository.getUserByUsingId(id);
        if (user == null)
            throw new ApiException("User not found");
        user.setName(user1.getName());
        user.setUsername(user1.getUsername());
        user.setEmail(user1.getEmail());
        user.setPassword(user1.getPassword());
        user.setRole(user1.getRole());
        user.setAge(user1.getAge());
        userRepository.save(user);

    }

    //• Get user by email
    public User getUserByEmail(String email) {
        User user = userRepository.getUserByUsingEmail(email);
        if (user == null)
            throw new ApiException("User not found");
        return user;
    }

    //• Check if username and password are correct
    public void checkUsernameAndPasswordAreCorrect(String username, String password) {
        User user = userRepository.findUserByUsername(username);
        if (user == null)
            throw new ApiException("User not found");
        if (!user.getPassword().equals(password))
            throw new ApiException("Passwords do not match");

    }

    //• Get All users with specific role
    public List<User> getUsersByRole(String role) {
        List<User> users = userRepository.getUsesByRolee(role);
        if (users.isEmpty())
            throw new ApiException("User not found");
        return users;
    }

    //• Get All users with specific Age or above
    public List<User> getUsersByAgeOrAbove(Integer age) {
        List<User> users = userRepository.getAllUsersWithAgeAbove(age);
        if (users.isEmpty())
            throw new ApiException("User not found");
        return users;
    }


}
