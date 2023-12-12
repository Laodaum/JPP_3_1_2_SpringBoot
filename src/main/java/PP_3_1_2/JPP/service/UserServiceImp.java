package PP_3_1_2.JPP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import PP_3_1_2.JPP.dao.UserDao;
import PP_3_1_2.JPP.models.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {


   private UserDao userDao;

   @Autowired
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();

   }
   @Transactional
   @Override
   public void removeUserById(Long id) {
      userDao.removeUserById(id);
   }

   @Override
   public User findUser(Long id) {
     return userDao.findUser(id);
   }
   @Transactional
   @Override
   public void update(User changedUser) {
      userDao.update(changedUser);
   }


}
