package prototype;

import java.io.*;
import java.util.Date;

/**
 * 被复制的对象与具体原型类的结合体
 */
public class WeeklyLog implements Serializable, Cloneable{

    private Attachment attachment;

    private String name;

    private Date date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected WeeklyLog clone() {
        System.out.println("调用浅clone方法");
        Object object = null;
        try {
            object = super.clone();
            return (WeeklyLog) object;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }

    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        System.out.println("调用深clone方法");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog) ois.readObject();
    }

}
