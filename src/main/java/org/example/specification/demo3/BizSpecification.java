package org.example.specification.demo3;

public class BizSpecification extends CompositeSpecification {
    //基准对象
    private Object obj;

    public BizSpecification(Object _obj) {
        this.obj = _obj;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
//根据基准对象和候选对象，进行业务判断，返回boolean
        return false;
    }
}
