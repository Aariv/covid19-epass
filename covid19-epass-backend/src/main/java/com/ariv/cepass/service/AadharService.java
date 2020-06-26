/**
 * 
 */
package com.ariv.cepass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ariv.cepass.dto.AadharInfoDTO;

/**
 * @author al
 *
 */
@Service
public class AadharService {

	@Autowired
	RestTemplate restTemplate;
			
	public String validateAadhar(AadharInfoDTO aadharInfoDTO) {
		
		return "";
	}
}
