package org.example.sonar.test;

import static java.util.Collections.emptyList;

import java.util.List;

public class UnusedPrivateMethod {

	public static void main(String[] args) {
		List<String> data = emptyList();
		new UnusedPrivateMethod().execute(x -> data);
	}

	private <D, L extends List<D>> void execute(Callback2<L> extractor) {
		runQuery(rs -> write(extractor.doStuff(rs)));
	}

	private void runQuery(Callback1 rowHandler) {
		rowHandler.toString();
	}

	private <D, L extends List<D>> void write(L data) {
		data.toString();
	}

	private interface Callback1 {

		void doStuff(String rs);
	}

	private interface Callback2<T> {

		T doStuff(String rs);
	}
}
