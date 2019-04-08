package com.example.kmprssr;

import java.util.function.Function;

import reactor.core.publisher.Flux;

public class Kmprssr implements Function<Flux<String>, Flux<String>> {

	private int i;

	@Override
	public Flux<String> apply(Flux<String> input) {
		i++;
		return input
				.window(3)
				.concatMap(ss -> Flux.just("Invocation " + i + " " + ss.map(s -> s.replaceAll("[aeiouâãäåæèéêëıìíîïðñòóôõøùúûü]*", "")).reduce((a, b) -> a + " " + b)));
	}

}
