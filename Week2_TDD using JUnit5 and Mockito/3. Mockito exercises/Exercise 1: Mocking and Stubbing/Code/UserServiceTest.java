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
}
