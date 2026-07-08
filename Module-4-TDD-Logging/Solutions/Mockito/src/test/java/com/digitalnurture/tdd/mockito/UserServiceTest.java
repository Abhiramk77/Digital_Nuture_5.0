package com.digitalnurture.tdd.mockito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Mockito test class verifying UserService behavior by mocking UserRepository dependencies.
 */
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    @DisplayName("Test successful retrieval of user greeting")
    void testGetUserGreeting_Success() {
        // Stubbing repository calls
        when(userRepository.existsById(101L)).thenReturn(true);
        when(userRepository.findUsernameById(101L)).thenReturn("AbhiRam");

        // Execute service method
        String greeting = userService.getUserGreeting(101L);

        // Assert results
        assertEquals("Hello, AbhiRam!", greeting);
        
        // Verify repository interactions
        verify(userRepository, times(1)).existsById(101L);
        verify(userRepository, times(1)).findUsernameById(101L);
    }

    @Test
    @DisplayName("Test exception raised when user does not exist")
    void testGetUserGreeting_UserNotFound() {
        // Stubbing repository call
        when(userRepository.existsById(999L)).thenReturn(false);

        // Asserting exception thrown
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userService.getUserGreeting(999L);
        });
        assertEquals("User with ID 999 does not exist.", exception.getMessage());

        // Verify repository interactions
        verify(userRepository, times(1)).existsById(999L);
        verify(userRepository, never()).findUsernameById(anyLong());
    }
}
