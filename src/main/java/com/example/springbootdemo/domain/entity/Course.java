package com.example.springbootdemo.domain.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * course
 * @author 
 */
@Data
public class Course implements Serializable {
    private String cno;

    private String cname;

    private String tno;

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
        Course other = (Course) that;
        return (this.getCno() == null ? other.getCno() == null : this.getCno().equals(other.getCno()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCno() == null) ? 0 : getCno().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cno=").append(cno);
        sb.append(", cname=").append(cname);
        sb.append(", tno=").append(tno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}