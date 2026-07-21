import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class LoggingDemoTest {

    @Test
    void shouldRunWithoutThrowingExceptions() {
        LoggingDemo loggingDemo = new LoggingDemo();
        assertDoesNotThrow(loggingDemo::run);
    }
}
