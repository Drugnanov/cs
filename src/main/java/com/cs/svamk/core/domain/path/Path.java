package com.cs.svamk.core.domain.path;

import com.cs.svamk.core.domain.EmployeeCompetence;
import com.cs.svamk.core.domain.base.BaseEntity;
import com.cs.svamk.core.domain.base.BaseId;
import com.cs.svamk.core.domain.event.SubCategory;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
//@Entity
//@Table(name = "PATHS")
//@SequenceGenerator(name = "SEQ_GEN", sequenceName = "PATH_SEQ", allocationSize = 1)
public class Path extends BaseId {

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    protected Date dueDate;

    @NotNull
    @Column(nullable = false)
    private PathState state;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    protected Date oneToOneDate;
}
