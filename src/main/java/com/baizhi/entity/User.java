package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER25")
public class User {
    @Id
    @KeySql(sql = "select user25_seq.nextval from dual", order = ORDER.BEFORE)
    private Integer id;
    private String username;
    private String password;

}
