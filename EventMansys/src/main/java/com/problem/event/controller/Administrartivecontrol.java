package com.problem.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.problem.event.entities.Administrentities;
import com.problem.event.service.Administrativeservice;

@RestController
public class Administrartivecontrol {
@Autowired
Administrativeservice admin;
@PostMapping("/addadmin")
public Administrentities createAdministrentities(@RequestBody Administrentities admi)
{
	return admin.addinfo(admi);

}
@GetMapping("/showadmin")
public List<Administrentities> getAllAdministrentities(){
	return admin.show();
}
/*@GetMapping("adminSort/{field}")
public List<Administrentities> sort(@PathVariable String field)
{
	return admin.sort(field);
}*/

@GetMapping("adminPage/{pno}/{psize}")
public List<Administrentities> sort(@PathVariable int pno, @PathVariable int psize)
{
	return admin.page(pno, psize);
}

@GetMapping("adminPageAndSort/{pno}/{psize}/{field}")
public List<Administrentities>PageAndSort(@PathVariable int pno, @PathVariable int psize , @PathVariable String field)
{
	return admin.pageAndsort(pno, psize, field);
}
}
