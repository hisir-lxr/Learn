package online.mctom.learn.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 登录凭证表
 * @TableName login_tickets
 */
public class LoginTicket implements Serializable {
    /**
     * 
     */
    private Integer loginId;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private String ticket;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private Date expired;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * 
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

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
    public String getTicket() {
        return ticket;
    }

    /**
     * 
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     */
    public Date getExpired() {
        return expired;
    }

    /**
     * 
     */
    public void setExpired(Date expired) {
        this.expired = expired;
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
        LoginTicket other = (LoginTicket) that;
        return (this.getLoginId() == null ? other.getLoginId() == null : this.getLoginId().equals(other.getLoginId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTicket() == null ? other.getTicket() == null : this.getTicket().equals(other.getTicket()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getExpired() == null ? other.getExpired() == null : this.getExpired().equals(other.getExpired()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoginId() == null) ? 0 : getLoginId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTicket() == null) ? 0 : getTicket().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getExpired() == null) ? 0 : getExpired().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginId=").append(loginId);
        sb.append(", userId=").append(userId);
        sb.append(", ticket=").append(ticket);
        sb.append(", status=").append(status);
        sb.append(", expired=").append(expired);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}