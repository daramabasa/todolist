package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class todoListVO {
	
	private int list_no;
	private String id;
	private String content;
	private char is_completed;
	private Date list_date;
}
