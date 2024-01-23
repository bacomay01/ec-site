package jp.ac.morijyobi.last_kadai.mapper;

import jp.ac.morijyobi.last_kadai.bean.dto.LoginUserDto;
import org.apache.ibatis.annotations.Select;

public interface UsersMapper {

    @Select("SELECT u.id, u.username, u.password, u.name, u.authority " +
            "FROM users AS u" +
            "INNER JOIN authorities AS a ON a.id = u.authorities_id" +
            "WHERE u.username = #{username}")
    LoginUserDto selectUserByUserName(String username);
}
