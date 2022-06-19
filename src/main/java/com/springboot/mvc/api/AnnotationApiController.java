package com.springboot.mvc.api;

import com.springboot.common.entity.AnnotationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/annotation")
public class AnnotationApiController {

    @GetMapping("/requestParam")
    public ResponseEntity<AnnotationResponse> requestParamGet(@RequestParam("annotation") String annotation,
                                                              @RequestParam("text") String text) {

        AnnotationResponse of = AnnotationResponse.of("Get", annotation, text);
        return ResponseEntity.ok(of);
    }

    @PostMapping("/requestParam")
    public ResponseEntity<AnnotationResponse> requestParamPost(@RequestParam("annotation") String annotation,
                                                               @RequestParam("text") String text) {

        AnnotationResponse of = AnnotationResponse.of("Post", annotation, text);
        return ResponseEntity.ok(of);
    }

    @PutMapping("/requestParam")
    public ResponseEntity<AnnotationResponse> requestParamPut(@RequestParam("annotation") String annotation,
                                                               @RequestParam("text") String text) {

        AnnotationResponse of = AnnotationResponse.of("Put", annotation, text);
        return ResponseEntity.ok(of);
    }
}
