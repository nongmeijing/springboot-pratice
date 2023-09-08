package com.example.springbootdemo.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * score
 * @author 
 */
@Data
public class Score extends ScoreKey implements Serializable {
    private BigDecimal degree;

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
        Score other = (Score) that;
        return (this.getSno() == null ? other.getSno() == null : this.getSno().equals(other.getSno()))
            && (this.getCno() == null ? other.getCno() == null : this.getCno().equals(other.getCno()))
            && (this.getDegree() == null ? other.getDegree() == null : this.getDegree().equals(other.getDegree()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        result = prime * result + ((getCno() == null) ? 0 : getCno().hashCode());
        result = prime * result + ((getDegree() == null) ? 0 : getDegree().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", degree=").append(degree);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}