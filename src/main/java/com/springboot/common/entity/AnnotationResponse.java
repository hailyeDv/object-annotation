package com.springboot.common.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnnotationResponse {

    private String method;

    private String annotation;

    private String text;

    // 생성 메서드
    public static AnnotationResponse of(String method, String annotation, String text) {
        AnnotationResponse annotationResponse = new AnnotationResponse();
        annotationResponse.setMethod(method);
        annotationResponse.setAnnotation(annotation);
        annotationResponse.setText(text);

        return annotationResponse;
    }
}
