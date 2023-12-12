package PP_3_1_2.JPP.dao;

import PP_3_1_2.JPP.models.User;

import java.util.List;

public interface UserDao {


   void add(User user);
   List<User> listUsers();
   void removeUserById(Long id);
   User findUser(Long id);
   void update(User user);

}
