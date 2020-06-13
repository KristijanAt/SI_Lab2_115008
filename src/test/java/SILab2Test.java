import org.junit.Test;

import static org.junit.Assert.*;


public class SILab2Test {

    @Test
    public void test1(){
        User user = new User("Kristijan","LabaratoriskaVezba!23","kristijanmkd93@gmail.com");
        assertTrue(SILab2.function(user));
    }


    @Test
    public void test2(){
        User user = null;
        assertFalse(SILab2.function(user));

        User user1 = new User("Kristijan","LabaratoriskaVezba!23","kristijanmkd93@gmail.com");
        assertTrue(SILab2.function(user1));

        User user2 = new User("Kristijan",null,"kristijanmkd93@gmail.com");
        assertFalse(SILab2.function(user2));
        User user3 = new User(null,"Password","kristijanmkd93@gmail.com");
        assertFalse(SILab2.function(user3));

        User user4 = new User("Kristijan","Kristijan!23123","kristijanmkd93@gmail.com");
        assertFalse(SILab2.function(user4));
        User user5 = new User("Kristijan","Lab123","kristijanmkd93@gmail.com");
        assertFalse(SILab2.function(user5));
    }

}
