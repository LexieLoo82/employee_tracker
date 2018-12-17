import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeveloperTest {


        Developer developer;

        @Before
        public void before() {
            developer = new Developer("Baz", "SN009023C", 20000);
        }

        @Test
        public void canGetName() {
            assertEquals("Baz", developer.getName());
        }

        @Test
        public void canGetNI() {
            assertEquals("SN009023C", developer.getNiNumber());
        }

        @Test
        public void canGetSalary(){
            assertNotEquals(20000, developer.getSalary());
        }


        @Test
        public void canGiveMEmployeeRaise(){
            developer.raiseSalary(20.00);
            assertEquals(24000, developer.getSalary(),1);
        }

        @Test
        public void canGiveBonus(){
            assertEquals(200, developer.bonusPay(), 1);

        }

        @Test
        public void canNotChangeNameToNul(){
            developer.setName(null);
            assertEquals("Baz", developer.getName());
        }
}
