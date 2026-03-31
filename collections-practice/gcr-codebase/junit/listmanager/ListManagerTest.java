package junit.listmanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    //method to verify the element is added in the list or not
    @Test
    public void testAddElement(){
        ListManager lm = new ListManager();
        List<Integer> list = new ArrayList<>();

        lm.addElement(list,10);
        assertTrue(list.contains(10));
    }

// method to verify the element is removed or not
    @Test
    public void testRemoveElement(){
        ListManager lm = new ListManager();
        List<Integer> list = new ArrayList<>();

        list.add(5);
        lm.removeElement(list,5);

        assertFalse(list.contains(5));
    }

// method to check the size of the list
    @Test
    public void testGetSize(){
        ListManager lm = new ListManager();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3,lm.getSize(list));
    }
}
