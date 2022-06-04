package com.apache.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:start").id("camel-java-dsl-log").log("HELLO FROM ROUTE --- camel-java-dsl-log").end();

	}

}
