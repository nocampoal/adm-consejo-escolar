package com.escolar.concejo.administracion.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolar.concejo.administracion.service.SchoolService;

@RestController
@CrossOrigin("*")
@RequestMapping("/school")
public class SchoolController {
	
	private static final Log log = LogFactory.getLog(SchoolController.class);
	
	@Autowired
	private SchoolService schoolService;

}
