package aqa_course.task6;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        User user = new User("ivan", "ivan@mail.com");
        session.persist(user);

        FruitBasket basket = new FruitBasket("citrus", true, user);
        session.persist(basket);

        tx.commit();

        List<User> users = session.createQuery("from User", User.class).list();
        System.out.println("users: " + users.size());

        session.close();
    }
}
