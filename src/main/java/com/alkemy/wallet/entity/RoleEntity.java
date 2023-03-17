package com.alkemy.wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles", schema = "JAVHASW1")
public class RoleEntity {

    @Id
    @Column(name = "ID_ROLE", nullable = false)
    @GeneratedValue
    private String roleId;
    @Column(name="NAME", nullable = false, length = 80 )
    @Enumerated(value = EnumType.STRING)
    private Roles name;
    public enum Roles{
        ADMIN,
        USER;
    }
    @Column(name = "DESCRIPTION", nullable = false, length = 100)
    private String description;


    @Column(name = "CREATION_DATE", updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp creationDate;

    @Column(name = "UPDATE_DATE", updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp updateDate;
}
