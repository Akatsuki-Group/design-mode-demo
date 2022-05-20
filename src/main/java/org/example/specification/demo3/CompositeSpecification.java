package org.example.specification.demo3;


public abstract class CompositeSpecification implements ISpecification {
    //是否满足条件由实现类实现
    @Override
    public abstract boolean isSatisfiedBy(Object candidate);

    //and操作
    @Override
    public ISpecification and(ISpecification spec) {
        return new AndSpecification(this, spec);
    }

    //not操作
    @Override
    public ISpecification not() {
        return new NotSpecification(this);
    }

    //or操作
    @Override
    public ISpecification or(ISpecification spec) {
        return new OrSpecification(this, spec);
    }
}
