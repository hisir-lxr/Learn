package online.mctom.learn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 课程表
 * @author hisir
 * @TableName courses
 */
@Component
public class Course implements Serializable {
    /**
     * 
     */
    private Integer courseId;

    /**
     * 
     */
    private String courseName;

    /**
     * 
     */
    private String courseDescription;

    /**
     * 
     */
    private String courseType;

    /**
     * 
     */
    private Integer courseDuration;

    private static final long serialVersionUID = 1L;

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

    /**
     * 
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * 
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * 
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * 
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    /**
     * 
     */
    public String getCourseType() {
        return courseType;
    }

    /**
     * 
     */
    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    /**
     * 
     */
    public Integer getCourseDuration() {
        return courseDuration;
    }

    /**
     * 
     */
    public void setCourseDuration(Integer courseDuration) {
        this.courseDuration = courseDuration;
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
        Course other = (Course) that;
        return (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getCourseDescription() == null ? other.getCourseDescription() == null : this.getCourseDescription().equals(other.getCourseDescription()))
            && (this.getCourseType() == null ? other.getCourseType() == null : this.getCourseType().equals(other.getCourseType()))
            && (this.getCourseDuration() == null ? other.getCourseDuration() == null : this.getCourseDuration().equals(other.getCourseDuration()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getCourseDescription() == null) ? 0 : getCourseDescription().hashCode());
        result = prime * result + ((getCourseType() == null) ? 0 : getCourseType().hashCode());
        result = prime * result + ((getCourseDuration() == null) ? 0 : getCourseDuration().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseId=").append(courseId);
        sb.append(", courseName=").append(courseName);
        sb.append(", courseDescription=").append(courseDescription);
        sb.append(", courseType=").append(courseType);
        sb.append(", courseDuration=").append(courseDuration);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}