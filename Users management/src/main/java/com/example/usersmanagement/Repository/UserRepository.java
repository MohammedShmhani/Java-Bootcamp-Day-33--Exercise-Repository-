package com.example.usersmanagement.Repository;

import com.example.usersmanagement.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    User findUserByID(Integer id);

    @Query("SELECT u FROM User u WHERE u.ID=?1 ")
    User getUserByUsingId(Integer id);

    //*****************************************************************************
    //• Check if username and password are correct
    @Query("SELECT u FROM User u WHERE u.username=?1 AND u.password=?2")
    User checkUsernameAndPasswordAreCorrect(String username, String password);

    //Helping Method
    User findUserByUsername(String username);

    //• Check if username and password are correct
    User findByUsernameAndPassword(String username, String password);
    //*****************************************************************************


    //*****************************************************************************


    //• Get user by email
    @Query("SELECT u FROM User u WHERE u.email=?1 ")
    User getUserByUsingEmail(String email);

    User findUserByEmail(String email);

    //*****************************************************************************


    //*****************************************************************************


    //• Get All users with specific role
    @Query("select u from User  u WHERE u.role=?1 ")
    List<User> getUsesByRolee(String role);

    List<User> findUserByRole(String role);


    //*****************************************************************************


    //*****************************************************************************

    //• Get All users with specific age or above
    @Query("SELECT u FROM User u WHERE u.age >= ?1")
    List<User> getAllUsersWithAgeAbove(Integer age);

    List<User> findByAgeGreaterThanEqual(Integer age);

    //*****************************************************************************

}
