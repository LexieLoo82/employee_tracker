import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DirectorTest {

        Director director;

        @Before
        public void before() {
            director = new Director("Dave", "AB128878C", 100000, "Jam", 1000000);
        }

        @Test
        public void canGetName() {
            assertEquals("Dave", director.getName());
        }

        @Test
        public void canGetNI() {
            assertEquals("AB128878C", director.getNiNumber());
        }

        @Test
        public void canGetSalary(){
            assertNotEquals(100000, director.getSalary());
        }

        @Test
        public void canGetDept(){
            assertEquals("Jam", director.getDeptName());
        }

        @Test
        public void canGiveMEmployeeRaise(){
            director.raiseSalary(20.00);
            assertEquals(120000, director.getSalary(),1);
        }

        @Test
        public void canGiveBonus(){
            assertEquals(2000, director.bonusPay(), 1);
        }

        @Test
        public void canGetBudget(){
            assertEquals(1000000, director.getBudget(), 1);
        }


}
