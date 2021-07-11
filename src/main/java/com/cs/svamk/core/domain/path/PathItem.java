package com.cs.svamk.core.domain.path;

import com.cs.svamk.core.domain.Activity;
import com.cs.svamk.core.domain.EmployeeCompetence;
import com.cs.svamk.core.domain.base.BaseId;
import com.cs.svamk.core.domain.role.ChapterMember;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "PATH_ITEMS")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "PATH_ITEM_SEQ", allocationSize = 1)
public class PathItem extends BaseId {

    @Column
    protected Integer weight;

    //ToDO change to more suitable progress information
    @NotNull
    @Column(nullable = false)
    private String progress;

    @NotNull
    @Column(nullable = false)
    protected boolean completed = false;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "PATH_ID", nullable = false)
    private Path path;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ACTIVITY_ID", nullable = false)
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_COMPETENCE_ID")
    private EmployeeCompetence employeeCompetence;

    @OneToMany(mappedBy = "pathItem")
    private List<PathItemEvaluation> evaluations;
}
