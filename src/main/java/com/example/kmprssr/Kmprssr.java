package com.example.kmprssr;

import java.util.function.Function;

import reactor.core.publisher.Flux;

public class Kmprssr implements Function<Flux<String>, Flux<String>> {

	private int i;

	@Override
	public Flux<String> apply(Flux<String> input) {
		i++;
		return input.map(s -> "Invocation " + i + s.replaceAll("[aeiouâãäåæèéêëıìíîïðñòóôõøùúûü]*", ""));
	}

}
