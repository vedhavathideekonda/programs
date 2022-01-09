package com.calculator.RestCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorSerivce {
	@GetMapping("/add/{x}/{y}")
	public Response add(@PathVariable int x, @PathVariable int y) {
		return new Response(x, y, x+y);
	}
	@GetMapping("/sub/{x}/{y}")
	public Response sub(@PathVariable int x, @PathVariable int y) {
		return new Response(x, y, x-y);
	}
	@GetMapping("/multiplication/{x}/{y}")
	public Response multiplication(@PathVariable int x, @PathVariable int y) {
		return new Response(x, y, x*y);
	}
	@GetMapping("/division/{x}/{y}")
	public Response division(@PathVariable int x, @PathVariable int y) {
		return new Response(x, y, x/y);
	}

}