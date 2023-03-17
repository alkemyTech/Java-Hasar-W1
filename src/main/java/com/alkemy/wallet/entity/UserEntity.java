package com.alkemy.wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users", schema = "JAVHASW1")
public class UserEntity {

    @Id
    @Column(name = "ID_USER")
    @GeneratedValue
    private String idUser;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    @ManyToOne()
    @JoinColumn(name = "ID_ROLE")
    private RoleEntity roleId;
    @Column(name = "CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name = "UPDATE_DATE", nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp updateDate;
    @Column(name = "SOFT_DELETE")
    private boolean softDelete;
}