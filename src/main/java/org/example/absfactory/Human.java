package org.example.absfactory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 定义一个人类的统称
 */
public interface Human {
    /**
     * 人是愉快的，会笑的，本来是想用smile表示，想了一下laugh更合适，好长时间没有大笑了；
     */
    void laugh();

    /**
     * 人类还会哭，代表痛苦
     */
    void cry();

    /**
     * 人类会说话
     */
    void talk();

    /**
     * 定义性别
     */
    void sex();

}