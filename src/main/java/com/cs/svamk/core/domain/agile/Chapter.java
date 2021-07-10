package com.cs.svamk.core.domain.agile;

import com.cs.svamk.core.domain.base.BaseEntity;
import com.cs.svamk.core.domain.role.ChapterLeader;
import com.cs.svamk.core.domain.role.ChapterMember;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    @OneToOne(mappedBy = "chapter")
    protected ChapterLeader chapterLeader;

    @OneToMany(mappedBy = "chapter")
    protected List<ChapterMember> chapterMembers;
}
