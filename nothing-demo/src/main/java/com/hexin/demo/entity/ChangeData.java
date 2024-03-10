package com.hexin.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;


/**
 * @author hex1n
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChangeData {
    private Map<String, Object> after;
    private Map<String, Object> source;
    private Map<String, Object> before;
}