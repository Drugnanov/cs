package com.cs.svamk.core.domain.role;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@Table(name = "ROLE_ADMINS")
@SequenceGenerator(name = "SEQ_GEN", sequenceName = "ROLE_SEQ", allocationSize = 1)
public class Admin extends Role {
}
