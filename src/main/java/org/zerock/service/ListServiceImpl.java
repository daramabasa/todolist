package org.zerock.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.todoListVO;
import org.zerock.mapper.ListMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class ListServiceImpl implements ListService {

	@Setter(onMethod_= @Autowired)
	private ListMapper mapper;
	
	@Override
	public List<todoListVO> getList(String id, Date date) {
		log.info("아이디의 전체 todoList를 들고 옵니다.");
		return mapper.getList(id, date);
	}

	@Override
	public List<todoListVO> getUncompletedList(String id, Date date) {
		log.info("완료되지 않은 todoList를 들고 옵니다.");
		return mapper.getUncompletedList(id, date);
	}

	@Override
	public List<todoListVO> getCompletedList(String id, Date date) {
		log.info("완료된 todoList를 들고 옵니다.");
		return mapper.getCompletedList(id, date);
	}

	@Override
	public boolean insert(todoListVO list) {
		log.info("todoList를 추가합니다.");
		
		return mapper.insert(list) == 1;
	}

	@Override
	public boolean delete(Long list_no) {
		log.info("todoList를 삭제합니다.");
		
		return mapper.delete(list_no) == 1;
	}

	@Override
	public boolean contentUpdate(todoListVO list) {
		log.info("todoList를 수정합니다.");
		
		return mapper.contentUpdate(list) == 1;
	}

	@Override
	public boolean completedUpdate(todoListVO list) {
		log.info("todoList를 완료했습니다.");
		
		return mapper.completedUpdate(list) == 1;
	}
	
	@Override
	public boolean uncompletedUpdate(todoListVO list) {
		log.info("todoList를 완료하지 못했습니다.");
		
		return mapper.uncompletedUpdate(list) == 1;
	}

}
