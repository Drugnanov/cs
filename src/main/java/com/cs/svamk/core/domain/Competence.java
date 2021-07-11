package com.cs.svamk.core.domain;

import com.cs.svamk.core.domain.agile.Area;
import com.cs.svamk.core.domain.base.BaseEntity;
import com.cs.svamk.core.domain.comment.Comment;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "COMPETENCES")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "COMPETENCE_SEQ", allocationSize = 1)
public class Competence extends BaseEntity {

    @OneToMany(mappedBy = "competence")
    protected List<EmployeeCompetence> employeeCompetences;

    @OneToMany(mappedBy = "competence")
    protected List<Activity> activities;

    @OneToMany
    @JoinTable(
            name = "comments",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "entityId")
    )
    @WhereJoinTable(clause = "entity_type = 1")
    protected List<Comment> comments;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "AREA_ID", nullable = false)
    protected Area area;
}
