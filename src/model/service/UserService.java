package model.service;

import model.User;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    List<UserDto>  addNewUser(User User);
    List<UserDto> deleteUser(Integer id);
}
