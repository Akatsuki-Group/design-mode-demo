package org.example.specification.demo1;

public class UserByAgeThan implements IUserSpecification {
    //基准年龄
    private int age;

    //构造函数传递基准年龄
    public UserByAgeThan(int _age) {
        this.age = _age;
    }

    //检验用户是否满足条件
    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getAge() > age;
    }
}