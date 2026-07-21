import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void shouldRegisterNewUser() {
        when(userRepository.existsByEmail("rahul@example.com")).thenReturn(false);

        assertTrue(userService.register("rahul@example.com"));
        verify(userRepository).existsByEmail("rahul@example.com");
        verify(userRepository).save("rahul@example.com");
    }

    @Test
    void shouldRejectExistingUser() {
        when(userRepository.existsByEmail("rahul@example.com")).thenReturn(true);

        assertFalse(userService.register("rahul@example.com"));
        verify(userRepository).existsByEmail("rahul@example.com");
        verify(userRepository, org.mockito.Mockito.never()).save("rahul@example.com");
    }

    @Test
    void shouldRejectBlankEmail() {
        assertFalse(userService.register("   "));
    }

    @Test
    void shouldRejectNullEmail() {
        assertFalse(userService.register(null));
    }
}
