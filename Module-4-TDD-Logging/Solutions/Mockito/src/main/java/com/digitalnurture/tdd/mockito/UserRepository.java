package com.digitalnurture.tdd.mockito;

public interface UserRepository {
    String findUsernameById(long id);
    boolean existsById(long id);
}
