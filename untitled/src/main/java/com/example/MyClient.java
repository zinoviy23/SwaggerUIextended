package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("https://loclahost:8080/aaa")
public interface MyClient {
    @Get("bbbb")
    void f();
}
