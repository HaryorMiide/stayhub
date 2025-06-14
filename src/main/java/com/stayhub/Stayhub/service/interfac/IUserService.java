package com.stayhub.Stayhub.service.interfac;

import com.stayhub.Stayhub.dto.LoginRequest;
import com.stayhub.Stayhub.dto.Response;
import com.stayhub.Stayhub.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}