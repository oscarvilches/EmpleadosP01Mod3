package cl.duoc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Oscar Vilches
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    cl.duoc.CrearTest.class,
    cl.duoc.BuscarTest.class,
    cl.duoc.ModificarTest.class,
    cl.duoc.EliminarTest.class,
    cl.duoc.MontoBonoTest.class})
public class AllTests {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
