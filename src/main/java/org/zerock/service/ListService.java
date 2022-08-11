package org.zerock.service;

import java.util.Date;
import java.util.List;

import org.zerock.domain.todoListVO;

public interface ListService {

	public List<todoListVO> getList(String id, Date date);
	
	public List<todoListVO> getUncompletedList(String id, Date date);
	public List<todoListVO> getCompletedList(String id, Date date);
	
	public boolean insert(todoListVO list);
	
	public boolean delete(Long list_no);
	
	public boolean contentUpdate(todoListVO list);
	
	public boolean completedUpdate(todoListVO list);
	public boolean uncompletedUpdate(todoListVO list);
}
