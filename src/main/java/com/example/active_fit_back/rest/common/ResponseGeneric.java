package com.example.active_fit_back.rest.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class ResponseGeneric<T> implements Serializable {

    private String code;

    private String message;

    private T data;

}
