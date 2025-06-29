package com.example.mock1;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName(String userId) {
        User user = userRepository.findById(userId);
        return (user != null) ? user.getName() : "Unknown";
    }
}
