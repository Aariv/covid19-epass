package com.ariv.cepass.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ariv.cepass.dto.AadharInfoDTO;
import com.ariv.cepass.service.AadharService;

/**
 * 
 * @author Ariv
 *
 */
@RestController
@RequestMapping("api/v1")
public class PassRequestResource {

	@Autowired
	AadharService aadharService;

	@PostMapping("/verifyAadhar")
	public ResponseEntity<String> validateAadhar(@RequestBody AadharInfoDTO aadharInfoDTO) {
		String body = aadharService.validateAadhar(aadharInfoDTO);
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
}
