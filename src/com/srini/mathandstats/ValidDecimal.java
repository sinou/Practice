package com.srini.mathandstats;

public class ValidDecimal {
	
	enum STATE {START, INTEGER, DECIMAL, UNKNOWN};
	
	public static void main(String args[]){
		System.out.println(isValidNumber("12132.3423"));
		System.out.println(isValidNumber("12132.3423."));
		System.out.println(isValidNumber("121323423"));
		System.out.println(isValidNumber("12132.3423.."));
		System.out.println(isValidNumber(".."));
	}
	
	public static boolean isValidNumber(String number){
		
		if(number.isEmpty()){
			return true;
		}
		int i = 0;
		if(number.charAt(0) == '+' || number.charAt(0) == '-'){
			i++;
		}
		STATE currentState = STATE.START;
		while(i < number.length()){
			currentState = whatAmI(currentState, number.charAt(i));
			i++;
		}
		if(currentState != STATE.UNKNOWN){
			return true;
		}
		return false;
		
	}
	
	public static STATE whatAmI(STATE currentState, char currChar){
		
		switch(currentState){
			case START:;
			case INTEGER:
				if(currChar >= '0' && currChar <= '9'){
					return STATE.INTEGER;
				}else if(currChar == '.'){
					return STATE.DECIMAL;
				}else{
					return STATE.UNKNOWN;
				}
			case DECIMAL:
				if(currChar >= '0' && currChar <= '9'){
					return STATE.DECIMAL;
				}else{
					return STATE.UNKNOWN;
				}
		}
		return STATE.UNKNOWN;
		
	}

}
