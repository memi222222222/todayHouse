package com.today.house.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CpVO {

	private String cp_id;
	private String cp_pw;
	private String cp_name;
	private String cp_adr;
	private String cp_major1;
	private String cp_info;
	
	
	
	
	
}
