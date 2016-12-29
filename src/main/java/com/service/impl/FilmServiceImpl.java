package com.service.impl;

import org.mybatis.spring.SqlSessionTemplate;

import com.bean.Film;
import com.dao.FilmDao;
import com.event.AfterEventPublisher;
import com.event.BeforeEventPublisher;
import com.service.IFilmService;

public class FilmServiceImpl implements IFilmService{

	private SqlSessionTemplate sqlSessionTemplate;
	

	public void insert(Film film) {
	
		sqlSessionTemplate.insert("insertFilm",film);
		
	}


	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}


	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	

}
