package com.zensar.olxadvertise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxadvertise.service.AdvertiseService;


@RestController
public class AdvertiseController {
	
	
	@Autowired
	AdvertiseService advertiseService;
	
	

}
