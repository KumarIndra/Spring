package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.infy.dao.CustomerLoginDAO;
import com.infy.model.CustomerLogin;

public class CustomerLoginServiceImpl implements CustomerLoginService {
    @Autowired
    private CustomerLoginDAO customerLoginDao;
    public Boolean authenticateCustomerLogin(CustomerLogin customerLogin) {
         Boolean isValid = false;
         CustomerLogin customerLoginFromDao = customerLoginDao.getCustomerLoginByLoginName(customerLogin.getLoginName());
         if (customerLogin.getPassword().equals(customerLoginFromDao.getPassword()))
                 isValid = true;
            return isValid;
    }
}

