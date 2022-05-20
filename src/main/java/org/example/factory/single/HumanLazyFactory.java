package org.example.factory.single;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
@SuppressWarnings("all")
public class HumanLazyFactory {
    //定义一个MAP,初始化过的Human对象都放在这里
    private static HashMap<String, Human> humans = new HashMap<String, Human>();

    //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {
        Human human = null; //定义一个类型的人类

        try {
            //如果MAP中有，则直接从取出，不用初始化了
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                //放到MAP中
                humans.put(c.getSimpleName(), human);
            }
        } catch (InstantiationException e) {
            System.out.println("必须指定人种的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误！");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人种找不到！");
        }
        return human;
    }

} 