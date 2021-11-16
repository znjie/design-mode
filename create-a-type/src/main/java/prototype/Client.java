package prototype;

import java.io.IOException;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Attachment previousAttachment = new Attachment();
        previousAttachment.setName("工作周报");

        WeeklyLog previousWeeklyLog = new WeeklyLog();
        previousWeeklyLog.setAttachment(previousAttachment);
        previousWeeklyLog.setName("刘坤");
        previousWeeklyLog.setDate(new Date());
        previousWeeklyLog.setContent("工作很忙");

        // 进行浅克隆
        System.out.println("进行浅克隆********");
        WeeklyLog shallowWeeklyLog = previousWeeklyLog.clone();
        Attachment shallowAttachment = shallowWeeklyLog.getAttachment();

        System.out.println("周报是否相等？ " + (previousWeeklyLog == shallowWeeklyLog));
        System.out.println("周报附件是否相等？   " + (previousAttachment == shallowAttachment));
        System.out.println("周报名称是否相等？   " + (previousWeeklyLog.getName() == shallowWeeklyLog.getName()));
        System.out.println("周报日期是否相等？   " + (previousWeeklyLog.getDate() == shallowWeeklyLog.getDate()));
        System.out.println("周报内容是否相等？   " + (previousWeeklyLog.getContent() == shallowWeeklyLog.getContent()));

        // 进行深克隆
        System.out.println("进行深克隆********");
        WeeklyLog deepWeeklyLog = previousWeeklyLog.deepClone();
        Attachment deepAttachment = deepWeeklyLog.getAttachment();

        System.out.println("周报是否相等？ " + (previousWeeklyLog == deepWeeklyLog));
        System.out.println("周报附件是否相等？   " + (previousAttachment == deepAttachment));
        System.out.println("周报名称是否相等？   " + (previousWeeklyLog.getName() == deepWeeklyLog.getName()));
        System.out.println("周报日期是否相等？   " + (previousWeeklyLog.getDate() == deepWeeklyLog.getDate()));
        System.out.println("周报内容是否相等？   " + (previousWeeklyLog.getContent() == deepWeeklyLog.getContent()));
    }
}
