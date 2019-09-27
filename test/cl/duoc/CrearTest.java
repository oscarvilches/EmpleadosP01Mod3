package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Oscar Vilches
 */
public class CrearTest {
    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado obj = new Empleado("12345678-5", "Pepe", 35, 2);
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = true;
        boolean result = instance.Crear(obj);
        assertEquals(expResult, result);
    }
}
