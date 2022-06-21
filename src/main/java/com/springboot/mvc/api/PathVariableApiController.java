package com.springboot.mvc.api;

import com.springboot.common.entity.AnnotationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/annotation/pathVariable")
@RestController
public class PathVariableApiController {

    @GetMapping("/{value}")
    private ResponseEntity<AnnotationResponse> pathVariableGet(@PathVariable String value) {

        AnnotationResponse of = AnnotationResponse.of("Get", "@PathVariable", value);
        return ResponseEntity.ok(of);
    }

    @PostMapping("/{value}")
    private ResponseEntity<AnnotationResponse> pathVariablePost(@PathVariable String value) {

        AnnotationResponse of = AnnotationResponse.of("Post", "@PathVariable", value);
        return ResponseEntity.ok(of);
    }

    @PutMapping("/{value}")
    private ResponseEntity<AnnotationResponse> pathVariablePut(@PathVariable String value) {

        AnnotationResponse of = AnnotationResponse.of("Put", "@PathVariable", value);
        return ResponseEntity.ok(of);
    }
}
