package com.example.kmprssr;

import java.util.function.Function;

import reactor.core.publisher.Flux;

public class Kmprssr implements Function<Flux<String>, Flux<String>> {

	@Override
	public Flux<String> apply(Flux<String> input) {
		return input.map(s -> s.replaceAll("[aeiouâãäåæèéêëıìíîïðñòóôõøùúûü]*", ""));
	}

}
