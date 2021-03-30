package edu.vinaenter.services;

import java.util.List;

public interface FootballService<T> {

	List<T> findAll();

	T findOne(T t);

	T findById(int id);

	int update(T e);

	int deleteById(int id);

	int save(T e);
}
