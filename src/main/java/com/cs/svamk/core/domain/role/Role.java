package com.cs.svamk.core.domain.role;

import com.cs.svamk.core.domain.Employee;
import com.cs.svamk.core.domain.agile.Chapter;
import com.cs.svamk.core.domain.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "ROLES")
public abstract class Role extends BaseEntity {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID", nullable = false)
    protected Employee employee;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date validFrom;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    protected Date validTo;
}
