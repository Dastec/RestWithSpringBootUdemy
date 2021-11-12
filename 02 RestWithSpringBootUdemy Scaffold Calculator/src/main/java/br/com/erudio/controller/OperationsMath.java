package br.com.erudio.controller;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class OperationsMath implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Double sum(double numberOne, double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public static Double sub(double numberOne, double numberTwo) {
		return numberOne - numberTwo;
	}
	
	public static Double mult(double numberOne, double numberTwo) {
		return numberOne * numberTwo;
	}
	
	public static Double div(double numberOne, double numberTwo) {
		return numberOne / numberTwo;
	}
	
	public static Double avg(double numberOne, double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}
	
	public static Double square(double number) {
		return Math.sqrt(number);
	}
}
