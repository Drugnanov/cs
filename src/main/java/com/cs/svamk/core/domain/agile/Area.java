package com.cs.svamk.core.domain.agile;

import com.cs.svamk.core.domain.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "AREAS")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "AREA_SEQ", allocationSize = 1)
public class Area extends BaseEntity {

    @OneToMany(mappedBy = "area")
    protected List<Chapter> chapters;
}
