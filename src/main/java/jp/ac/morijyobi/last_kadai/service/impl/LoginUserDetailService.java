package jp.ac.morijyobi.last_kadai.service.impl;

import jp.ac.morijyobi.last_kadai.bean.dto.LoginUserDto;
import jp.ac.morijyobi.last_kadai.mapper.UsersMapper;
import jp.ac.morijyobi.last_kadai.security.LoginUserDetail;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginUserDetailService implements UserDetailsService {
    private final UsersMapper usersMapper;

    public LoginUserDetailService(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginUserDto user = usersMapper.selectUserByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException("ユーザが見つかりません。");
        }

        return new LoginUserDetail(user);
    }
}
