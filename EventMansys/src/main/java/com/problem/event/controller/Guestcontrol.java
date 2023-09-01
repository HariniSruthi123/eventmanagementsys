package com.problem.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.problem.event.entities.Guestentites;
import com.problem.event.service.Guestservice;

@RestController
public class Guestcontrol {
@Autowired
Guestservice guest;
@PostMapping("/addguest")
public Guestentites createGuestentites(@RequestBody Guestentites gues)
{
	return guest.addinfo(gues);
}
@GetMapping("/showguest")
public List<Guestentites>getAllGuestentites(){
	return guest.show();
}
@GetMapping("guestSort/{field}")
public List<Guestentites> sort(@PathVariable String field)
{
	return guest.sort(field);
}

@GetMapping("guestPage/{pno}/{psize}")
public List<Guestentites> sort(@PathVariable int pno, @PathVariable int psize)
{
	return guest.page(pno, psize);
}

@GetMapping("guestPageAndSort/{pno}/{psize}/{field}")
public List<Guestentites> pageAndSort(@PathVariable int pno, @PathVariable int psize , @PathVariable String field)
{
	return guest.pageAndSort(pno, psize, field);
}
}
