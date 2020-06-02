package cn.sensor.dao;

import cn.sensor.domain.Message;
import cn.sensor.utils.JDBCUtils;
import jdk.internal.org.objectweb.asm.tree.InnerClassNode;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MessageDao {

    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    //根据id查询信息
    public Message findByID(int id) {
        try {
           String sql = "select * from userdata where id = ?";
           Message message = template.queryForObject(sql, new BeanPropertyRowMapper<Message>(Message.class),
                    id);

            return message;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
    //更新数据
    public int update(Message msg) {
        try {
//            String sql = "INSERT userdata VALUE=(id,heartRate,bloodOxygen,temprature)";
            String sql = "insert into userdata (id,heartRate,bloodOxygen,temprature) values (?,?,?,?)";
            int message=template.update(sql,msg.getId(),msg.getHeartrate(),msg.getBloodoxygen(),msg.getTemperature());
            return message;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }
    public List getAllMessage() {

        try {
            String sql = "select * from userdata";
            List list = template.queryForList(sql);
            return list;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getNewestId(){
        try {
            String sql = "select COUNT(*) from userdata";
            Integer newestID = template.queryForObject(sql, Integer.class);
            return newestID;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return Integer.parseInt(null);
        }
    }
}
