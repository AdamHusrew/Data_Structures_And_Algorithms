package com.cydeo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@EqualsAndHashCode
@Data
public class TNode {

    int value;
    TNode left,right;

    public TNode(int value) {
        this.value = value;
    }
}
