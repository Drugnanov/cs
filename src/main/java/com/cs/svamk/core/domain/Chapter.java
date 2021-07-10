package com.cs.svamk.core.domain;

import com.cs.svamk.core.domain.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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
@Table(name = "CHAPTERS")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "CHAPTER_SEQ", allocationSize = 1)
public class Chapter extends BaseEntity {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "AREA_ID")
    protected Area area;
}
