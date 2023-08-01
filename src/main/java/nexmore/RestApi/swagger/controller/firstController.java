package nexmore.RestApi.swagger.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import nexmore.RestApi.swagger.service.firstService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
@Api(tags = {"test"})
public class firstController {
	
	private final firstService firstService;
	
	@ApiOperation(value = "Test")
	@GetMapping("/test")
	public Map<String, Object> firstController() {
		 
		return firstService.getFirstData();
	}
	
}
