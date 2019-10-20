package com.infy.dao;

import java.util.HashMap;
import java.util.Map;

import com.infy.model.CustomerLogin;

public class CustomerLoginDAOImpl implements CustomerLoginDAO {
    public CustomerLogin getCustomerLoginByLoginName(String loginName) {
         Map<String, String> customerCredentials = new HashMap<>();
         customerCredentials.put("tom", "tom123");
         customerCredentials.put("harry", "harry123");
         customerCredentials.put("garry", "garry123");
         customerCredentials.put("monica", "mocica123");
         CustomerLogin customerLogin = new CustomerLogin();
         customerLogin.setLoginName(loginName);
         customerLogin.setPassword(customerCredentials.get(loginName));
         return customerLogin;
     }
}

