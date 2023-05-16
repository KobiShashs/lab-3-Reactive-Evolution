package com.jb.demo3.services;

import com.jb.demo3.dto.Status;
import com.jb.demo3.models.Current;
import com.jb.demo3.models.Stock;
import com.jb.demo3.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by kobis on 26 Nov, 2022
 */
@Service
@RequiredArgsConstructor
public class StatusServiceImpl implements StatusService {

    private final RestTemplate restTemplate;

    @Value("${url.user}")
    private String urlUser;

    @Value("${url.current}")
    private String urlCurrent;

    @Value("${url.stock}")
    private String urlStock;

    @Override
    public Status option1() {
        // Step 1: Implement synchronous solution
        // TODO: 27/11/2022 - code goes here

        return null;
    }

    @Override
    public Status option2() throws ExecutionException, InterruptedException {

        // Step 2: Implement asynchronous solution using completable future
        // TODO: 27/11/2022 - code goes here

        return null;
    }

    @Override
    public Mono<?> option3() {

        // Step 3: Implement non-blocking solution using Mono.Zip
        // TODO: 27/11/2022 - code goes here

        return null;

    }
}
