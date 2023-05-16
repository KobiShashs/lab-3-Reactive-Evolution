package com.jb.demo3.controllers;

import com.jb.demo3.aop.Timed;
import com.jb.demo3.dto.Status;
import com.jb.demo3.services.StatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

/**
 * Created by kobis on 26 Nov, 2022
 */
@RestController
@RequestMapping("api/status")
@RequiredArgsConstructor
public class StatusController {

    private final StatusService statusService;

    @GetMapping("option1")
    public Status option1() {
        return statusService.option1();
    }

    @GetMapping("option2")
    public Status option2() throws ExecutionException, InterruptedException {
        return statusService.option2();
    }

    @GetMapping(value = "option3",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<?> option3() throws ExecutionException, InterruptedException {
        return statusService.option3();
    }
}
