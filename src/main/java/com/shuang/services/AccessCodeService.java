package com.shuang.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.shuang.common.GlobalConstants.AccessCode;

@Service
public class AccessCodeService {
	
	@Value("${Roles}")
	private String accessRoles;

	public String getAccess(final String access) {
		String[] code = accessRoles.split(",");
		String value = "/error";
		for (int i = 0; i < code.length; i++) {
			if (code[i].equals(access)) {
				switch (i) {
				case (0): value = AccessCode.getKougarehome();
						 break;
				case (1): value = AccessCode.getResumeAccess();
						 break;
				default : value = "/Error";
						 break;
				}
				break;
			}
		}
		return value;
	}
	
	
}
