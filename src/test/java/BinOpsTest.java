import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: BinOps")
public class BinOpsTest {

    private final BinOps binOps = new BinOps();

    @Test
    @DisplayName("Тестирование метода расчета суммы")
    void sum() {
        Assertions.assertEquals("1001", binOps.sum("100", "101"));
    }

    @Test
    @DisplayName("Тестирование метода расчета произведения")
    void mult() {
        Assertions.assertEquals("10010", binOps.mult("11", "110"));
    }
}
