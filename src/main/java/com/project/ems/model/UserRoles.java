package com.project.ems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRoles {

    private long UserId;

    private long RoleId;
}
