package com.example.springbootdemo.domain.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * score
 * @author 
 */
@Data
public class ScoreKey implements Serializable {
    private String sno;

    private String cno;

    private static final long serialVersionUID = 1L;

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
        ScoreKey other = (ScoreKey) that;
        return (this.getSno() == null ? other.getSno() == null : this.getSno().equals(other.getSno()))
            && (this.getCno() == null ? other.getCno() == null : this.getCno().equals(other.getCno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        result = prime * result + ((getCno() == null) ? 0 : getCno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sno=").append(sno);
        sb.append(", cno=").append(cno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}