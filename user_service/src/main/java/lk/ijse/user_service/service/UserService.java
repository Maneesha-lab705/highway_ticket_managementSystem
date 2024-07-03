package lk.ijse.user_service.service;

import lk.ijse.user_service.dto.SingUp;

public interface UserService {
    String registerUser(SingUp signUp) throws Exception;
}
