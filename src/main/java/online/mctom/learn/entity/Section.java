package online.mctom.learn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 小节表
 * @TableName sections
 */
@Component
public class Section implements Serializable {
    /**
     * 
     */
    private Integer sectionId;

    /**
     * 
     */
    private String sectionName;

    /**
     * 
     */
    private Integer sectionOrder;

    /**
     * 
     */
    private Integer courseId;

    private static final long serialVersionUID = 1L;

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
    public String getSectionName() {
        return sectionName;
    }

    /**
     * 
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    /**
     * 
     */
    public Integer getSectionOrder() {
        return sectionOrder;
    }

    /**
     * 
     */
    public void setSectionOrder(Integer sectionOrder) {
        this.sectionOrder = sectionOrder;
    }

    /**
     * 
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * 
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
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
        Section other = (Section) that;
        return (this.getSectionId() == null ? other.getSectionId() == null : this.getSectionId().equals(other.getSectionId()))
            && (this.getSectionName() == null ? other.getSectionName() == null : this.getSectionName().equals(other.getSectionName()))
            && (this.getSectionOrder() == null ? other.getSectionOrder() == null : this.getSectionOrder().equals(other.getSectionOrder()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSectionId() == null) ? 0 : getSectionId().hashCode());
        result = prime * result + ((getSectionName() == null) ? 0 : getSectionName().hashCode());
        result = prime * result + ((getSectionOrder() == null) ? 0 : getSectionOrder().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sectionId=").append(sectionId);
        sb.append(", sectionName=").append(sectionName);
        sb.append(", sectionOrder=").append(sectionOrder);
        sb.append(", courseId=").append(courseId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}