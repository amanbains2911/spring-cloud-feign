/**
 * 
 */
package com.aman.feign.cloud.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.aman.feign.cloud.api.dto.UserResponse;

/**
 * @author amanb
 *
 */
@FeignClient(url="https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserClient {

	@GetMapping("/users")
	public List<UserResponse> getUsers();
}
