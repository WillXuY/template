package org.willxu.template.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Date createTime;
    @Column(nullable = false)
    private Long createUser;

    private String fullName;

    private String nickName;

    public UserInfo() {}

    public UserInfo(@NotNull Long createUser, String fullName, String nickName) {
        this.createUser = createUser;
        this.createTime = Calendar.getInstance().getTime();
        this.fullName = fullName;
        this.nickName = nickName;
    }
}
