package online.mctom.learn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * 单独考试表
 * @TableName exams
 */
@Component
public class Exam implements Serializable {
    /**
     * 
     */
    private Integer examId;

    /**
     * 
     */
    private String examName;

    /**
     * 
     */
    private Integer courseId;

    /**
     * 
     */
    private Double examScore;

    /**
     * 
     */
    private Date examTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * 
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * 
     */
    public String getExamName() {
        return examName;
    }

    /**
     * 
     */
    public void setExamName(String examName) {
        this.examName = examName;
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

    /**
     * 
     */
    public Double getExamScore() {
        return examScore;
    }

    /**
     * 
     */
    public void setExamScore(Double examScore) {
        this.examScore = examScore;
    }

    /**
     * 
     */
    public Date getExamTime() {
        return examTime;
    }

    /**
     * 
     */
    public void setExamTime(Date examTime) {
        this.examTime = examTime;
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
        Exam other = (Exam) that;
        return (this.getExamId() == null ? other.getExamId() == null : this.getExamId().equals(other.getExamId()))
            && (this.getExamName() == null ? other.getExamName() == null : this.getExamName().equals(other.getExamName()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getExamScore() == null ? other.getExamScore() == null : this.getExamScore().equals(other.getExamScore()))
            && (this.getExamTime() == null ? other.getExamTime() == null : this.getExamTime().equals(other.getExamTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExamId() == null) ? 0 : getExamId().hashCode());
        result = prime * result + ((getExamName() == null) ? 0 : getExamName().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getExamScore() == null) ? 0 : getExamScore().hashCode());
        result = prime * result + ((getExamTime() == null) ? 0 : getExamTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", examId=").append(examId);
        sb.append(", examName=").append(examName);
        sb.append(", courseId=").append(courseId);
        sb.append(", examScore=").append(examScore);
        sb.append(", examTime=").append(examTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}