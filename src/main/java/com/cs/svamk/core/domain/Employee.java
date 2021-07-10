package com.cs.svamk.core.domain;

import com.cs.svamk.core.domain.base.BaseEntity;
import com.cs.svamk.core.domain.base.BaseId;
import com.cs.svamk.core.domain.role.ChapterMember;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "EMPLOYEES")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "EMPLOYEE_SEQ", allocationSize = 1)
public class Employee extends BaseId {

    @NotNull
    @Column(nullable = false)
    protected String name;

    @NotNull
    @Column(nullable = false)
    protected String surname;

    @NotNull
    @Column(nullable = false)
    protected String email;

    @Column
    protected String externalId;

    @OneToMany(mappedBy = "employee")
    protected List<EmployeeCompetence> employeeCompetences;
}
