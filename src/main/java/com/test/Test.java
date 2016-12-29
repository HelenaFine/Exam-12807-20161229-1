package com.test;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Film;
import com.dao.FilmDao;
import com.service.IFilmService;

public class Test {

	public static void main(String[] args) 
		
	{
		try {
			
			ConfigurableApplicationContext container = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			/*
			 * 获取对象
			 */
			container.start();
			FilmDao dao = (FilmDao)container.getBean("filmDao");
			Film film = (Film) container.getBean("film");
			IFilmService service = (IFilmService) container.getBean("filmService");
			
			
			/*
			 * 从控制台输入电影信息
			 */
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入电影名称（title）：");
			film.setTitle(scanner.nextLine());
			System.out.println("请输入电影描述（description）：");
			film.setDescription(scanner.nextLine());
			System.out.println("请输入语言（language_id）：");
			film.setLanguage_id(scanner.nextInt());
			
			service.insert(film);
			container.stop();
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
