package com.enigma.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T1_POSITION")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mst_table")
    @SequenceGenerator(name = "seq_mst_table", sequenceName = "seq_mst_table", allocationSize = 1)
    private Integer id;
    private String code;
    private String name;
    private Integer isDelete;
    @OneToMany(mappedBy = "positionId")
    @JsonIgnore
    private List<Employee> employeeList;

    public Position(String code, String name, Integer isDelete) {
        this.code = code;
        this.name = name;
        this.isDelete = isDelete;
    }

    public Position() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
