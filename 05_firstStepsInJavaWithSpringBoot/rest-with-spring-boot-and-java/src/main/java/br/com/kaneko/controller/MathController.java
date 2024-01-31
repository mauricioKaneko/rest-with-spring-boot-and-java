package br.com.kaneko.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.kaneko.exceptions.UnsupportedMathOperationException;
import br.com.kaneko.math.SimpleMath;
import br.com.kaneko.utils.NumberConverter;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value="numberOne") String numberOne,
			          @PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
			
		}
		return math.sum(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}

	@GetMapping("/subtract/{numberOne}/{numberTwo}")
	public Double subtract(@PathVariable(value="numberOne") String numberOne,
			          @PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
			
		}
		return math.subtract(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	} 
	
	@GetMapping("/multiply/{numberOne}/{numberTwo}")
	public Double multiply(@PathVariable(value="numberOne") String numberOne,
			          @PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
			
		}
		return math.multiply(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable(value="numberOne") String numberOne,
			          @PathVariable(value="numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
			
		}
		return math.multiply(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	

	


}
