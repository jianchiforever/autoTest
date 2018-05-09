package page;

import org.openqa.selenium.By;

/**
 * Created by new on 2018/5/8.
 */
public class PagePostReplies {
    //     点击默认板块
    public static final By LOGIN_LINK_BANKUAI=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    //     快速发帖
    public static final By LOGIN_TEXT_FATEI=By.id("subject");
    //     帖子内容
    public static final By LOGIN_TEXT_NEIRONG=By.id("fastpostmessage");
    //     发表帖子
    public static final By LOGIN_LINK_FABIAO=By.id("fastpostsubmit");
    //     回复
    public static final By LOGIN_LINK_HUIFU=By.xpath("//*[@id=\"post_reply\"]/img");
    //     回复内容
    public static final By LOGIN_TEXT_HUIF=By.id("postmessage");
    //     点击回复主题
    public static final By LOGIN_LINK_ZHUTI=By.xpath("//*[@id=\"postsubmit\"]/span");
    //     发帖方法

}
