package org.example.specification.demo2;

public class UserByNameEqual extends CompositeSpecification {
    //基准姓名
    private String name;

    //构造函数传递基准姓名
    public UserByNameEqual(String _name) {
        this.name = _name;
    }

    //检验用户是否满足条件
    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getName().equals(name);
    }
}
