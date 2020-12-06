package com.airbnb.authy.service.auth.impl;

import com.airbnb.authy.model.AuthRequest;
import com.airbnb.authy.service.auth.IAuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthService {

    @Override
    public boolean isAuth(AuthRequest request) {
        return true;
    }
}
