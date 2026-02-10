

package pgrm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class resulttest {
@Test
public void testeven() {
	Assert.assertEquals(result.display(20),"even");
	
}
@Test
public void testodd() {
	Assert.assertEquals(result.display(21),"odd");
	
	
}
}
