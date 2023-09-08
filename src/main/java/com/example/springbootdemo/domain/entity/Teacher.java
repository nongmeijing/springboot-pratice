package com.example.springbootdemo.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * teacher
 * @author 
 */
@Data
public class Teacher implements Serializable {
    private String tno;

    private String tname;

    private String tsex;

    private Date tbirthday;

    private String tprof;

    private String depart;

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
        Teacher other = (Teacher) that;
        return (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()))
            && (this.getTsex() == null ? other.getTsex() == null : this.getTsex().equals(other.getTsex()))
            && (this.getTbirthday() == null ? other.getTbirthday() == null : this.getTbirthday().equals(other.getTbirthday()))
            && (this.getTprof() == null ? other.getTprof() == null : this.getTprof().equals(other.getTprof()))
            && (this.getDepart() == null ? other.getDepart() == null : this.getDepart().equals(other.getDepart()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getTsex() == null) ? 0 : getTsex().hashCode());
        result = prime * result + ((getTbirthday() == null) ? 0 : getTbirthday().hashCode());
        result = prime * result + ((getTprof() == null) ? 0 : getTprof().hashCode());
        result = prime * result + ((getDepart() == null) ? 0 : getDepart().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tno=").append(tno);
        sb.append(", tname=").append(tname);
        sb.append(", tsex=").append(tsex);
        sb.append(", tbirthday=").append(tbirthday);
        sb.append(", tprof=").append(tprof);
        sb.append(", depart=").append(depart);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}