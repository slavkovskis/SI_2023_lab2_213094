import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {

    @Test
    public void multipleConditionstest() {
        User TXX = new User(null, null, null);
        assertThrows(RuntimeException.class, () -> SILab2.function(TXX, null));

        User TXX2 = new User(null, "password", "slavkovskis@yahoo.com");
        assertThrows(RuntimeException.class, () -> SILab2.function(TXX2, null)); //istoto kako i TTX

        User FTX = new User("slave", null, null);
        assertThrows(RuntimeException.class, () -> SILab2.function(FTX, null));

        User FTX2 = new User("slave", null, "slavkovskis@yahoo.com");
        assertThrows(RuntimeException.class, () -> SILab2.function(FTX2, null)); //istoto kako i FTX

        User FFT = new User("slave", "password", null);
        assertThrows(RuntimeException.class, () -> SILab2.function(FFT, null));

        User FFF = new User("slave", "password", "slavkovskis@yahoo.com");
        assertDoesNotThrow(() -> SILab2.function(FFF, List.of(FFT, FFT, FFT)));
    }


}
