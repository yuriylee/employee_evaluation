package org.yu.entity;

import javax.persistence.*;

/**
 * Created by jokernoel on 25.03.18.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @SequenceGenerator(name = "users_id_seq", sequenceName = "users_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "users_id_seq", strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "family_name")
    private String familyName;
    @Column
    private String email;
    @Column(name = "salted_pwd_hash")
    private String saltedPwdHash;

    public String getEmail() {
        return email;
    }
}
