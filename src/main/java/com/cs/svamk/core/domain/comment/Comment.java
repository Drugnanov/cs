package com.cs.svamk.core.domain.comment;

import com.cs.svamk.core.domain.EmployeeCompetence;
import com.cs.svamk.core.domain.base.BaseId;
import com.cs.svamk.core.domain.event.EntityType;
import com.cs.svamk.core.domain.role.Role;
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
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "COMMENTS")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "COMMENT_SEQ", allocationSize = 1)
public class Comment extends BaseId {

    @NotNull
    @Column(nullable = false)
    protected String text;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date created;

    @OneToMany(mappedBy = "comment")
    protected List<Note> notes;

    @NotNull
    @Column(nullable = false)
    protected EntityType entityType;

    @NotNull
    @Column(nullable = false)
    protected long entityId;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    protected Role user;
}
