package com.edu.Lambda.Consumer;

import java.util.function.*;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> {
			System.out.println(t + "출력함");
		};
		consumer.accept("메세지를 ");

		BiConsumer<Integer, Integer> biCon = (t, u) ->  {
             System.out.println("result =>" + (t+u));
			};
			biCon.accept(20, 40);
		}
	}

