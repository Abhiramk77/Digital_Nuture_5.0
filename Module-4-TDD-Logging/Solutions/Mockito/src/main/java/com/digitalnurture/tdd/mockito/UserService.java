package com.digitalnurture.tdd.mockito;

/**
 * UserService class that depends on UserRepository.
 */
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Gets user profile greeting. Throws IllegalArgumentException if user does not exist.
     */
    public String getUserGreeting(long id) {
        if (!userRepository.existsById(id)) {
            throw new IllegalArgumentException("User with ID " + id + " does not exist.");
        }
        String username = userRepository.findUsernameById(id);
        return "Hello, " + username + "!";
    }
}
