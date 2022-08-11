package org.zerock.mapper;

import java.util.Date;
import java.util.List;

import org.zerock.domain.todoListVO;

public interface ListMapper {

	public List<todoListVO> getList(String id, Date date);
	
	public List<todoListVO> getUncompletedList(String id, Date date);
	public List<todoListVO> getCompletedList(String id, Date date);
	
	public int insert(todoListVO list);
	
	public int delete(Long list_no);
	
	public int contentUpdate(todoListVO list);
	
	public int completedUpdate(todoListVO list);
	public int uncompletedUpdate(todoListVO list);
}
