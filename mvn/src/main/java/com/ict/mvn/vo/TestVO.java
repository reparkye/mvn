package com.ict.mvn.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("test")
public class TestVO {
	private Integer tnum;
	private Integer tgae;
	private String tname;
	
	
}
