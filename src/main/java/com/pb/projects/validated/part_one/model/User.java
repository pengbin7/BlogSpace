package com.pb.projects.validated.part_one.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author pengbin
 * @date 2020/7/20 16:34
 */
@Data
public class User {

    @NotBlank(message = "用户名不能为空")
    private String name;

    @NotBlank(message = "密码不能为空")
    private String password;

}
