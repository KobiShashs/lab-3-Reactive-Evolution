package com.jb.demo3.clr;

import com.jb.demo3.models.Current;
import com.jb.demo3.models.Stock;
import com.jb.demo3.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created by kobis on 26 Nov, 2022
 */
@Component
@RequiredArgsConstructor
public class Init implements CommandLineRunner {


    private final RestTemplate restTemplate;

    @Value("${url.user}")
    private String urlUser;

    @Value("${url.current}")
    private String urlCurrent;

    @Value("${url.stock}")
    private String urlStock;
    @Override
    public void run(String... args) throws Exception {
        User user = restTemplate.getForObject(urlUser, User.class);
        System.out.println(user);

        Current current = restTemplate.getForObject(urlCurrent,Current.class);
        System.out.println(current);

        Stock[] stocks = restTemplate.getForObject(urlStock,Stock[].class);
        Arrays.stream(stocks).forEach(System.out::println);
    }
}
