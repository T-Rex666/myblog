package com.szc.common.dto;/**
 * @author T-Rex
 * @date 2021/11/22 - 8:44
 */

import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @program:myblog
 *@description:
 *@author:31933
 @date:2021-11-22 08:44:11
 */
@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
