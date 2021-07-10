package com.cs.svamk.core.domain;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "ACTIVITIES")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "ACTIVITY_SEQ", allocationSize = 1)
public class Activity extends BaseEntity {

    @NotNull
    @Column(nullable = false)
    protected Integer weight;

    @Column
    protected String internalLink;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "COMPETENCE_ID", nullable = false)
    protected Competence competence;
}
