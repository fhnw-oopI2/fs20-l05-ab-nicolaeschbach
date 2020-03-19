package ch.fhnw.oop2.module05.streams.ab1;

import java.util.stream.Stream;

public class FibonacciSequence {

	public static void main(String[] args) {
		printFibonacci(10);
	}
	
	public static  Stream<Integer> streamFibonacci(){
		return Stream.iterate(new Tuple<Integer>(0, 1), t -> new Tuple<Integer>(t.t2,t.t1 + t.t2))
		.map( n -> n.t2);
	
	}

	public static void printFibonacci(int n) {
		streamFibonacci()
			.limit(n)
			.forEach(System.out::println);
	}
}
