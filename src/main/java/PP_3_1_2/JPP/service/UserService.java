package PP_3_1_2.JPP.service;

import PP_3_1_2.JPP.models.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    void removeUserById(Long id);
    User findUser(Long id);
    void update(User changedUser);



}
