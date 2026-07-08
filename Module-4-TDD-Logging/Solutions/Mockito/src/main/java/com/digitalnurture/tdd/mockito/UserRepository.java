package com.digitalnurture.tdd.mockito;

/**
 * UserRepository interface representing database repository access.
 */
public interface UserRepository {
    String findUsernameById(long id);
    boolean existsById(long id);
}
