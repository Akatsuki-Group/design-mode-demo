package org.example.specification.demo2;

public abstract class CompositeSpecification implements IUserSpecification {
    //是否满足条件由实现类实现
    @Override
    public abstract boolean isSatisfiedBy(User user);

    //and操作
    @Override
    public IUserSpecification and(IUserSpecification spec) {
        return new AndSpecification(this, spec);
    }

    //not操作
    @Override
    public IUserSpecification not() {
        return new NotSpecification(this);
    }

    //or操作
    @Override
    public IUserSpecification or(IUserSpecification spec) {
        return new OrSpecification(this, spec);
    }
}