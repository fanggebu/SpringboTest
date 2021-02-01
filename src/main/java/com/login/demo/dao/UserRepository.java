package com.login.demo.dao;

import com.login.demo.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: Test
 * @Package: com.login.demo.dao
 * @ClassName: UserRepository
 * @Author: qiuhen
 * @Description: User操作接口
 * @Date: 2021/1/31 14:42
 * @Version: 1.0
 */
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from User u where u.username = ?1")
    User findByUsername(String username);

    @Query("select u from User u where u.id = ?1")
    User findById(String id);


    /*
    //当jpa提供的方法不能满足当前项目使用的时候自己写sql.

    @Query("select u from User u where u.emailAddress = ?1")
    User findByEmailAddress(String emailAddress);
    //如果是更新或者删除操作，方法上面要加@Modifying      默认开启的事务只是可读的，更新操作加入@Modifying 就会关闭可读
    @Modifying
    @Transactional
    @Query("update CardConfig  set cardStatus=?1 where  id in ?2")
    void updateCardStatus(Integer status, List<Integer> listIds);

    // @Param 代替参数占位符，  hql或者sql里就用  :firstname替换   方法里的参数顺序可以打乱
    @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
    User findByLastnameOrFirstname(@Param("lastname") String lastname,
                                   @Param("firstname") String firstname);

    //返回字段 组成新的entity返回 类名必须是全写的
    @Query(value="select new com.hikvision.metro.modules.repository.entity.CameraIndexs(c.preOneCameraIndexcode, c.preTwoCameraIndexcode, c.backOneCameraIndexcode) from StationDeviceConfig c")
    List<CameraIndexs> getAllCameraIndexs();

*/

}
