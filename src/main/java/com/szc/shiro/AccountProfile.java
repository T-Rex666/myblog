package com.szc.shiro;/**
 * @author T-Rex
 * @date 2021/11/21 - 23:43
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @program:myblog
 *@description:
 *@author:31933
 @date:2021-11-21 23:43:50
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}