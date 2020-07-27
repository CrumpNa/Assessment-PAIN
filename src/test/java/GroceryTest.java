import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class GroceryTest {


    @Test

    public void fileTest() throws FileNotFoundException {
        GroceryItems groceryItems= new GroceryItems();

    String expected = "name";
    String actual =groceryItems.inFile(); //

        Assert.assertEquals(expected,actual);
}


    public void
}
