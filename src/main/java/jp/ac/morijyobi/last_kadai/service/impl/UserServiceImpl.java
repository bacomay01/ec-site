package jp.ac.morijyobi.last_kadai.service.impl;

import jp.ac.morijyobi.last_kadai.bean.entity.User;
import jp.ac.morijyobi.last_kadai.bean.form.UserForm;
import jp.ac.morijyobi.last_kadai.constants.AccountRoleConstants;
import jp.ac.morijyobi.last_kadai.mapper.UsersMapper;
import jp.ac.morijyobi.last_kadai.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UsersMapper usersMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UsersMapper usersMapper, PasswordEncoder passwordEncoder) {
        this.usersMapper = usersMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User userRegister(UserForm userForm) {
        User user = new User();
        user.setUsername(userForm.getUsername());
        String hashedPassword = passwordEncoder.encode(userForm.getPassword());
        user.setPassword(hashedPassword);
        user.setName(userForm.getName());
        user.setAuthorityId(AccountRoleConstants.GENERAL);

        usersMapper.insertUser(user);

        return user;
    }
}
