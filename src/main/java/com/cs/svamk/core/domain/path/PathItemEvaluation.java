package com.cs.svamk.core.domain.path;

import com.cs.svamk.core.domain.base.BaseId;
import com.cs.svamk.core.domain.role.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "PATH_ITEM_EVALUATIONS")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "PATH_ITEM_EVALUATION_SEQ", allocationSize = 1)
public class PathItemEvaluation extends BaseId {

    @NotNull
    @Column(nullable = false)
    protected Integer rating;

    @Column
    protected String description;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "PATH_ITEM_ID", nullable = false)
    private PathItem pathItem;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ROLE_ID", nullable = false)
    private Role role;
}
