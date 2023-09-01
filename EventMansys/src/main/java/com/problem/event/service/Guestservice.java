package com.problem.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.problem.event.entities.Guestentites;
import com.problem.event.repository.Guestrepo;

@Service
public class Guestservice {
@Autowired
Guestrepo guesrep;
public Guestentites addinfo(Guestentites guest)
{
	return guesrep.save(guest);
}
public List<Guestentites>show()
{
	return guesrep.findAll();
}
public List<Guestentites> sort(String s)
{
	return guesrep.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
}

public List<Guestentites> page(int pageno, int pagesize)
{
	Page<Guestentites> page= guesrep.findAll(PageRequest.of(pageno,pagesize));
	return page.getContent();
}

	
public List<Guestentites> pageAndSort(int pageno, int pagesize, String field)
{
	Page<Guestentites> page= guesrep.findAll(PageRequest.of(pageno,pagesize,Sort.by(field)));
	return page.getContent();
}
}
