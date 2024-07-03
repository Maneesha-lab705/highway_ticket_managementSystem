package lk.ijse.user_service.service.impl;

import lk.ijse.user_service.convertion.ConvertionData;
import lk.ijse.user_service.dto.SingUp;
import lk.ijse.user_service.entity.UserEntity;
import lk.ijse.user_service.repository.UserRepository;
import lk.ijse.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {
    private final UserRepository userRepository;
    private final ConvertionData convertionData;

    @Override
    public String registerUser(SingUp signUp) throws Exception {
        try {
            UserEntity user = userRepository.save(convertionData.convertToUserEntity(signUp));
                   return "Saved userId :"+user.getId();
        }catch (DataIntegrityViolationException exception){
            throw new Exception("user already Exist ");
        }
   }
}
