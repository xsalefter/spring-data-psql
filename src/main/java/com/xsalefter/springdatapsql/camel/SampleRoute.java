package com.xsalefter.springdatapsql.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet");

        rest("/cameldsl").
            get("/hello").
            to("file://user/xsalefter/camel.txt");
    }

}
