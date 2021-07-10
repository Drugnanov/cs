package com.cs.svamk.core.domain.role;

import com.cs.svamk.core.domain.agile.Squad;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "ROLE_SQUAD_MEMBERS")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "ROLE_SEQ", allocationSize = 1)
public class SquadMember extends Role {

    @NotNull
    @OneToOne
    @JoinColumn(name = "SQUAD_ID", nullable = false)
    protected Squad squad;
}
