package aily.server.service;

import aily.server.entity.MyPage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import aily.server.DTO.UserDTO;
import aily.server.entity.User;
import aily.server.repository.UserRepository;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void signUp(User user) {
        userRepository.save(user);
    }

    public String signIn(UserDTO params) {
        Optional<User> user = userRepository.findById(params.getId());
        if(user.isPresent()){
            UserDTO userDTO = UserDTO.toUserDTO(user.get());
            String dbPass = userDTO.getPassword();
            String inputPass = params.getPassword();
            System.out.println("db = " + dbPass);
            System.out.println("input = " + inputPass);
            if(dbPass.equals(inputPass)){
                return "all_ok";
            }
            return "id_ok";
        } else {
            return "id_fail";
        }
    }
}
