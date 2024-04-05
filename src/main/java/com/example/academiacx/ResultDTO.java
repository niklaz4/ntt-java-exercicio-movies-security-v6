package com.example.academiacx;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class ResultDTO {

    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void populateUserDTOList(List<User> users, List<UserDTO> usersDTOS) {
        for (User user : users) {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            userDTO.setName(user.getName());
            userDTO.setUsername(user.getUsername());
            userDTO.setEmail(user.getEmail());
        }
    }

    private UserService userService;  // Corrected service type and name

    public ResponseEntity<UserDTO> getUserById(Long id) {

        User user = userService.findById(id);  // Now using the injected service
        UserDTO userDTO = new UserDTO();

        // Mapeando propriedades manualmente (assuming User has a property named "nome")
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());  // Assuming User has a property "nome"
        userDTO.setEmail(user.getEmail());

        return ResponseEntity.ok(userDTO);
    }
}