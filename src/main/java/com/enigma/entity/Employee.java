package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "T2_EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mst_table")
    @SequenceGenerator(name = "seq_mst_table", sequenceName = "seq_mst_table", allocationSize = 1)
    private Integer id;
    private String name;
    @JsonFormat(pattern = "YYYY-mm-DD")
    private Date birthDate;
    @Column(unique = true)
    private Integer idNumber;
    private Integer gender;
    private Integer isDelete;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position positionId;
    @Transient
    private Integer positionIdTransient;

    public Employee() {
    }

    public Employee(String name, Date birthDate, Integer idNumber, Integer gender, Integer isDelete) {
        this.name = name;
        this.birthDate = birthDate;
        this.idNumber = idNumber;
        this.gender = gender;
        this.isDelete = isDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public Integer getPositionIdTransient() {
        return positionIdTransient;
    }

    public void setPositionIdTransient(Integer positionIdTransient) {
        this.positionIdTransient = positionIdTransient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(birthDate, employee.birthDate) &&
                Objects.equals(idNumber, employee.idNumber) &&
                Objects.equals(gender, employee.gender) &&
                Objects.equals(isDelete, employee.isDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, idNumber, gender, isDelete);
    }
}
