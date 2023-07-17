package online.mctom.learn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题表
 * @TableName questions
 */
@Component
public class Question implements Serializable {
    /**
     * 
     */
    private Integer questionId;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private String questionContent;

    /**
     * 
     */
    private Date questionTime;

    /**
     * 
     */
    private Integer questionStatus;

    /**
     * 
     */
    private String answerContent;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
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
    public String getQuestionContent() {
        return questionContent;
    }

    /**
     * 
     */
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    /**
     * 
     */
    public Date getQuestionTime() {
        return questionTime;
    }

    /**
     * 
     */
    public void setQuestionTime(Date questionTime) {
        this.questionTime = questionTime;
    }

    /**
     * 
     */
    public Integer getQuestionStatus() {
        return questionStatus;
    }

    /**
     * 
     */
    public void setQuestionStatus(Integer questionStatus) {
        this.questionStatus = questionStatus;
    }

    /**
     * 
     */
    public String getAnswerContent() {
        return answerContent;
    }

    /**
     * 
     */
    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
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
        Question other = (Question) that;
        return (this.getQuestionId() == null ? other.getQuestionId() == null : this.getQuestionId().equals(other.getQuestionId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getQuestionContent() == null ? other.getQuestionContent() == null : this.getQuestionContent().equals(other.getQuestionContent()))
            && (this.getQuestionTime() == null ? other.getQuestionTime() == null : this.getQuestionTime().equals(other.getQuestionTime()))
            && (this.getQuestionStatus() == null ? other.getQuestionStatus() == null : this.getQuestionStatus().equals(other.getQuestionStatus()))
            && (this.getAnswerContent() == null ? other.getAnswerContent() == null : this.getAnswerContent().equals(other.getAnswerContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getQuestionContent() == null) ? 0 : getQuestionContent().hashCode());
        result = prime * result + ((getQuestionTime() == null) ? 0 : getQuestionTime().hashCode());
        result = prime * result + ((getQuestionStatus() == null) ? 0 : getQuestionStatus().hashCode());
        result = prime * result + ((getAnswerContent() == null) ? 0 : getAnswerContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionId=").append(questionId);
        sb.append(", userId=").append(userId);
        sb.append(", questionContent=").append(questionContent);
        sb.append(", questionTime=").append(questionTime);
        sb.append(", questionStatus=").append(questionStatus);
        sb.append(", answerContent=").append(answerContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}