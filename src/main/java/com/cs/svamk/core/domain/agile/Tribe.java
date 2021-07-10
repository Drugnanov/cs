package com.cs.svamk.core.domain.agile;

import com.cs.svamk.core.domain.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "TRIBES")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "TRIBE_SEQ", allocationSize = 1)
public class Tribe extends BaseEntity {

    @OneToMany(mappedBy = "tribe")
    protected List<Squad> squads;
}
