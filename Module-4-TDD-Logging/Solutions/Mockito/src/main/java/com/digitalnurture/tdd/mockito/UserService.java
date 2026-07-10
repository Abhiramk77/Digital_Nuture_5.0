package com.digitalnurture.tdd.mockito;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserGreeting(long id) {
        if (!userRepository.existsById(id)) {
            throw new IllegalArgumentException("User with ID " + id + " does not exist.");
        }
        String username = userRepository.findUsernameById(id);
        return "Hello, " + username + "!";
    }
}
