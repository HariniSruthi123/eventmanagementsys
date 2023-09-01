package com.problem.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;

import com.problem.event.entities.Administrentities;
import com.problem.event.repository.Administrativerepo;


@Service
public class Administrativeservice {
@Autowired
Administrativerepo adminrep;
public Administrentities addinfo(Administrentities admin)
{
	return adminrep.save(admin);
	

}
public List<Administrentities>show()
{
	return adminrep.findAll();
} 
public Administrentities updateinfo(Administrentities admin) {
	return adminrep .saveAndFlush(admin);
	
}
public void delete(Administrentities admin) {
	adminrep.delete(admin); 
}
/*public List<Administrentities>sort()
{
	//Page<Administrentities> page= adminrep.findAll(Sort.by(field)); 
	re	turn adminrep.findAllByO
}*/
public List<Administrentities>page(int pno, int psize)
{
	Page<Administrentities> page=adminrep.findAll(PageRequest.of(pno, psize));
	return page.getContent();
}
public List<Administrentities>pageAndsort(int pno, int psize, String field)
{
	Page<Administrentities> page=adminrep.findAll(PageRequest.of(pno, psize, Sort.by(field)));
	return page.getContent();
}

}









