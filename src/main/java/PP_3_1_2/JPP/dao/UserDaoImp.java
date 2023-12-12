package PP_3_1_2.JPP.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import PP_3_1_2.JPP.models.User;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;

   @Override
   public void add(User user) {
      entityManager.persist(user);
   }

   @Override
   @SuppressWarnings(value = "unchecked")
   public List<User> listUsers() {
      return entityManager.createQuery( "from User" ).getResultList();
   }

   @Override
   public void removeUserById(Long id) {
      entityManager.createQuery("DELETE User WHERE id = :id").setParameter("id",id).executeUpdate();
      }
   @Override
   public User findUser(Long id) {
      return entityManager.find(User.class, id );
   }
   @Override
   public void update(User user) {
      entityManager.merge(user);
   }


}
