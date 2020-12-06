package com.airbnb.authy.service.auth;

import com.airbnb.authy.model.AuthRequest;

public interface IAuthService {
    boolean isAuth(AuthRequest request);
}
