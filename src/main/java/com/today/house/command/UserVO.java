package com.today.house.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserVO {

	private String user_id;
	private String user_pw;
	private String user_email;
	
	
}
