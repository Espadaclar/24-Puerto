

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VeleroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VeleroTest
{
    private Persona persona1;
    private Velero velero1;

    /**
     * Default constructor for test class VeleroTest
     */
    public VeleroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        persona1 = new Persona("Lucio Carballo", "20978336K");
        velero1 = new Velero("AA-34719.sdc", 23, 1999, persona1, 4);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
