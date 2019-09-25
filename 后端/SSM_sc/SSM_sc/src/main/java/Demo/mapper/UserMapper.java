package Demo.mapper;

import Demo.model.User;
import Demo.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Aug 06 20:21:23 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    List<User> findAll();  //查看所有数据

    User select(String uid);//通过uid查询用户

    void registerAutoLogin(@Param("uid") String uid, @Param("taken") String taken);
    User autoLogin(@Param("taken") String taken);
    //int updateuname(@Param("uname")String uname,@Param("uid")String uid);
    //int updateuimage(@Param("uimage")String uimage,@Param("uid")String uid);
    int updateUser(@Param("user")User user,@Param("uid")String uid);
}