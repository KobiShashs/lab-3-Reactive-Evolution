package com.jb.demo3.services;

import com.jb.demo3.dto.Status;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

/**
 * Created by kobis on 26 Nov, 2022
 */
public interface StatusService {

    Status option1();
    Status option2() throws ExecutionException, InterruptedException;
    Mono<?> option3();

}
