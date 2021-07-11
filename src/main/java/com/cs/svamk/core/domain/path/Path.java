package com.cs.svamk.core.domain.path;

import com.cs.svamk.core.domain.base.BaseEntity;
import com.cs.svamk.core.domain.base.BaseId;
import com.cs.svamk.core.domain.role.ChapterMember;
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
@Table(name = "PATHS")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "PATH_SEQ", allocationSize = 1)
public class Path extends BaseEntity {

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    protected Date dueDate;

    @NotNull
    @Column(nullable = false)
    private PathState state;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    protected Date oneToOneDate;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "CHAPTER_MEMBER_ID", nullable = false)
    private ChapterMember chapterMember;

    @OneToMany(mappedBy = "path")
    protected List<PathItem> items;
}
