package online.mctom.learn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * 习题资源表
 * @TableName exercises
 */
@Component
public class Exercise implements Serializable {
    /**
     * 
     */
    private Integer exerciseId;

    /**
     * 
     */
    private Integer sectionId;

    /**
     * 0为选择题
     */
    private Integer exerciseType;

    /**
     * 
     */
    private String exerciseQuestion;

    /**
     * 
     */
    private String exerciseOptions;

    /**
     * 
     */
    private String exerciseAnswer;

    /**
     * 
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getExerciseId() {
        return exerciseId;
    }

    /**
     * 
     */
    public void setExerciseId(Integer exerciseId) {
        this.exerciseId = exerciseId;
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
     * 0为选择题
     */
    public Integer getExerciseType() {
        return exerciseType;
    }

    /**
     * 0为选择题
     */
    public void setExerciseType(Integer exerciseType) {
        this.exerciseType = exerciseType;
    }

    /**
     * 
     */
    public String getExerciseQuestion() {
        return exerciseQuestion;
    }

    /**
     * 
     */
    public void setExerciseQuestion(String exerciseQuestion) {
        this.exerciseQuestion = exerciseQuestion;
    }

    /**
     * 
     */
    public String getExerciseOptions() {
        return exerciseOptions;
    }

    /**
     * 
     */
    public void setExerciseOptions(String exerciseOptions) {
        this.exerciseOptions = exerciseOptions;
    }

    /**
     * 
     */
    public String getExerciseAnswer() {
        return exerciseAnswer;
    }

    /**
     * 
     */
    public void setExerciseAnswer(String exerciseAnswer) {
        this.exerciseAnswer = exerciseAnswer;
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
        Exercise other = (Exercise) that;
        return (this.getExerciseId() == null ? other.getExerciseId() == null : this.getExerciseId().equals(other.getExerciseId()))
            && (this.getSectionId() == null ? other.getSectionId() == null : this.getSectionId().equals(other.getSectionId()))
            && (this.getExerciseType() == null ? other.getExerciseType() == null : this.getExerciseType().equals(other.getExerciseType()))
            && (this.getExerciseQuestion() == null ? other.getExerciseQuestion() == null : this.getExerciseQuestion().equals(other.getExerciseQuestion()))
            && (this.getExerciseOptions() == null ? other.getExerciseOptions() == null : this.getExerciseOptions().equals(other.getExerciseOptions()))
            && (this.getExerciseAnswer() == null ? other.getExerciseAnswer() == null : this.getExerciseAnswer().equals(other.getExerciseAnswer()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExerciseId() == null) ? 0 : getExerciseId().hashCode());
        result = prime * result + ((getSectionId() == null) ? 0 : getSectionId().hashCode());
        result = prime * result + ((getExerciseType() == null) ? 0 : getExerciseType().hashCode());
        result = prime * result + ((getExerciseQuestion() == null) ? 0 : getExerciseQuestion().hashCode());
        result = prime * result + ((getExerciseOptions() == null) ? 0 : getExerciseOptions().hashCode());
        result = prime * result + ((getExerciseAnswer() == null) ? 0 : getExerciseAnswer().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", exerciseId=").append(exerciseId);
        sb.append(", sectionId=").append(sectionId);
        sb.append(", exerciseType=").append(exerciseType);
        sb.append(", exerciseQuestion=").append(exerciseQuestion);
        sb.append(", exerciseOptions=").append(exerciseOptions);
        sb.append(", exerciseAnswer=").append(exerciseAnswer);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}