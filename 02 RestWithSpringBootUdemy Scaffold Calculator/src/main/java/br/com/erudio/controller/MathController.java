package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationException;

@RestController
public class MathController {

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET) // Default GET
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!MetodosMatematico.isNumeric(numberOne) || !MetodosMatematico.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}

		Double sum = OperationsMath.sum(MetodosMatematico.convertToDouble(numberOne), MetodosMatematico.convertToDouble(numberTwo));
		return sum;
	}

	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET) // Default GET
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!MetodosMatematico.isNumeric(numberOne) || !MetodosMatematico.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}

		Double sub = OperationsMath.sub(MetodosMatematico.convertToDouble(numberOne), MetodosMatematico.convertToDouble(numberTwo));
		return sub;
	}

	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET) // Default GET
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!MetodosMatematico.isNumeric(numberOne) || !MetodosMatematico.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}

		Double mult = OperationsMath.mult(MetodosMatematico.convertToDouble(numberOne), MetodosMatematico.convertToDouble(numberTwo));
		return mult;
	}

	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET) // Default GET
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!MetodosMatematico.isNumeric(numberOne) || !MetodosMatematico.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}

		Double div = OperationsMath.div(MetodosMatematico.convertToDouble(numberOne), MetodosMatematico.convertToDouble(numberTwo));
		return div;
	}

	@RequestMapping(value = "/square/{number}", method = RequestMethod.GET) // Default GET
	public Double square(@PathVariable("number") String number) throws Exception {
		if (!MetodosMatematico.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}

		Double square = OperationsMath.square(MetodosMatematico.convertToDouble(number));
		return square;
	}

	@RequestMapping(value = "/avg/{numberOne}/{numberTwo}", method = RequestMethod.GET) // Default GET
	public Double avg(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!MetodosMatematico.isNumeric(numberOne) || !MetodosMatematico.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}

		Double avg = OperationsMath.avg(MetodosMatematico.convertToDouble(numberOne), MetodosMatematico.convertToDouble(numberTwo));
		return avg;
	}

}
