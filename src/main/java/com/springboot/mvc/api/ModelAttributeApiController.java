package com.springboot.mvc.api;

import com.springboot.common.entity.AnnotationResponse;
import com.springboot.common.entity.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/annotation/modelAttributeTest")
public class ModelAttributeApiController {

    @GetMapping("/get")
    public ResponseEntity<AnnotationResponse> modelAttributeGet(@ModelAttribute Member member) {

        AnnotationResponse of = AnnotationResponse.of("Get", "@ModelAttribute", member.getUserId() + "를 아이디로 가진 " + member.getUsername());
        return ResponseEntity.ok(of);
    }

    @PostMapping("/post")
    public ResponseEntity<AnnotationResponse> modelAttributePost(@ModelAttribute Member member) {

        AnnotationResponse of = AnnotationResponse.of("Post", "@ModelAttribute", member.getUserId() + "를 아이디로 가진 " + member.getUsername());
        return ResponseEntity.ok(of);
    }

    @PutMapping("/put")
    public ResponseEntity<AnnotationResponse> modelAttributePut(@ModelAttribute Member member) {

        AnnotationResponse of = AnnotationResponse.of("Put", "@ModelAttribute", member.getUserId() + "를 아이디로 가진 " + member.getUsername());
        return ResponseEntity.ok(of);
    }
}
