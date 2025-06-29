package com.example.mock1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Test
    void testGetUserName() {
        // Arrange (Mock + Stub)
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findById("123")).thenReturn(new User("123", "Alice"));

        UserService service = new UserService(mockRepo);

        // Act
        String result = service.getUserName("123");

        // Assert
        assertEquals("Alice", result);
        verify(mockRepo).findById("123"); // Verify interaction
    }

    @Test
    void testUserNotFound() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findById("999")).thenReturn(null);

        UserService service = new UserService(mockRepo);

        String result = service.getUserName("999");

        assertEquals("Unknown", result);
    }
    @Test
    void testVerifyInteractions() {
        // Arrange
        UserRepository mockRepo = mock(UserRepository.class);
        UserService service = new UserService(mockRepo);

        // Act
        service.findUserTwice("abc");

        // Assert - verify the method was called twice
        verify(mockRepo, times(2)).findById("abc");

        // Additional checks
        verify(mockRepo, never()).findById("xyz");
        verify(mockRepo, atLeastOnce()).findById("abc");
    }

}
