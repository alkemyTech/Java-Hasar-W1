package com.alkemy.wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users", schema = "JAVHASW1")
public class User {

    @Id
    @Column(name = "ID_USER")
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "Role")
    @JoinColumn(name = "ID_ROLE_USER", referencedColumnName = "ID_ROLE")
    private UUID idUser;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    @Column(name = "ID_ROLE")
    @OneToOne(mappedBy = "ID_ROLE")
    private UUID roleId;
    @Column(name = "CREATION_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp creationDate;
    @Column(name = "UPDATE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp updateDate;
    @Column(name = "SOFT_DELETE")
    @SQLDelete(sql = "UPDATE User SET softDelete=true WHERE id = ?")
    private boolean softDelete = Boolean.FALSE;
}