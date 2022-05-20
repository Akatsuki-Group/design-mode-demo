package org.example.specification.demo1;

import org.example.specification.demo1.IUserSpecification;

import java.util.ArrayList;

public class UserProvider implements IUserProvider {
    //用户列表
    private ArrayList<User> userList;

    //传递用户列表
    public UserProvider(ArrayList<User> _userList) {
        this.userList = _userList;
    }

    //根据指定的规格书查找用户
    @Override
    public ArrayList<User> findUser(IUserSpecification userSpec) {
        ArrayList<User> result = new ArrayList<User>();
        for (User u : userList) {
            if (userSpec.isSatisfiedBy(u)) {//符合指定规格
                result.add(u);
            }
        }
        return result;
    }
}
