package com.cws.springCloud.service;

import java.util.List;

import com.cws.springCloud.entites.Dept;



public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
