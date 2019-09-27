package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Oscar Vilches
 */
public class BuscarTest {

    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "11111111";
        BussEmpleado instance = new BussEmpleado();
        String expResult = rut;
        String result = instance.Buscar(rut).getRut();
        assertEquals(expResult, result);
    }
}
