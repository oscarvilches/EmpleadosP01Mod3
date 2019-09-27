package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Oscar Vilches
 */
public class ModificarTest {

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Empleado obj = new Empleado("11111111", "Anita Maria", 52, 16);
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = true;
        boolean result = instance.Modificar(obj);
        assertEquals(expResult, result);
    }
}
