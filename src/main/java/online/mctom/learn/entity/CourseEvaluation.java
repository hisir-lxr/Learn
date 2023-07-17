package online.mctom.learn.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程评估表
 * @TableName course_evaluation
 */
public class CourseEvaluation implements Serializable {
    /**
     * 
     */
    private Integer evaluationId;

    /**
     * 
     */
    private Integer courseId;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private String evaluationResult;

    /**
     * 
     */
    private Date evaluationTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getEvaluationId() {
        return evaluationId;
    }

    /**
     * 
     */
    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
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
    public String getEvaluationResult() {
        return evaluationResult;
    }

    /**
     * 
     */
    public void setEvaluationResult(String evaluationResult) {
        this.evaluationResult = evaluationResult;
    }

    /**
     * 
     */
    public Date getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * 
     */
    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
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
        CourseEvaluation other = (CourseEvaluation) that;
        return (this.getEvaluationId() == null ? other.getEvaluationId() == null : this.getEvaluationId().equals(other.getEvaluationId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getEvaluationResult() == null ? other.getEvaluationResult() == null : this.getEvaluationResult().equals(other.getEvaluationResult()))
            && (this.getEvaluationTime() == null ? other.getEvaluationTime() == null : this.getEvaluationTime().equals(other.getEvaluationTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getEvaluationResult() == null) ? 0 : getEvaluationResult().hashCode());
        result = prime * result + ((getEvaluationTime() == null) ? 0 : getEvaluationTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", courseId=").append(courseId);
        sb.append(", userId=").append(userId);
        sb.append(", evaluationResult=").append(evaluationResult);
        sb.append(", evaluationTime=").append(evaluationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}