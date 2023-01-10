package com.szc.util;/**
 * @author T-Rex
 * @date 2021/11/22 - 9:04
 */

import com.szc.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @program:myblog
 *@description:
 *@author:31933
 @date:2021-11-22 09:04:28
 */
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
