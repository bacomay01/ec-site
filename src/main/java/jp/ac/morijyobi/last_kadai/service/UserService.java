package jp.ac.morijyobi.last_kadai.service;

import jp.ac.morijyobi.last_kadai.bean.entity.User;
import jp.ac.morijyobi.last_kadai.bean.form.UserForm;

public interface UserService {
    User userRegister(UserForm userForm);
}
