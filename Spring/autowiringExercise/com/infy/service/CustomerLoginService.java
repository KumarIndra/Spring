package com.infy.service;

import com.infy.model.CustomerLogin;

public interface CustomerLoginService {
    public Boolean authenticateCustomerLogin(CustomerLogin customerLogin) throws Exception;
}

