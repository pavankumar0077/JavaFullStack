package com.zensar.olxmasterdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxmasterdata.service.AdvertiseStatusService;


@RestController
public class AdvertiseStatusController {
	
	@Autowired
	AdvertiseStatusService advertiseStatusService;
	
}
