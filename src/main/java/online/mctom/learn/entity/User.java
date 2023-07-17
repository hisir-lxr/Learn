package online.mctom.learn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * @TableName users
 */

@Component
public class User implements Serializable {
    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private Integer userAge;

    /**
     * 
     */
    private String userGender;

    /**
     * 
     */
    private String userEmail;

    /**
     * 
     */
    private String userPhone;

    /**
     * 
     */
    private Integer userStatus;

    /**
     * 
     */
    private String userAccount;

    /**
     * 
     */
    private String userPwd;

    /**
     * 
     */
    private String salt;

    /**
     * 
     */
    private Date createTime;

    /**
     *  1为管理员 0为普通用户
     */
    private Integer adminFlag;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * 
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * 
     */
    public String getUserGender() {
        return userGender;
    }

    /**
     * 
     */
    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    /**
     * 
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  1为管理员 0为普通用户
     */
    public Integer getAdminFlag() {
        return adminFlag;
    }

    /**
     *  1为管理员 0为普通用户
     */
    public void setAdminFlag(Integer adminFlag) {
        this.adminFlag = adminFlag;
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserAge() == null ? other.getUserAge() == null : this.getUserAge().equals(other.getUserAge()))
            && (this.getUserGender() == null ? other.getUserGender() == null : this.getUserGender().equals(other.getUserGender()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getUserPwd() == null ? other.getUserPwd() == null : this.getUserPwd().equals(other.getUserPwd()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAdminFlag() == null ? other.getAdminFlag() == null : this.getAdminFlag().equals(other.getAdminFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserAge() == null) ? 0 : getUserAge().hashCode());
        result = prime * result + ((getUserGender() == null) ? 0 : getUserGender().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAdminFlag() == null) ? 0 : getAdminFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userAge=").append(userAge);
        sb.append(", userGender=").append(userGender);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", salt=").append(salt);
        sb.append(", createTime=").append(createTime);
        sb.append(", adminFlag=").append(adminFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}