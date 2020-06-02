package cn.sensor.test;
import cn.sensor.domain.JudgeMessage;
import cn.sensor.domain.Message;
import cn.sensor.dao.MessageDao;
import cn.sensor.dao.UserDao;
import cn.sensor.domain.User;
import com.sun.tracing.dtrace.ArgsAttributes;
import org.junit.Test;


public class UserdaoTest {
    @Test
    public void testLogin(){

        User loginuser = new User();
        loginuser.setUsername("admin");
        loginuser.setPassword("admin");
        UserDao dao= new UserDao();
        User user = dao.login(loginuser);
        System.out.println(user);
        MessageDao daom = new MessageDao();

        System.out.println(daom.getNewestId());
        int  id = daom.getNewestId();
        Message message=daom.findByID(id-1);
//        System.out.println(message.getBloodoxygen());
//        System.out.println(message.getHeartrate());
//        System.out.println(message.getTemperature());

        JudgeMessage judgeMessage=new JudgeMessage();
//        System.out.println(judgeMessage.judgeBloodOxygen(message));
//        System.out.println(judgeMessage.judgeheartRate(message));
//        System.out.println(judgeMessage.judgeTemprature(message));
//        System.out.println(judgeMessage.getAllSuggestion(message));
        System.out.println(message);
        System.out.println(judgeMessage.getAllSuggestion(message));
    }
}
