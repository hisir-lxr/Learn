package online.mctom.learn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * 知识资源库表
 * @TableName resources
 */
@Component
public class Resource implements Serializable {
    /**
     * 
     */
    private Integer resourceId;

    /**
     * 
     */
    private Integer sectionId;

    /**
     * 
     */
    private String resourceType;

    /**
     * 
     */
    private String resourceTitle;

    /**
     * 
     */
    private String resourceContent;

    /**
     * 
     */
    private String resourceUrl;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private Date uploadTime;

    /**
     * 
     */
    private Integer resourceFlag;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * 
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * 
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * 
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * 
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 
     */
    public String getResourceTitle() {
        return resourceTitle;
    }

    /**
     * 
     */
    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle;
    }

    /**
     * 
     */
    public String getResourceContent() {
        return resourceContent;
    }

    /**
     * 
     */
    public void setResourceContent(String resourceContent) {
        this.resourceContent = resourceContent;
    }

    /**
     * 
     */
    public String getResourceUrl() {
        return resourceUrl;
    }

    /**
     * 
     */
    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
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
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * 
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * 
     */
    public Integer getResourceFlag() {
        return resourceFlag;
    }

    /**
     * 
     */
    public void setResourceFlag(Integer resourceFlag) {
        this.resourceFlag = resourceFlag;
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
        Resource other = (Resource) that;
        return (this.getResourceId() == null ? other.getResourceId() == null : this.getResourceId().equals(other.getResourceId()))
            && (this.getSectionId() == null ? other.getSectionId() == null : this.getSectionId().equals(other.getSectionId()))
            && (this.getResourceType() == null ? other.getResourceType() == null : this.getResourceType().equals(other.getResourceType()))
            && (this.getResourceTitle() == null ? other.getResourceTitle() == null : this.getResourceTitle().equals(other.getResourceTitle()))
            && (this.getResourceContent() == null ? other.getResourceContent() == null : this.getResourceContent().equals(other.getResourceContent()))
            && (this.getResourceUrl() == null ? other.getResourceUrl() == null : this.getResourceUrl().equals(other.getResourceUrl()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUploadTime() == null ? other.getUploadTime() == null : this.getUploadTime().equals(other.getUploadTime()))
            && (this.getResourceFlag() == null ? other.getResourceFlag() == null : this.getResourceFlag().equals(other.getResourceFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        result = prime * result + ((getSectionId() == null) ? 0 : getSectionId().hashCode());
        result = prime * result + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        result = prime * result + ((getResourceTitle() == null) ? 0 : getResourceTitle().hashCode());
        result = prime * result + ((getResourceContent() == null) ? 0 : getResourceContent().hashCode());
        result = prime * result + ((getResourceUrl() == null) ? 0 : getResourceUrl().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUploadTime() == null) ? 0 : getUploadTime().hashCode());
        result = prime * result + ((getResourceFlag() == null) ? 0 : getResourceFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceId=").append(resourceId);
        sb.append(", sectionId=").append(sectionId);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", resourceTitle=").append(resourceTitle);
        sb.append(", resourceContent=").append(resourceContent);
        sb.append(", resourceUrl=").append(resourceUrl);
        sb.append(", userId=").append(userId);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", resourceFlag=").append(resourceFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}