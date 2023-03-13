package spring.mvc.hibernate.service;

import spring.mvc.hibernate.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);

    public void deleteUser(int id);
    public User getUser(int id);
}
