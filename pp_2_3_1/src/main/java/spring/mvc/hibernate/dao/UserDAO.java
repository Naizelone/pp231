package spring.mvc.hibernate.dao;

import spring.mvc.hibernate.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public void deleteUser(int id);

    public User getUser(int id);
}
