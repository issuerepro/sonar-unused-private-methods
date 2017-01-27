package org.example.sonar.test;

import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public class UnusedPrivateMethod2 {

	public static void main(String[] args) {
		new UnusedPrivateMethod2().branch();
	}

	private Supplier<Map<Boolean, BigDecimal>> branch() {
		return turnover(calculateTurnover(this::extractSourceBranches));
	}

	private Supplier<Map<Boolean, BigDecimal>> turnover(
	        Function<Double, BigDecimal> param1) {
		param1.toString();
		return () -> emptyMap();
	}

	private <APPORT, SRC> Function<APPORT, BigDecimal> calculateTurnover(
	        Function<APPORT, Set<SRC>> param1) {
		param1.toString();
		return x -> BigDecimal.ZERO;
	}

	private Set<Integer> extractSourceBranches(Double param) {
		param.toString();
		return emptySet();
	}
}
