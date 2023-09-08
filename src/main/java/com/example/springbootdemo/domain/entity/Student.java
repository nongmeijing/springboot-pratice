package com.example.springbootdemo.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * student
 * @author 
 */
@Data
public class Student implements Serializable {
    private String sno;

    private String sname;

    private String ssex;

    private Date sbirthday;

    private String sclass;


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
        Student other = (Student) that;
        return (this.getSno() == null ? other.getSno() == null : this.getSno().equals(other.getSno()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getSsex() == null ? other.getSsex() == null : this.getSsex().equals(other.getSsex()))
            && (this.getSbirthday() == null ? other.getSbirthday() == null : this.getSbirthday().equals(other.getSbirthday()))
            && (this.getSclass() == null ? other.getSclass() == null : this.getSclass().equals(other.getSclass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getSsex() == null) ? 0 : getSsex().hashCode());
        result = prime * result + ((getSbirthday() == null) ? 0 : getSbirthday().hashCode());
        result = prime * result + ((getSclass() == null) ? 0 : getSclass().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sno=").append(sno);
        sb.append(", sname=").append(sname);
        sb.append(", ssex=").append(ssex);
        sb.append(", sbirthday=").append(sbirthday);
        sb.append(", sclass=").append(sclass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}