import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void before() {
        admin = new DatabaseAdmin("Angus", "SN009023C", 20000);
    }

    @Test
    public void canGetName() {
        assertEquals("Angus", admin.getName());
    }

    @Test
    public void canGetNI() {
        assertEquals("SN009023C", admin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertNotEquals(20000, admin.getSalary());
    }


    @Test
    public void canGiveMEmployeeRaise(){
        admin.raiseSalary(20.00);
        assertEquals(24000, admin.getSalary(),1);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(200, admin.bonusPay(), 1);

    }
}
