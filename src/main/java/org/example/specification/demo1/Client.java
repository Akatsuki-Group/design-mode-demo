package org.example.specification.demo1;

import java.util.ArrayList;

public class Client {
//    public static void main(String[] args) {
//        //首先初始化一批用户
//        ArrayList<User> userList = new ArrayList<User>();
//        userList.add(new User("苏大", 3));
//        userList.add(new User("牛二", 8));
//        userList.add(new User("张三", 10));
//        userList.add(new User("李四", 15));
//        userList.add(new User("王五", 18));
//        userList.add(new User("赵六", 20));
//        userList.add(new User("马七", 25));
//        userList.add(new User("杨八", 30));
//        userList.add(new User("侯九", 35));
//        userList.add(new User("布十", 40));
//        //定义一个用户查询类
//        IUserProvider userProvider = new UserProvider(userList);
//        //打印出年龄大于20岁的用户
//        System.out.println("===年龄大于20岁的用户===");
//        //定义一个规格书
//        IUserSpecification userSpec = new UserByAgeThan(20);
//        for (User u : userProvider.findUser(userSpec)) {
//            System.out.println(u);
//        }
//    }

//    public static void main(String[] args) {
//        //首先初始化一批用户
//        ArrayList<User> userList = new ArrayList<User>();
//        userList.add(new User("苏国庆", 23));
//        userList.add(new User("国庆牛", 82));
//        userList.add(new User("张国庆三", 10));
//        userList.add(new User("李四", 10));
//        //定义一个用户查询类
//        IUserProvider userProvider = new UserProvider(userList);
//        //打印出名字包含"国庆"的人员
//        System.out.println("===名字包含国庆的人员===");
//        //定义一个规格书
//        IUserSpecification userSpec = new UserByNameLike("%国庆%");
//        for (User u : userProvider.findUser(userSpec)) {
//            System.out.println(u);
//        }
//    }

    public static void main(String[] args) {
        //首先初始化一批用户
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("苏国庆", 23));
        userList.add(new User("国庆牛", 82));
        userList.add(new User("张国庆三", 10));
        userList.add(new User("李四", 10));
        //定义一个规格书
        IUserSpecification userSpec1 = new UserByNameLike("%国庆%");
        IUserSpecification userSpec2 = new UserByAgeThan(20);
        IUserProvider userProvider = new UserProvider(userList);
        userList = userProvider.findUser(userSpec1);
        for(User u:userProvider.findUser(userSpec2)){
            System.out.println(u);
        }
    }
}
