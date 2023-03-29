package com.abhi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class PlayerEntity {
	@Id
	private Integer player_id;
	private String player_name;
	private String player_role;
}
