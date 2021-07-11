package com.cs.svamk.core.domain.event;

import com.cs.svamk.core.domain.Employee;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "EVENTS")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "EVENT_SEQ", allocationSize = 1)
public class Event extends BaseId {

    @NotNull
    @Column(nullable = false)
    private Category category;

    @NotNull
    @Column(nullable = false)
    private SubCategory subCategory;

    @NotNull
    @Column(nullable = false)
    private EventType type;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date created;

    @NotNull
    @Column(nullable = false)
    protected String description;

    @NotNull
    @Column(nullable = false)
    protected boolean read = false;

    @NotNull
    @Column(nullable = false)
    protected boolean deleted = false;

    @NotNull
    @Column(nullable = false)
    protected EntityType entityType;

    @NotNull
    @Column(nullable = false)
    protected long entityId;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "SOURCE_ROLE_ID", nullable = false)
    protected Role sourceRole;

    @ManyToOne
    @JoinColumn(name = "CHANGE_ROLE_ID")
    protected Role changeRole;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID", nullable = false)
    protected Employee employee;

}
