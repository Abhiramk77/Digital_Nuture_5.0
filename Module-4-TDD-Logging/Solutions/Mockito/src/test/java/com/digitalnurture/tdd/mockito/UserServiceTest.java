package com.digitalnurture.tdd.mockito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    @DisplayName("Test successful retrieval of user greeting")
    void testGetUserGreeting_Success() {
        when(userRepository.existsById(101L)).thenReturn(true);
        when(userRepository.findUsernameById(101L)).thenReturn("AbhiRam");

        String greeting = userService.getUserGreeting(101L);

        assertEquals("Hello, AbhiRam!", greeting);

        verify(userRepository, times(1)).existsById(101L);
        verify(userRepository, times(1)).findUsernameById(101L);
    }

    @Test
    @DisplayName("Test exception raised when user does not exist")
    void testGetUserGreeting_UserNotFound() {
        when(userRepository.existsById(999L)).thenReturn(false);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userService.getUserGreeting(999L);
        });
        assertEquals("User with ID 999 does not exist.", exception.getMessage());

        verify(userRepository, times(1)).existsById(999L);
        verify(userRepository, never()).findUsernameById(anyLong());
    }
}
