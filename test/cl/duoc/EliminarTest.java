package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Oscar Vilches
 */
public class EliminarTest {

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut = "22222222";
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = true;
        boolean result = instance.Eliminar(rut);
        assertEquals(expResult, result);
    }
}
