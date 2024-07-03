package lk.ijse.user_service.convertion;

import lk.ijse.user_service.dto.SingUp;
import lk.ijse.user_service.entity.UserEntity;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConvertionData {

    final private ModelMapper modelMapper;
    public UserEntity convertToUserEntity(SingUp signUp){
        return modelMapper.map(signUp, UserEntity.class);
    }
}
