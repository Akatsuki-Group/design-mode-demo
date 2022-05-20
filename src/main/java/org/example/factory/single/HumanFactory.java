package org.example.factory.single;

import java.util.List;
import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 今天讲女娲造人的故事，这个故事梗概是这样的：
 * 很久很久以前，盘古开辟了天地，用身躯造出日月星辰、山川草木，天地一片繁华
 * One day，女娲下界走了一遭，哎！太寂寞，太孤独了，没个会笑的、会哭的、会说话的东东
 * 那怎么办呢？不用愁，女娲，神仙呀，造出来呀，然后捏泥巴，放八卦炉（后来这个成了太白金星的宝
 * 贝）中烤，于是就有了人：
 * 我们把这个生产人的过程用Java程序表现出来：
 */
public class HumanFactory {

    /**
     * 定一个烤箱，泥巴塞进去，人就出来，这个太先进了
     */
    public static Human createHuman(Class c) {
        //定义一个类型的人类
        Human human = null;
        try {
            //产生一个人种
            human = (Human) Class.forName(c.getName()).newInstance();

        } catch (InstantiationException e) {
            System.out.println("必须指定人种的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误！");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人种找不到！");
        }
        return human;
    }

    /**
     * 女娲生气了，把一团泥巴塞到八卦炉，哎产生啥人种就啥人种
     */
    public static Human createHuman() {
        Human human = null;

        //首先是获得有多少个实现类，多少个人种
        List<Class> concreteHumanList =
                ClassUtils.getAllClassByInterface(Human.class);
        //八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));
        return human;
    }

} 