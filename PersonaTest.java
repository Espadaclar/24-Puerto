

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonaTest
{
    private Persona persona1;

    /**
     * Default constructor for test class PersonaTest
     */
    public PersonaTest()
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
