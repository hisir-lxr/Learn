package online.mctom.learn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 学习记录表
 * @TableName learning_records
 */
@Component
public class LearningRecord implements Serializable {
    /**
     * 
     */
    private Integer recordId;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private Integer sectionId;

    /**
     * 
     */
    private Integer learningTime;

    /**
     * 
     */
    private Integer recordStatus;

    /**
     * 
     */
    private Integer score;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * 
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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
    public Integer getLearningTime() {
        return learningTime;
    }

    /**
     * 
     */
    public void setLearningTime(Integer learningTime) {
        this.learningTime = learningTime;
    }

    /**
     * 
     */
    public Integer getRecordStatus() {
        return recordStatus;
    }

    /**
     * 
     */
    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * 
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 
     */
    public void setScore(Integer score) {
        this.score = score;
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
        LearningRecord other = (LearningRecord) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSectionId() == null ? other.getSectionId() == null : this.getSectionId().equals(other.getSectionId()))
            && (this.getLearningTime() == null ? other.getLearningTime() == null : this.getLearningTime().equals(other.getLearningTime()))
            && (this.getRecordStatus() == null ? other.getRecordStatus() == null : this.getRecordStatus().equals(other.getRecordStatus()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getSectionId() == null) ? 0 : getSectionId().hashCode());
        result = prime * result + ((getLearningTime() == null) ? 0 : getLearningTime().hashCode());
        result = prime * result + ((getRecordStatus() == null) ? 0 : getRecordStatus().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append(", userId=").append(userId);
        sb.append(", sectionId=").append(sectionId);
        sb.append(", learningTime=").append(learningTime);
        sb.append(", recordStatus=").append(recordStatus);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}