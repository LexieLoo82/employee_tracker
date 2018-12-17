import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Morgan Freeman", "SN009023C", 20000, "fish");
    }

    @Test
    public void canGetName() {
        assertEquals("Morgan Freeman", manager.getName());
    }

    @Test
    public void canGetNI() {
        assertEquals("SN009023C", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertNotEquals(20000, manager.getSalary());
    }

    @Test
    public void canGetDept(){
        assertEquals("fish", manager.getDeptName());
    }

    @Test
    public void canGiveMEmployeeRaise(){
        manager.raiseSalary(-20);
        assertEquals(20000, manager.getSalary(),1);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(200, manager.bonusPay(), 1);

    }



}