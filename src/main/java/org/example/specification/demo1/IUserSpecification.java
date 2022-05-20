package org.example.specification.demo1;

public interface IUserSpecification {
    //候选者是否满足要求
    public boolean isSatisfiedBy(User user);
}