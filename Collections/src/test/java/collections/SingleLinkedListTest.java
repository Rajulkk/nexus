package collections;

import collections.core.List;
import collections.impl.SingleLinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SingleLinkedListTest
{
    List ll = null;

    @Before
    public void beforeTest()
    {
        ll = new SingleLinkedList();
        ll.add("Rajul");
        ll.add("Prabhakar");
        ll.add("Konkar");

        ll.show();
    }

    @After
    public void afterTest(){
        ll.show();
    }

    //@Test
    public void addTest()
    {
        System.out.println("AddTest");
    }

    @Test
    public void removeTest()
    {
        System.out.println("RemoveTest");
    }

    //@Test
    public void removeLastTest()
    {
        System.out.println("RemoveLastTest");
        ll.removeLast();
    }
}
