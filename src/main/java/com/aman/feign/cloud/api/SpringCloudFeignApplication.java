package com.aman.feign.cloud.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.feign.cloud.api.client.UserClient;
import com.aman.feign.cloud.api.dto.UserResponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFeignApplication {
	
	@Autowired
	private UserClient client;
	
	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUsers(){
		return client.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}

}
