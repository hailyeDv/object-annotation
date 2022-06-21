package com.springboot.mvc.api;

import com.springboot.common.entity.AnnotationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/annotation/requestParam")
public class RequestParamApiController {

    @GetMapping
    public ResponseEntity<AnnotationResponse> requestParamGet(@RequestParam("annotation") String annotation,
                                                              @RequestParam("text") String text) {

        AnnotationResponse of = AnnotationResponse.of("Get", annotation, text);
        return ResponseEntity.ok(of);
    }

    @PostMapping
    public ResponseEntity<AnnotationResponse> requestParamPost(@RequestParam("annotation") String annotation,
                                                               @RequestParam("text") String text) {

        AnnotationResponse of = AnnotationResponse.of("Post", annotation, text);
        return ResponseEntity.ok(of);
    }

    @PutMapping
    public ResponseEntity<AnnotationResponse> requestParamPut(@RequestParam("annotation") String annotation,
                                                               @RequestParam("text") String text) {

        AnnotationResponse of = AnnotationResponse.of("Put", annotation, text);
        return ResponseEntity.ok(of);
    }
}
