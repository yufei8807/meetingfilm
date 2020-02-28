package com.example.meeting.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
* 
* Created with IDEA
* @author:yif
* @Date:27/2/20 2:29 下午
* 
* */
@TableName(value = "mooc_backend_user_t")
public class MoocBackendUserT implements Serializable {
    /**
     * 主键编号
     */
    @TableId(value = "UUID", type = IdType.AUTO)
    private Integer uuid;

    /**
     * 用户账号
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @TableField(value = "user_pwd")
    private String userPwd;

    /**
     * 用户手机号
     */
    @TableField(value = "user_phone")
    private String userPhone;

    private static final long serialVersionUID = 1L;

    public static final String COL_UUID = "UUID";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_USER_PWD = "user_pwd";

    public static final String COL_USER_PHONE = "user_phone";

    /**
     * 获取主键编号
     *
     * @return UUID - 主键编号
     */
    public Integer getUuid() {
        return uuid;
    }

    /**
     * 设置主键编号
     *
     * @param uuid 主键编号
     */
    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取用户账号
     *
     * @return user_name - 用户账号
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户账号
     *
     * @param userName 用户账号
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户密码
     *
     * @return user_pwd - 用户密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置用户密码
     *
     * @param userPwd 用户密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 获取用户手机号
     *
     * @return user_phone - 用户手机号
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置用户手机号
     *
     * @param userPhone 用户手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", userName=").append(userName);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", userPhone=").append(userPhone);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MoocBackendUserT other = (MoocBackendUserT) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPwd() == null ? other.getUserPwd() == null : this.getUserPwd().equals(other.getUserPwd()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        return result;
    }
}